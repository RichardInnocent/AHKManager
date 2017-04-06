package scripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AHKScript extends AHKFile {
	
	// TODO: Remove silly name.
	String description = "A script";
	String descBeginFlag = "/**";
	String descEndFlag = "*/";
	
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
	
	private void parse() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String currentLine = "",
					description = "";
			
			// The flag that says whether this function is currently processing a description.
			boolean processingDesc = false;
			
			// Reading in the file
			try {
				while ((currentLine = reader.readLine()) != null) {
					
				}
			} catch (IOException e) {
				gui.Messenger.showError("AHKScript could not be read at\n" +
						file.getAbsolutePath(), e);
			}
			
		} catch (FileNotFoundException e) {
			gui.Messenger.showError("AHKScript not found at " + file.getAbsolutePath(), e);
		}
	}
	
	/**
	 * Takes a line of AutoHotkey code and determines whether it contains a hotkey declaration.
	 * @param codeLine The line of AutoHotkey code.
	 * @return {@code true} if the code contains a hotkey declaration
	 */
	private boolean declaresHotkey(String codeLine) {
		if (codeLine.contains("::"))
			return true;
		return false;
	}
	
}
