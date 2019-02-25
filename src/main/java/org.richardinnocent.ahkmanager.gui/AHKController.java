package org.richardinnocent.ahkmanager.gui;

import java.io.*;
import java.util.*;

import org.richardinnocent.ahkmanager.scripts.AHKDirectory;
import org.richardinnocent.ahkmanager.scripts.AHKFile;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class AHKController {

	@FXML ListView<File> activeList;
	@FXML TreeView<AHKFile> allTreeView;

	AHKFile scriptRootDir;

	@FXML
	public void initialize() {

		// Initialising root directory
		try {
			scriptRootDir = new AHKDirectory(new File(
					"C:\\Users\\RichardInnocent\\Documents\\AHKScripts"));
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
		private Tooltip tooltip = new Tooltip();

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

	    	if (item != null) {
		    	// If the contained item is a script, add a Tooltip on hover.
		    	if (item.isScript()) {
		    		setOnMouseEntered(new EventHandler<MouseEvent>() {
		    			@Override
		    			public void handle(MouseEvent event) {
		    				tooltip.setText(item.toString());
		    				setTooltip(tooltip);
		    			}
		    		});
		    	}
	    	}


	    }
	}

	private TreeItem<AHKFile> populateTreeItem(TreeItem<AHKFile> root) {
		AHKFile ahkRoot = root.getValue();

		// If the ahkRoot is a directory, add all files.
		if (!ahkRoot.isScript()) {
			List<AHKFile> containedFiles = ((AHKDirectory) ahkRoot).getFiles();
			for (AHKFile file : containedFiles) {
				TreeItem<AHKFile> newTreeItem = new TreeItem<>(file);
				populateTreeItem(newTreeItem);
				root.getChildren().add(newTreeItem);
			}
		} else {
			// TODO: Add event handler to mouse on hover
		}
		return root;
	}

}
