package gui;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AHKController {
	
	@FXML ListView activeList = new ListView<String>(FXCollections.observableArrayList("john"));
	@FXML TreeView allTreeView;
	
}
