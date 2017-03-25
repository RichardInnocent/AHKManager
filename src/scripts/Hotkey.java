package scripts;

import java.util.*;

import javafx.scene.input.KeyCode;

public class Hotkey {
	
	List<KeyCode> keys = new ArrayList<KeyCode>(5);
	
	/**
	 * Initialises a hot key with the given keys.
	 * @param keys The keys that make up the Hotkey.
	 */
	public Hotkey(KeyCode... keys) {
		for (KeyCode key : keys) {
			this.keys.add(key);
		}
	}
	
	/**
	 * Gets the keys associated with the {@code Hotkey}.
	 * @return A {@code List> of {@code KeyCode}s that correspond to the keys that make up the
	 * {@code Hotkey}.
	 */
	public List<KeyCode> getKeys() {
		return keys;
	}
	
	@Override
	public String toString() {
		String hotkey = "";
		for (int i = 0; i < keys.size()-1; i++) {
			hotkey += keys.get(i).getName();
		}
		hotkey += keys.get(keys.size()-1).getName();
		return hotkey;
	}

}
