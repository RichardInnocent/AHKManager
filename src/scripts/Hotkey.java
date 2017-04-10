package scripts;

import java.util.*;

public class Hotkey {
	
	List<Key> keys = new ArrayList<Key>(5);
	String description;
	
	/**
	 * Initialises a hot key with the given keys.
	 * @param description The description of the Hotkey. Leave blank if no description.
	 * @param keys The keys that make up the Hotkey.
	 */
	public Hotkey(String description, Key... keys) throws IllegalArgumentException {
		this.description = description;
		
		// Adding keys to List
		for (Key key : keys)
			this.keys.add(key);
	}
	
	/**
	 * Initialises a {@code Hotkey} with the given keys and description. The hotkeys are parsed to
	 * find which keys the characters represent.
	 * @param description The description of the hotkey. Leave blank if no description.
	 * @param hotkeys The hotkeys as described in the AutoHotkey file. These will be parsed to
	 * determine which keys they correspond to.
	 */
	public Hotkey(String description, String hotkeys) {
		this.description = description;
		keys = parseHotkey(hotkeys);
		
		for (Key key : keys) {
			System.out.println(key.getDescription());
		}
		
	}
	
	/**
	 * Parses a line that contains a hotkey.
	 * @param line The segment of AutoHotkey code.
	 */
	private List<Key> parseHotkey(String line) {
		
		List<Key> keys = new ArrayList<Key>(5);
		String components [] = line.split("&");
		
		// Loop through 
		compLoop: for (String component : components) {
			component = component.trim();
			Key key = null;
			
			// Loop through characters.
			// All non-alphanumeric characters should be a modifier
			for (int i = 0; i < component.length(); i++) {
				component = component.substring(i);
				
				char character = component.charAt(0);
				
				// Get all modifiers and subtract them from the key string
				if (!Character.isDigit(character) &&
						!Character.isAlphabetic(character)) {
					
					// The left and right characters always have a character after for the hotkey
					if (character == '<' || character == '>') {
						key = getKey(component.substring(0, 2));
						i++; // Ignore next char
					// If not one of the above, the hotkey will only be one character long
					} else {
						key = getKey(Character.toString(character));
					}
					
					// If the key exists then add it to the hotkey
					if (key != null)
						keys.add(key);
					
				} else {
					key = getKey(component);
					
					// If the key exists then add it to the hotkey
					if (key != null)
						keys.add(key);
					
					continue compLoop;
				}
			}
			
		}
		
		return keys;
	}
	
	/**
	 * Returns the key associated with the code.
	 * @param code The AHK keycode associated with the key.
	 * @return The {@code Key}, or null if there is no {@code Key} that corresponds to that code.
	 */
	private Key getKey(String code) {
		for(Key key : Key.values()) {
			if (key.is(code)) {
				return key;
			}
		}
		return null;
	}
	
	/**
	 * Gets the description associated with the hotkey.
	 * @return A description of the hotkey. If the description is null, a blank string will be
	 * returned.
	 */
	public String getDescription() {
		if (description == null)
			return "";
		return description;
	}
	
	/**
	 * Gets a list of keys that make up the hotkey as a set of key descriptions. This makes the
	 * keys easier to read.
	 * @return A list of keys separated by a '{@code +}'.
	 */
	public String getKeys() {
		String keysDesc = "";
		for (int i = 0; i < keys.size()-1; i++) {
			keysDesc += keys.get(i).getDescription() + " + ";
		}
		return keysDesc + keys.get(keys.size()-1);
	}
	
	/**
	 * Returns a {@code List} of {@code Key}s for the hotkey.
	 * @return A {@code List} of {@code Key}s for the hotkey.
	 */
	public List<Key> getKeysAsList() {
		return keys;
	}
	
	@Override
	public String toString() {
		String hotkey = getKeys();
		String description = getDescription();
		if (!getDescription().equals(""))
			hotkey += "\n" + description;
		return hotkey;
	}
	
}
