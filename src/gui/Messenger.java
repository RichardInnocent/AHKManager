package gui;

import java.util.Optional;

import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

/**
 * A lightweight wrapper for the {@code javafx.scene.Alert} that allows alerts to be created within
 * one line.
 * 
 * @see javafx.scene.control.Alert
 * @author Richard Innocent
 */
public class Messenger {
	
	/**
	 * Creates an info message that will be displayed to the user.
	 * @param message The information that should be displayed in the message.
	 */
	public static void showInfo(String message) {
		createAlert(message, AlertType.INFORMATION).showAndWait();
	}
	
	/**
	 * Creates a warning message that will be displayed to the user.
	 * @param message The information that should be displayed in the message.
	 */
	public static void showWarning(String message) {
		createAlert(message, AlertType.WARNING).showAndWait();
	}
	
	/**
	 * Creates an error message that will be displayed to the user.
	 * @param message The information that should be displayed in the message.
	 */
	public static void showError(String message) {
		createAlert(message, AlertType.ERROR).showAndWait();
	}
	
	/**
	 * Creates a confirmation message that will be displayed to the user.
	 * @param message The information that should be displayed in the message.
	 * @return The button that was pressed by the user on the confirmation message.
	 */
	public static Optional<ButtonType> showConfirmation(String message) {
		return createAlert(message, AlertType.CONFIRMATION).showAndWait();
	}
	
	/**
	 * Creates a quick alert of the given {@code AlertType}. The title for the alert will be the
	 * {@code AlertType}.
	 * @param message The information that should be displayed in the {@code Alert}.
	 * @param alertType The type of {@code Alert} that should be generated.
	 * @return The generated {@code Alert}.
	 */
	public static Alert createAlert(String message, AlertType alertType) {
		Alert alert = new Alert(alertType);
		
		String alertTitle = alertType.toString();
		alertTitle = alertTitle.charAt(0) + alertTitle.substring(1).toLowerCase();
		alert.setTitle(alertTitle);
		
		alert.setHeaderText(null);
		alert.setContentText(message);
		
		return alert;
	}

}
