package org.richardinnocent.ahkmanager.scripts;

import java.io.*;
import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.richardinnocent.ahkmanager.flow.Execution;

public class AHKScript extends AHKFile {

	private static final Logger LOGGER = LogManager.getLogger(AHKScript.class);

	// TODO: Remove silly name.
	private final String name;
	private final String path;

	private boolean active;

	private String description = "A script",
			commentFlag = ";";

	private List<Hotkey> hotkeys = new ArrayList<>();


	/**
	 * Creates an {@code AHKScript}.
	 * @param file The script file.
	 * @throws FileNotFoundException If the given file is not found.
	 * @throws IllegalArgumentException If the given file is a directory.
	 */
	public AHKScript(File file) throws FileNotFoundException, IllegalArgumentException {
		if (!file.exists()) {
			throw new FileNotFoundException("Could not find file " + file.getAbsolutePath());
		} else if (file.isDirectory()) {
			throw new IllegalArgumentException(file.getAbsolutePath() + " is a directory");
		} else {
			this.file = file;
			this.name = file.getName();
			this.path = file.getAbsolutePath();
		}
		parse();
	}

	/**
	 * Gets the description for the script.
	 * @return The description for the script.
	 */
	public String getDescription() {
		return description;
	}
	// /** adacacacac */
	private void parse() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			String currentLine = "",
					description = "",
					code = "";

			// The flag that says whether this function is currently processing a description.
			boolean processingDesc = false,
					processingComment = false;

			// Reading in the file
			try {
				lines: while ((currentLine = reader.readLine()) != null) {

					// Whole line is a comment so can be ignored
					if (currentLine.startsWith(commentFlag))
						continue;

					// Looping characters in line
					chars: for (int i = 0; i < currentLine.length(); i++) {

						// Cutting string to this character onwards
						String characters = currentLine.substring(i);

						// If processing comment
						if (processingComment) {

							if (characters.startsWith("*/")) {
								processingComment = processingDesc = false;
								i++; // Ignore the second forward slash so that something like */*
								// doesn't trigger another comment
							} else if (processingDesc) {
								description += characters.charAt(0);
							}

						// If not processing comment
						} else {

							// If single line comment then rest of line can be ignored
							if (characters.startsWith("\t") || characters.startsWith(" ")) {
								if (characters.substring(1).startsWith(commentFlag)) {
									continue lines;
								}
								// If it's whitespace, we can move on without processing any more
								// checks.
								continue chars;
							}

							// If a new multi-line comment is beginning...
							if (characters.startsWith("/*")) {
								processingComment = true;

								// If a new description is starting...
								if (characters.startsWith("/**")) {
									// Set the old description to blank
									description = "";

									processingDesc = true;

									// Stop the ** being processed as part of the description
									i += 2;
								}
							// We are processing code
							} else {
								code += characters.charAt(0);
							}
						}
					}

					// Once the line has been processed...

					// Check if the code contained a hotkey
					if (code.contains("::")) {
						String [] components = code.split("::");
						hotkeys.add(new Hotkey(description.trim(), components[0].trim()));

					// Check if the code contains a comment flag modification
					} else if (code.toLowerCase().contains("#commentflag\\S+")) {
						int commentFlagIndex = code.indexOf('#');
						if (code.substring(commentFlagIndex).toLowerCase().
								startsWith("#commentflag")) {
							commentFlag = code.substring(commentFlagIndex +
									"#commentflag".length()).trim();
						}
					}

					// Reset code
					code = "";

				}
			} catch (IOException e) {
				Execution.error(LOGGER, "AHKScript could not be read at\n" + file.getAbsolutePath(), e);
			}

		} catch (FileNotFoundException e) {
			Execution.error(LOGGER, "AHKScript not found at " + file.getAbsolutePath(), e);
		}
	}

}
