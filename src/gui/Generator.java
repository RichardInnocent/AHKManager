package gui;

import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Generator extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Scene scene = new Scene(new VBox(), Configuration.getInt(ConfigProperty.WIDTH),
//				Configuration.getInt(ConfigProperty.HEIGHT));
		primaryStage.setTitle("AHK Manager");
		
		InputStream fxmlInput = new FileInputStream("src/gui/fxml/AHKManager.fxml");
		
		// Loading FXML
		primaryStage.setScene(new Scene((new FXMLLoader()).load(fxmlInput),
				Configuration.getInt(ConfigProperty.HEIGHT),
				Configuration.getInt(ConfigProperty.WIDTH)));
		
		primaryStage.show();
		
	}
	
	public static void main(String fileNames[]) {
		Application.launch(fileNames);
	}

}
