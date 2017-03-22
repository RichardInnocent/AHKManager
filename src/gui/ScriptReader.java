package gui;

import java.io.File;
import java.util.*;

public class ScriptReader {
	
	private static List<File> files = new ArrayList<File>();
	
	static {
		getFilesAtBase();
	}
	
	/**
	 * Returns the {@code ArrayList} of files at the base directory.
	 * @return A {@code List} of {@code Files} that are either directories or are files with the
	 * {@code ahk} extension.
	 */
	public static List<File> getFilesAtBase() {
		files.clear();
		File scriptBase = new File(FileLocations.SCRIPT_BASE.toString());
		File [] filesInDirectory = scriptBase.listFiles();
		
		for (File file : filesInDirectory) {
			
			if (file.isDirectory() || file.getName().endsWith(".ahk")) {
				files.add(file);
			}
		}
		return files;
	}
	
}
