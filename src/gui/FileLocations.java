package gui;

public enum FileLocations {
	
	SCRIPT_BASE {
		@Override
		public String toString() {
			return "scripts/";
		}
	}, CONFIG_BASE {
		@Override
		public String toString() {
			return ".config/";
		}
	}, CONFIG_FILE {
		@Override
		public String toString() {
			return CONFIG_BASE + "app.config";
		}
	}, GUI_BASE {
		@Override
		public String toString() {
			return "src/gui/";
		}
	}, FXML_BASE {
		@Override
		public String toString() {
			return GUI_BASE + "fxml/";
		}
	};
	
	@Override
	public abstract String toString();
	
}
