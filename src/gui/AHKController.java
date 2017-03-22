package gui;


import java.io.File;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class AHKController {
	
	@FXML ListView<File> activeList;
	@FXML TreeView<String> allTreeView;
	
	@FXML
	public void initialize() {
		TreeItem<String> root = new TreeItem<>("root");
		root.getChildren().add(new TreeItem<>("file1"));
		allTreeView.setRoot(root);
	}
	
}
