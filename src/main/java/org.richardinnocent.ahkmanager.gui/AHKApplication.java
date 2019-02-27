package org.richardinnocent.ahkmanager.gui;

import java.io.*;

import org.richardinnocent.ahkmanager.files.AppConfig;
import org.richardinnocent.ahkmanager.files.DirectoryController;
import org.richardinnocent.ahkmanager.files.Resources;
import org.richardinnocent.ahkmanager.scripts.AHKDirectory;
import org.richardinnocent.ahkmanager.scripts.AHKDirectoryManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AHKApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("AHK Manager");

		AppConfig config = AppConfig.initialise(null);

		// TODO remove and replace with loading method
		DirectoryController.getInstance().addDirectory("C:\\Users\\RichardInnocent\\Documents\\AHKScripts");

		// Loading FXML
		InputStream fxmlInput = Resources.HOME_FXML.createInputStream();
		primaryStage.setScene(new Scene((new FXMLLoader()).load(fxmlInput),
				config.getInitialWidth(), config.getInitialHeight()));

		primaryStage.show();
	}

	public static void main(String[] fileNames) {
		Application.launch(fileNames);
	}

}
