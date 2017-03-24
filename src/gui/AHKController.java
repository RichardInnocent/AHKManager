package gui;


import java.io.*;
import java.util.*;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import scripts.*;

public class AHKController {
	
	@FXML ListView<File> activeList;
	@FXML TreeView<AHKFile> allTreeView;
	
	AHKFile scriptRootDir;
	
	@FXML
	public void initialize() {
		
		// Initialising root directory
		try {
			scriptRootDir = new AHKDirectory(new File(FileLocations.SCRIPT_BASE.toString()));
			System.out.println(scriptRootDir);
		} catch (FileNotFoundException | IllegalArgumentException e) {
			Messenger.showError(e.toString());
			System.exit(1);
		}

		// Setting up TreeView for all contained scripts
		TreeItem<AHKFile> root = new TreeItem<>(scriptRootDir);
		populateTreeItem(root);
		allTreeView.setRoot(root);
		root.setExpanded(true);
		
		allTreeView.setCellFactory(treeView -> new AHKCell() {
		});
		
	}
	
	private class AHKCell extends TreeCell<AHKFile> {
		TextField textField = new TextField("");
		
	    @Override
	    public void updateItem(AHKFile item, boolean empty) {
	      super.updateItem(item, empty);

	      if (empty) {
	        setText(null);
	        setGraphic(null);
	      } else {
	          setText(item.toString());
	          setGraphic(getTreeItem().getGraphic());
	      }
	      
	      setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println(getItem());
			}
	      });
	      
	    }
	}
		
	private TreeItem<AHKFile> populateTreeItem(TreeItem<AHKFile> root) {
		AHKFile ahkRoot = root.getValue();
		
		// If the ahkRoot is a directory, add all files.
		if (!ahkRoot.isScript()) {
			List<AHKFile> containedFiles = ((AHKDirectory) ahkRoot).getFiles();
			for (AHKFile file : containedFiles) {
				TreeItem<AHKFile> newTreeItem = new TreeItem<AHKFile>(file);
				populateTreeItem(newTreeItem);
				root.getChildren().add(newTreeItem);
			}
		} else {
			// TODO: Add event handler to mouse on hover
		}
		return root;
	}
	
}
