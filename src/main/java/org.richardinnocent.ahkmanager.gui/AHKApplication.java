package org.richardinnocent.ahkmanager.gui;

import java.io.*;

import org.richardinnocent.ahkmanager.files.Resources;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AHKApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("AHK Manager");

		// Loading FXML
		InputStream fxmlInput = Resources.HOME_FXML.createInputStream();
		primaryStage.setScene(new Scene((new FXMLLoader()).load(fxmlInput),
				Configuration.getInt(ConfigProperty.HEIGHT),
				Configuration.getInt(ConfigProperty.WIDTH)));

		primaryStage.show();
	}

	public static void main(String[] fileNames) {
		Application.launch(fileNames);
	}

}
