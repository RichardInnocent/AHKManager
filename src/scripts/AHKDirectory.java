package scripts;

import java.io.*;
import java.util.*;

import gui.Messenger;

public class AHKDirectory extends AHKFile {
	
	List<AHKFile> ahkFiles = new ArrayList<>(); // Contains all AHK files in directory

	/**
	 * Creates a directory and finds all {@code AHKFile}s contained within.
	 * @param file The directory.
	 * @throws FileNotFoundException If the given file is not found.
	 * @throws IllegalArgumentException If the given file is not a directory.
	 */
	public AHKDirectory(File file) throws FileNotFoundException, IllegalArgumentException {
		if (!file.exists()) {
			throw new FileNotFoundException("Could not find file " + file.getAbsolutePath());
		} else if (!file.isDirectory()) {
			throw new IllegalArgumentException(file.getAbsolutePath() + " is not a directory");
		} else {
			this.file = file;
			refreshDirectory();
		}
	}
	
	/**
	 * Searches the directory for {@code AHKFile}s.
	 */
	public void refreshDirectory() {
		for (File fileInDirectory : file.listFiles()) {
			if (fileInDirectory.isDirectory()) {
				try {
					ahkFiles.add(new AHKDirectory(fileInDirectory));
				} catch (FileNotFoundException e) {
					Messenger.showError(e.toString());
				}
			} else if(fileInDirectory.getName().endsWith(".ahk")) {
				try {
					ahkFiles.add(new AHKScript(fileInDirectory));
				} catch (FileNotFoundException e) {
					Messenger.showError(e.toString());
				}
			}
		}
	}
	
	/**
	 * Gets all of the {@code AHKFile}s within the directory.
	 * @return A {@code List} of all {@code AHKFile}s within the directory.
	 */
	public List<AHKFile> getFiles() {
		return ahkFiles;
	}
	
}
