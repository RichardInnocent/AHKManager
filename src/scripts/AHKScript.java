package scripts;

import java.io.File;
import java.io.FileNotFoundException;

public class AHKScript extends AHKFile {
	
	// TODO: Remove silly name.
	String description = "A script";
	
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
	}
	
	/**
	 * Gets the description for the script.
	 * @return The description for the script.
	 */
	public String getDescription() {
		return description;
	}
	
}
