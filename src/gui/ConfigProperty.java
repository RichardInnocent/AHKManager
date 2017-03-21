package gui;

/**
 * All of the different configuration properties that are expected in the config file. 
 * @author Richard Innocent
 */
public enum ConfigProperty {
	WIDTH {
		@Override
		public String getDefault() {
			return "100";
		}
	}, HEIGHT {
		@Override
		public String getDefault() {
			return "100";
		}
	};
	
	/**
	 * Gets the default value for the parameter.
	 * @return The default value for the parameter. Note that this will always be returned as a
	 * 		{@code String}, though it may contain numeric information. 
	 */
	public abstract String getDefault();
	
	/**
	 * Returns the name of the property as it should appear in the config file.
	 * @return The name of the property as it should appear in the config file, i.e. in lower case.
	 */
	public String getPropertyName() {
		return toString().toLowerCase();
	}
}
