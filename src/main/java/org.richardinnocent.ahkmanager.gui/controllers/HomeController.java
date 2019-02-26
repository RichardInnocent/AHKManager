package org.richardinnocent.ahkmanager.gui.controllers;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.richardinnocent.ahkmanager.flow.Execution;
import org.richardinnocent.ahkmanager.scripts.AHKDirectory;
import org.richardinnocent.ahkmanager.scripts.AHKFile;
import org.richardinnocent.ahkmanager.scripts.AHKScript;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomeController {

	private static final Logger LOGGER = LogManager.getLogger(HomeController.class);

	@FXML TableView<ScriptRow> tableView;

	private AHKDirectory scriptRootDir;

	@FXML
	public void initialize() {

		// Initialising root directory
		try {
			scriptRootDir = new AHKDirectory(new File(
					"C:\\Users\\RichardInnocent\\Documents\\AHKScripts"));
		} catch (SecurityException | IllegalArgumentException e) {
			Execution.error(LOGGER, e.toString(), e);
			System.exit(1);
		}

		TableColumn<ScriptRow, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumn<ScriptRow, Boolean> activeColumn = new TableColumn<>("Active");
		activeColumn.setCellValueFactory(new PropertyValueFactory<>("active"));
		TableColumn<ScriptRow, String> pathColumn = new TableColumn<>("Path");
		pathColumn.setCellValueFactory(new PropertyValueFactory<>("path"));

		tableView.getColumns().addAll(nameColumn, activeColumn, pathColumn);

		List<ScriptRow> rows = scriptRootDir
				.getFiles()
				.stream()
				.filter(AHKFile::isScript)
				.map(ahkFile -> new ScriptRow((AHKScript) ahkFile))
				.sorted(Comparator.comparing(ScriptRow::getPath))
				.collect(Collectors.toList());

		tableView.setItems(FXCollections.observableArrayList(rows));
	}

	public class ScriptRow {

		private String name;
		private Boolean active;
		private String path;

		ScriptRow(AHKScript script) {
			name = script.getFileName();
			active = script.isActive();
			path = script.getFilePath();
		}

		public String getName() {
			return name;
		}

		public Boolean isActive() {
			return active;
		}

		public String getPath() {
			return path;
		}
	}

}
