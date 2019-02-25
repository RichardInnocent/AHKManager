package org.richardinnocent.ahkmanager.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Contains details of the resources required for this application.
 * @author RichardInnocent
 */
public enum Resources {
  FXML_DIR("fxml", true, true),
  HOME_FXML("home.fxml", false, true, FXML_DIR),

  CONFIG_DIR("config", true, false),
  CONFIG_FILE("application.properties", false, false, CONFIG_DIR);

  private static final ClassLoader CLASS_LOADER = Resources.class.getClassLoader();

  private final String fileName;
  private final boolean isDirectory;
  private final boolean isInJar;
  private final Resources parent;

  private String fullPath;

  Resources(String fileName, boolean isDirectory, boolean isInJar) {
    this(fileName, isDirectory, isInJar, null);
  }

  Resources(String fileName, boolean isDirectory, boolean isInJar, Resources parent) {
    this.fileName = fileName;
    this.isDirectory = isDirectory;
    this.isInJar = isInJar;
    this.parent = parent;
  }

  /**
   * Gets the file name, including the extension.
   * @return The file name, including the extension.
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Gets the relative file path, plus the file name that can be seen by the class loaders.
   * @return The relative file path.
   */
  public String getFullPath() {
    if (fullPath == null)
      fullPath = parent == null ? fileName : parent.getFullPath() + "/" + fileName;
    return fullPath;
  }

  /**
   * Returns whether or not this resource is a directory.
   * @return {@code true} if this is a directory.
   */
  public boolean isDirectory() {
    return isDirectory;
  }

  /**
   * Returns whether the resource is in or outside of the jar package.
   * @return {@code true} if the resource is contained within the jar.
   */
  public boolean isInJar() {
    return isInJar;
  }

  /**
   * Gets the parent, i.e. the directory above in the file structure.
   * @return The parent.
   */
  public Resources getParent() {
    return parent;
  }

  /**
   * Creates a new {@code InputStream} for this resource.
   * @return A new {@code InputStream} for this resource.
   * @throws FileNotFoundException Thrown if the file cannot be found.
   */
  public InputStream createInputStream() throws FileNotFoundException {
    if (isInJar) {
      InputStream inputStream = CLASS_LOADER.getResourceAsStream(getFullPath());
      if (inputStream == null)
        throw new FileNotFoundException("Could not find resource on classpath: " + getFullPath());
      return inputStream;
    } else {
      return new FileInputStream(getFullPath());
    }
  }

}
