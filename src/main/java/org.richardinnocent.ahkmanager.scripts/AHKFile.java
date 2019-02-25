package org.richardinnocent.ahkmanager.scripts;

import java.io.File;
import java.io.Serializable;

public abstract class AHKFile implements Serializable {

	protected File file;

	/**
	 * Returns the file path of the file.
	 * @return The file path.
	 */
	public String getFilePath() {
		return file.getPath();
	}

	/**
	 * Returns the name of the file.
	 * @return The name of the file.
	 */
	public String getFileName() {
		return file.getName();
	}

	/**
	 * Returns whether or not this {@code AHKFile} is a script or a directory.
	 * @return {@code true} if {@code AHKFile} is a script.
	 */
	public boolean isScript() {
		return this instanceof AHKScript;
	}

	@Override
	public String toString() {
		return getFileName();
	}

}
