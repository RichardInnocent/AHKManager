package gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Generator extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("AHK Manager");
		
		// Loading FXML
		InputStream fxmlInput = new FileInputStream("src/gui/fxml/AHKManager.fxml");
		primaryStage.setScene(new Scene((new FXMLLoader()).load(fxmlInput),
				Configuration.getInt(ConfigProperty.HEIGHT),
				Configuration.getInt(ConfigProperty.WIDTH)));
		
		primaryStage.show();
		
		// TODO Load values into tabs
		File file = new File("scripts");
		File [] files = file.listFiles();
		
	}
	
	public static void main(String fileNames[]) {
		Application.launch(fileNames);
	}

}
