package org.richardinnocent.ahkmanager.gui.controllers;

import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.richardinnocent.ahkmanager.files.DirectoryController;
import org.richardinnocent.ahkmanager.scripts.AHKFile;
import org.richardinnocent.ahkmanager.scripts.AHKScript;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomeController {

	private static final Logger LOGGER = LogManager.getLogger(HomeController.class);

	@FXML TableView<ScriptRow> tableView;

	@FXML
	public void initialize() {

		TableColumn<ScriptRow, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumn<ScriptRow, Boolean> activeColumn = new TableColumn<>("Active");
		activeColumn.setCellValueFactory(new PropertyValueFactory<>("active"));
		TableColumn<ScriptRow, String> pathColumn = new TableColumn<>("Path");
		pathColumn.setCellValueFactory(new PropertyValueFactory<>("path"));

		tableView.getColumns().addAll(nameColumn, activeColumn, pathColumn);

		List<ScriptRow> rows = new LinkedList<>();
		DirectoryController.getInstance()
											 .getDirectories()
											 .stream()
											 .forEach(ahkDirectory ->
																		ahkDirectory.getFiles()
																								.stream().filter(AHKFile::isScript)
																								.map(ahkFile ->new ScriptRow((AHKScript) ahkFile))
																								.forEach(rows::add));
		rows.sort(Comparator.comparing(ScriptRow::getPath));

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
