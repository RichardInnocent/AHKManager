package org.richardinnocent.ahkmanager.gui;

import java.io.*;
import java.util.Properties;

/**
 * Class that handles all of the program configuration, such as window size. it contains many
 * static methods for ease of use, and should not be instantiated.
 *
 * @author Richard Innocent
 */
public class Configuration {

	private static Properties config = new Properties();

	// Loading config
	static {
		setDefaults();
		load(FileLocations.CONFIG_FILE.toString());
	}

	/**
	 * Stop instances of Configuration being created
	 */
	private Configuration() {}

	/**
	 * Sets the default values for the config.
	 */
	public static void setDefaults() {
		config.setProperty(ConfigProperty.WIDTH.getPropertyName(),
				ConfigProperty.WIDTH.getDefault());
		config.setProperty(ConfigProperty.HEIGHT.getPropertyName(),
				ConfigProperty.HEIGHT.getDefault());
	}

	/**
	 * Reads in the config file.
	 * @param filePath The filepath of the config file
	 */
	public static void load(String filePath) {
		File configFile = new File(filePath);
		if (!configFile.isFile()) {
			Messenger.showWarning("Configuration file could not be found.");
		} else {
			try {
				InputStream input = new FileInputStream(configFile);
				config.load(input);
				System.out.println(config);
			} catch (IOException e) {
				Messenger.showWarning("Config file could not be read.");
			}
		}
	}

	/**
	 * Saves the configuration.
	 */
	public static void save() {
		try {
			OutputStream out = new FileOutputStream(FileLocations.CONFIG_FILE.toString());
			try {
				config.store(out, "");
			} catch (IOException e) {
				throw e;
			} finally {
				out.close();
			}
		} catch (IOException e) {
			Messenger.showError(e.toString());
		}
	}

	/**
	 * Gets the property with the given name. If the property does not exist within the config
	 * file, this method returns {@code null}.
	 * @param property The property whose value is required.
	 * @return The value of the property.
	 */
	public static String getProperty(String property) {
		return config.getProperty(property);
	}

	/**
	 * Get the given property. If the property does not exist within the config file, the method
	 * returns {@code null}.
	 * @param property The property whose value is required.
	 * @return The value of the property.
	 */
	public static String getProperty(ConfigProperty property) {
		return getProperty(property.getPropertyName());
	}

	/**
	 * Gets the given property and parses it to an {@code int}.
	 * @param property The property whose value is required.
	 * @return The value of the property.
	 * @throws IllegalArgumentException Thrown if the property cannot be found, or if the value
	 * cannot be parsed to an {@code int}.
	 */
	public static int getInt(String property) throws IllegalArgumentException {
		String value = config.getProperty(property);
		if (value == null)
			throw new IllegalArgumentException("Property " + property + " is not defined.");
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Property " + property + " is not an integer.");
		}
	}

	/**
	 * Gets the given property and parses it to an {@code int}.
	 * @param property The property whose value is required.
	 * @return The value of the property.
	 * @throws IllegalArgumentException Thrown if the property cannot be found, or if the value
	 * cannot be parsed to an {@code int}.
	 */
	public static int getInt(ConfigProperty property)
			throws IllegalArgumentException {
		return getInt(property.getPropertyName());
	}

	/**
	 * Gets the given property and parses it to an {@code double}.
	 * @param property The property whose value is required.
	 * @return The value of the property.
	 * @throws IllegalArgumentException Thrown if the property cannot be found, or if the value
	 * cannot be parsed to an {@code double}.
	 */
	public static double getDouble(String property) throws IllegalArgumentException {
		String value = config.getProperty(property);
		if (value == null)
			throw new IllegalArgumentException("Property " + property + " is not defined.");
		try {
			return Double.parseDouble(value);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Property " + property + " is not an integer.");
		}
	}

	/**
	 * Gets the given property and parses it to an {@code double}.
	 * @param property The property whose value is required.
	 * @return The value of the property.
	 * @throws IllegalArgumentException Thrown if the property cannot be found, or if the value
	 * cannot be parsed to an {@code double}.
	 */
	public static double getDouble(ConfigProperty property)
			throws IllegalArgumentException {
		return getDouble(property.getPropertyName());
	}

	/**
	 * Sets the property for the given config file.
	 * @param property The property that is being defined.
	 * @param value The value of the property.
	 * @return The old value of the property, if applicable. This will be null if the property was
	 * not previously set.
	 * @throws IllegalArgumentException Thrown if the property will not be used.
	 */
	public static Object setProperty(String property, Object value)
			throws IllegalArgumentException {
		for (ConfigProperty prop : ConfigProperty.values()) {
			if (prop.getPropertyName().equals(value)) {
				return config.setProperty(property, value.toString());
			}
		}
		throw new IllegalArgumentException(property + " property not used by progam.");
	}

	/**
	 * Sets the property for the given config file.
	 * @param property The property that is being defined.
	 * @param value The value of the property.
	 * @return The old value of the property, if applicable. This will be null if the property was
	 * not previously set.
	 */
	public static Object setProperty(ConfigProperty property, Object value) {
		return config.setProperty(property.getPropertyName(), value.toString());
	}

}
