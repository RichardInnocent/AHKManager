package org.richardinnocent.ahkmanager.scripts;

/**
 * Represents all hotkeys supported by AutoHotkey.
 *
 * @author Richard Innocent
 *
 */
public enum Key {

	LBUTTON {
		public String getAHKString() {
			return "LButton";
		}
		public String getDescription() {
			return "Left mouse button";
		}
	}, RBUTTON {
		public String getAHKString() {
			return "RButton";
		}
		public String getDescription() {
			return "Right mouse button";
		}
		public boolean is(String chars) {
			return chars.equals(getAHKString());
		}
	}, MBUTTON {
		public String getAHKString() {
			return "MButton";
		}
		public String getDescription() {
			return "Middle mouse button";
		}
	}, XBUTTON1 {
		public String getAHKString() {
			return "XButton1";
		}
		public String getDescription() {
			return "Fourth mouse button";
		}
	}, XBUTTON2 {
		public String getAHKString() {
			return "XButton2";
		}
		public String getDescription() {
			return "Fifth mouse button";
		}
	}, WHEELDOWN {
		public String getAHKString() {
			return "WheelDown";
		}
		public String getDescription() {
			return "Mouse wheel down";
		}
	}, WHEELUP {
		public String getAHKString() {
			return "WheelUp";
		}
		public String getDescription() {
			return "Mouse wheel up";
		}
	}, WHEELLEFT {
		public String getAHKString() {
			return "WheelLeft";
		}
		public String getDescription() {
			return "Mouse wheel left";
		}
	}, WHEELRIGHT {
		public String getAHKString() {
			return "WheelRight";
		}
		public String getDescription() {
			return "Mouse wheel right";
		}
	}, A {
		public String getAHKString() {
			return "A";
		}
		public String getDescription() {
			return "A";
		}
	}, B {
		public String getAHKString() {
			return "B";
		}
		public String getDescription() {
			return "B";
		}
	}, C {
		public String getAHKString() {
			return "C";
		}
		public String getDescription() {
			return "C";
		}
	}, D {
		public String getAHKString() {
			return "D";
		}
		public String getDescription() {
			return "D";
		}
	}, E {
		public String getAHKString() {
			return "E";
		}
		public String getDescription() {
			return "E";
		}
	}, F {
		public String getAHKString() {
			return "F";
		}
		public String getDescription() {
			return "F";
		}
	}, G {
		public String getAHKString() {
			return "G";
		}
		public String getDescription() {
			return "G";
		}
	}, H {
		public String getAHKString() {
			return "H";
		}
		public String getDescription() {
			return "H";
		}
	}, I {
		public String getAHKString() {
			return "I";
		}
		public String getDescription() {
			return "I";
		}
	}, J {
		public String getAHKString() {
			return "J";
		}
		public String getDescription() {
			return "J";
		}
	}, K {
		public String getAHKString() {
			return "K";
		}
		public String getDescription() {
			return "K";
		}
	}, L {
		public String getAHKString() {
			return "L";
		}
		public String getDescription() {
			return "L";
		}
	}, M {
		public String getAHKString() {
			return "M";
		}
		public String getDescription() {
			return "M";
		}
	}, N {
		public String getAHKString() {
			return "N";
		}
		public String getDescription() {
			return "N";
		}
	}, O {
		public String getAHKString() {
			return "O";
		}
		public String getDescription() {
			return "O";
		}
	}, P {
		public String getAHKString() {
			return "P";
		}
		public String getDescription() {
			return "P";
		}
	}, Q {
		public String getAHKString() {
			return "Q";
		}
		public String getDescription() {
			return "Q";
		}
	}, R {
		public String getAHKString() {
			return "R";
		}
		public String getDescription() {
			return "R";
		}
	}, S {
		public String getAHKString() {
			return "S";
		}
		public String getDescription() {
			return "S";
		}
	}, T {
		public String getAHKString() {
			return "T";
		}
		public String getDescription() {
			return "T";
		}
	}, U {
		public String getAHKString() {
			return "U";
		}
		public String getDescription() {
			return "U";
		}
	}, V {
		public String getAHKString() {
			return "V";
		}
		public String getDescription() {
			return "V";
		}
	}, W {
		public String getAHKString() {
			return "W";
		}
		public String getDescription() {
			return "W";
		}
	}, X {
		public String getAHKString() {
			return "X";
		}
		public String getDescription() {
			return "X";
		}
	}, Y {
		public String getAHKString() {
			return "Y";
		}
		public String getDescription() {
			return "Y";
		}
	}, Z {
		public String getAHKString() {
			return "Z";
		}
		public String getDescription() {
			return "Z";
		}
	}, ONE {
		public String getAHKString() {
			return "1";
		}
		public String getDescription() {
			return "1";
		}
	}, TWO {
		public String getAHKString() {
			return "2";
		}
		public String getDescription() {
			return "2";
		}
	}, THREE {
		public String getAHKString() {
			return "3";
		}
		public String getDescription() {
			return "3";
		}
	}, FOUR {
		public String getAHKString() {
			return "4";
		}
		public String getDescription() {
			return "4";
		}
	}, FIVE {
		public String getAHKString() {
			return "5";
		}
		public String getDescription() {
			return "5";
		}
	}, SIX {
		public String getAHKString() {
			return "6";
		}
		public String getDescription() {
			return "6";
		}
	}, SEVEN {
		public String getAHKString() {
			return "7";
		}
		public String getDescription() {
			return "7";
		}
	}, EIGHT {
		public String getAHKString() {
			return "8";
		}
		public String getDescription() {
			return "8";
		}
	}, NINE {
		public String getAHKString() {
			return "9";
		}
		public String getDescription() {
			return "9";
		}
	}, CAPSLOCK {
		public String getAHKString() {
			return "CapsLock";
		}
		public String getDescription() {
			return "Caps lock";
		}
	}, SPACE {
		public String getAHKString() {
			return "Space";
		}
		public String getDescription() {
			return "Space";
		}
	}, TAB {
		public String getAHKString() {
			return "Tab";
		}
		public String getDescription() {
			return "Tab";
		}
	}, ENTER {
		public String getAHKString() {
			return "Enter";
		}
		public String getDescription() {
			return "Enter";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("Return");
		}
	}, ESCAPE {
		public String getAHKString() {
			return "Escape";
		}
		public String getDescription() {
			return "Esc";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("Esc");
		}
	}, BACKSPACE {
		public String getAHKString() {
			return "Backspace";
		}
		public String getDescription() {
			return "Backspace";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("BS");
		}
	}, SCROLLLOCK {
		public String getAHKString() {
			return "ScrollLock";
		}
		public String getDescription() {
			return "Scroll lock";
		}
	}, DELETE {
		public String getAHKString() {
			return "Delete";
		}
		public String getDescription() {
			return "Delete";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("Del");
		}
	}, INSERT {
		public String getAHKString() {
			return "Insert";
		}
		public String getDescription() {
			return "Insert";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("Ins");
		}
	}, HOME {
		public String getAHKString() {
			return "Home";
		}
		public String getDescription() {
			return "Home";
		}
	}, END {
		public String getAHKString() {
			return "End";
		}
		public String getDescription() {
			return "End";
		}
	}, PGUP {
		public String getAHKString() {
			return "PgUp";
		}
		public String getDescription() {
			return "Page up";
		}
	}, PGDN {
		public String getAHKString() {
			return "PgDn";
		}
		public String getDescription() {
			return "Page down";
		}
	}, UP {
		public String getAHKString() {
			return "Up";
		}
		public String getDescription() {
			return "Up";
		}
	}, DOWN {
		public String getAHKString() {
			return "Down";
		}
		public String getDescription() {
			return "Down";
		}
	}, LEFT {
		public String getAHKString() {
			return "Left";
		}
		public String getDescription() {
			return "Left";
		}
	}, RIGHT {
		public String getAHKString() {
			return "Right";
		}
		public String getDescription() {
			return "Right";
		}
	}, NUMPAD0 {
		public String getAHKString() {
			return "Numpad0";
		}
		public String getDescription() {
			return "Numpad 0";
		}
	}, NUMPAD1 {
		public String getAHKString() {
			return "Numpad1";
		}
		public String getDescription() {
			return "Numpad 1";
		}
	}, NUMPAD2 {
		public String getAHKString() {
			return "Numpad2";
		}
		public String getDescription() {
			return "Numpad 2";
		}
	}, NUMPAD3 {
		public String getAHKString() {
			return "Numpad3";
		}
		public String getDescription() {
			return "Numpad 3";
		}
	}, NUMPAD4 {
		public String getAHKString() {
			return "Numpad4";
		}
		public String getDescription() {
			return "Numpad 4";
		}
	}, NUMPAD5 {
		public String getAHKString() {
			return "Numpad5";
		}
		public String getDescription() {
			return "Numpad 5";
		}
	}, NUMPAD6 {
		public String getAHKString() {
			return "Numpad6";
		}
		public String getDescription() {
			return "Numpad 6";
		}
	}, NUMPAD7 {
		public String getAHKString() {
			return "Numpad7";
		}
		public String getDescription() {
			return "Numpad 7";
		}
	}, NUMPAD8 {
		public String getAHKString() {
			return "Numpad8";
		}
		public String getDescription() {
			return "Numpad 8";
		}
	}, NUMPAD9 {
		public String getAHKString() {
			return "Numpad9";
		}
		public String getDescription() {
			return "Numpad 9";
		}
	}, NUMPADDOT {
		public String getAHKString() {
			return "NumpadDot";
		}
		public String getDescription() {
			return "Numpad dot";
		}
	}, NUMPADINS {
		public String getAHKString() {
			return "NumpadIns";
		}
		public String getDescription() {
			return "NumpadEnd";
		}
	}, NUMPADEND {
		public String getAHKString() {
			return "NumpadEnd";
		}
		public String getDescription() {
			return "Numpad End";
		}
	}, NUMPADDOWN {
		public String getAHKString() {
			return "NumpadDown";
		}
		public String getDescription() {
			return "Numpad down";
		}
	}, NUMPADPGDN {
		public String getAHKString() {
			return "NumpadPgDn";
		}
		public String getDescription() {
			return "Numpad page down";
		}
	}, NUMPADLEFT {
		public String getAHKString() {
			return "NumpadLeft";
		}
		public String getDescription() {
			return "Numpad left";
		}
	}, NUMPADCLEAR {
		public String getAHKString() {
			return "NumpadClear";
		}
		public String getDescription() {
			return "Numpad clear";
		}
	}, NUMPADRIGHT {
		public String getAHKString() {
			return "NumpadRight";
		}
		public String getDescription() {
			return "Numpad right";
		}
	}, NUMPADHOME {
		public String getAHKString() {
			return "NumpadHome";
		}
		public String getDescription() {
			return "Numpad home";
		}
	}, NUMPADUP {
		public String getAHKString() {
			return "NumpadUp";
		}
		public String getDescription() {
			return "Numpad up";
		}
	}, NUMPADPGUP {
		public String getAHKString() {
			return "NumpadPgUp";
		}
		public String getDescription() {
			return "Numpad page up";
		}
	}, NUMPADDEL {
		public String getAHKString() {
			return "NumpadDel";
		}
		public String getDescription() {
			return "Numpad delete";
		}
	}, NUMLOCK {
		public String getAHKString() {
			return "NumLock";
		}
		public String getDescription() {
			return "Num lock";
		}
	}, NUMPADDIV {
		public String getAHKString() {
			return "NumpadDiv";
		}
		public String getDescription() {
			return "Numpad divide";
		}
	}, NUMPADMULT {
		public String getAHKString() {
			return "NumpadMult";
		}
		public String getDescription() {
			return "Numpad divide";
		}
	}, NUMPADADD {
		public String getAHKString() {
			return "NumpadAdd";
		}
		public String getDescription() {
			return "Numpad Add";
		}
	}, NUMPADSUB {
		public String getAHKString() {
			return "NumpadSub";
		}
		public String getDescription() {
			return "Numpad Subtract";
		}
	}, NUMPADENTER {
		public String getAHKString() {
			return "NumpadEnter";
		}
		public String getDescription() {
			return "Numpad enter";
		}
	}, F1 {
		public String getAHKString() {
			return "F1";
		}
		public String getDescription() {
			return "F1";
		}
	}, F2 {
		public String getAHKString() {
			return "F2";
		}
		public String getDescription() {
			return "F2";
		}
	}, F3 {
		public String getAHKString() {
			return "F3";
		}
		public String getDescription() {
			return "F3";
		}
	}, F4 {
		public String getAHKString() {
			return "F4";
		}
		public String getDescription() {
			return "F4";
		}
	}, F5 {
		public String getAHKString() {
			return "F5";
		}
		public String getDescription() {
			return "F5";
		}
	}, F6 {
		public String getAHKString() {
			return "F6";
		}
		public String getDescription() {
			return "F6";
		}
	}, F7 {
		public String getAHKString() {
			return "F7";
		}
		public String getDescription() {
			return "F7";
		}
	}, F8 {
		public String getAHKString() {
			return "F8";
		}
		public String getDescription() {
			return "F8";
		}
	}, F9 {
		public String getAHKString() {
			return "F9";
		}
		public String getDescription() {
			return "F9";
		}
	}, F10 {
		public String getAHKString() {
			return "F10";
		}
		public String getDescription() {
			return "F10";
		}
	}, F11 {
		public String getAHKString() {
			return "F11";
		}
		public String getDescription() {
			return "F11";
		}
	}, F12 {
		public String getAHKString() {
			return "F12";
		}
		public String getDescription() {
			return "F12";
		}
	}, F13 {
		public String getAHKString() {
			return "F13";
		}
		public String getDescription() {
			return "F13";
		}
	}, F14 {
		public String getAHKString() {
			return "F14";
		}
		public String getDescription() {
			return "F14";
		}
	}, F15 {
		public String getAHKString() {
			return "F15";
		}
		public String getDescription() {
			return "F15";
		}
	}, F16 {
		public String getAHKString() {
			return "F16";
		}
		public String getDescription() {
			return "F16";
		}
	}, F17 {
		public String getAHKString() {
			return "F17";
		}
		public String getDescription() {
			return "F17";
		}
	}, F18 {
		public String getAHKString() {
			return "F18";
		}
		public String getDescription() {
			return "F18";
		}
	}, F19 {
		public String getAHKString() {
			return "F19";
		}
		public String getDescription() {
			return "F19";
		}
	}, F20 {
		public String getAHKString() {
			return "F20";
		}
		public String getDescription() {
			return "F20";
		}
	}, F21 {
		public String getAHKString() {
			return "F21";
		}
		public String getDescription() {
			return "F21";
		}
	}, F22 {
		public String getAHKString() {
			return "F22";
		}
		public String getDescription() {
			return "F22";
		}
	}, F23 {
		public String getAHKString() {
			return "F23";
		}
		public String getDescription() {
			return "F23";
		}
	}, F24 {
		public String getAHKString() {
			return "F24";
		}
		public String getDescription() {
			return "F24";
		}
	}, LWin {
		public String getAHKString() {
			return "LWin";
		}
		public String getDescription() {
			return "Left Windows";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("<#");
		}
	}, RWin {
		public String getAHKString() {
			return "RWin";
		}
		public String getDescription() {
			return "Right Windows";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase(">#");
		}
	}, CONTROL {
		public String getAHKString() {
			return "Control";
		}
		public String getDescription() {
			return "Control";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("Ctrl") ||
					chars.equalsIgnoreCase("^");
		}
	}, ALT {
		public String getAHKString() {
			return "Alt";
		}
		public String getDescription() {
			return "Alt";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("!");
		}
	}, SHIFT {
		public String getAHKString() {
			return "Shift";
		}
		public String getDescription() {
			return "Shift";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("+");
		}
	}, LCONTROL {
		public String getAHKString() {
			return "LControl";
		}
		public String getDescription() {
			return "Left control";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("LCtrl") ||
					chars.equalsIgnoreCase("<^");
		}
	}, RCONTROL {
		public String getAHKString() {
			return "RControl";
		}
		public String getDescription() {
			return "Right control";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("RCtrl") ||
					chars.equalsIgnoreCase(">^");
		}
	}, LSHIFT {
		public String getAHKString() {
			return "LShift";
		}
		public String getDescription() {
			return "Left shift";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("<+");
		}
	}, RSHIFT {
		public String getAHKString() {
			return "RShift";
		}
		public String getDescription() {
			return "Right shift";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase(">+");
		}
	}, LALT {
		public String getAHKString() {
			return "LAlt";
		}
		public String getDescription() {
			return "Left alt";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase("<!");
		}
	}, RALT {
		public String getAHKString() {
			return "Alt";
		}
		public String getDescription() {
			return "Alt";
		}
		public boolean is(String chars) {
			return chars.equalsIgnoreCase(getAHKString()) ||
					chars.equalsIgnoreCase(">!");
		}
	}, BROWSER_BACK {
		public String getAHKString() {
			return "Browser_Back";
		}
		public String getDescription() {
			return "Browser Back";
		}
	}, BROWSER_FORWARD {
		public String getAHKString() {
			return "Browser_Forward";
		}
		public String getDescription() {
			return "Browser Forward";
		}
	}, BROWSER_REFRESH {
		public String getAHKString() {
			return "Browser_Refresh";
		}
		public String getDescription() {
			return "Browser Refresh";
		}
	}, BROWSER_STOP {
		public String getAHKString() {
			return "Browser_Stop";
		}
		public String getDescription() {
			return "Browser Stop";
		}
	}, BROWSER_SEARCH {
		public String getAHKString() {
			return "Browser_Search";
		}
		public String getDescription() {
			return "Browser Search";
		}
	}, BROWSER_FAVORITES {
		public String getAHKString() {
			return "Browser_Favorites";
		}
		public String getDescription() {
			return "Browser Favorites";
		}
	}, BROWSER_HOME {
		public String getAHKString() {
			return "Browser_Home";
		}
		public String getDescription() {
			return "Browser Home";
		}
	}, VOLUME_MUTE {
		public String getAHKString() {
			return "Volume_Mute";
		}
		public String getDescription() {
			return "Volume Mute";
		}
	}, VOLUME_DOWN {
		public String getAHKString() {
			return "Volume_Down";
		}
		public String getDescription() {
			return "Volume Down";
		}
	}, VOLUME_UP {
		public String getAHKString() {
			return "Volume_Up";
		}
		public String getDescription() {
			return "Volume Up";
		}
	}, MEDIA_NEXT {
		public String getAHKString() {
			return "Media_Next";
		}
		public String getDescription() {
			return "Media Next";
		}
	}, MEDIA_PREV {
		public String getAHKString() {
			return "Media_Prev";
		}
		public String getDescription() {
			return "Media Previous";
		}
	}, MEDIA_STOP {
		public String getAHKString() {
			return "Media_Stop";
		}
		public String getDescription() {
			return "Media Stop";
		}
	}, MEDIA_PLAY_PAUSE {
		public String getAHKString() {
			return "Media_Play_Pause";
		}
		public String getDescription() {
			return "Media Play/Pause";
		}
	}, LAUNCH_MAIL {
		public String getAHKString() {
			return "Launch_Mail";
		}
		public String getDescription() {
			return "Launch Mail";
		}
	}, LAUNCH_MEDIA {
		public String getAHKString() {
			return "Launch_Media";
		}
		public String getDescription() {
			return "Launch Media";
		}
	}, LAUNCH_APP1 {
		public String getAHKString() {
			return "Launch_App1";
		}
		public String getDescription() {
			return "Launch App 1";
		}
	}, LAUNCH_APP2 {
		public String getAHKString() {
			return "Launch_App2";
		}
		public String getDescription() {
			return "Launch_App2";
		}
	}, APPSKEY {
		public String getAHKString() {
			return "AppsKey";
		}
		public String getDescription() {
			return "Application Key";
		}
	}, PRINTSCREEN {
		public String getAHKString() {
			return "PrintScreen";
		}
		public String getDescription() {
			return "Print Screen";
		}
	}, CTRLBREAK {
		public String getAHKString() {
			return "CtrlBreak";
		}
		public String getDescription() {
			return "Ctrl Break";
		}
	}, PAUSE {
		public String getAHKString() {
			return "Pause";
		}
		public String getDescription() {
			return "Pause";
		}
	}, BREAK {
		public String getAHKString() {
			return "Break";
		}
		public String getDescription() {
			return "Break";
		}
	}, HELP {
		public String getAHKString() {
			return "Help";
		}
		public String getDescription() {
			return "Help";
		}
	}, SLEEP {
		public String getAHKString() {
			return "Sleep";
		}
		public String getDescription() {
			return "Sleep";
		}
	}, SCnnn {
		public String getAHKString() {
			return "SC";
		}
		public String getDescription() {
			return "Key scan code";
		}
	}, VKnn {
		public String getAHKString() {
			return "VK";
		}
		public String getDescription() {
			return "Key hex virtual code";
		}
	}, JOY1 {
		public String getAHKString() {
			return "Joy1";
		}
		public String getDescription() {
			return "Joystick Button 1";
		}
	}, JOY2 {
		public String getAHKString() {
			return "Joy2";
		}
		public String getDescription() {
			return "Joystick Button 2";
		}
	}, JOY3 {
		public String getAHKString() {
			return "Joy3";
		}
		public String getDescription() {
			return "Joystick Button 3";
		}
	}, JOY4 {
		public String getAHKString() {
			return "Joy4";
		}
		public String getDescription() {
			return "Joystick Button 4";
		}
	}, JOY5 {
		public String getAHKString() {
			return "Joy5";
		}
		public String getDescription() {
			return "Joystick Button 5";
		}
	}, JOY6 {
		public String getAHKString() {
			return "Joy6";
		}
		public String getDescription() {
			return "Joystick Button 6";
		}
	}, JOY7 {
		public String getAHKString() {
			return "Joy7";
		}
		public String getDescription() {
			return "Joystick Button 7";
		}
	}, JOY8 {
		public String getAHKString() {
			return "Joy8";
		}
		public String getDescription() {
			return "Joystick Button 8";
		}
	}, JOY9 {
		public String getAHKString() {
			return "Joy9";
		}
		public String getDescription() {
			return "Joystick Button 9";
		}
	}, JOY10 {
		public String getAHKString() {
			return "Joy10";
		}
		public String getDescription() {
			return "Joystick Button 10";
		}
	}, JOY11 {
		public String getAHKString() {
			return "Joy11";
		}
		public String getDescription() {
			return "Joystick Button 11";
		}
	}, JOY12 {
		public String getAHKString() {
			return "Joy12";
		}
		public String getDescription() {
			return "Joystick Button 12";
		}
	}, JOY13 {
		public String getAHKString() {
			return "Joy13";
		}
		public String getDescription() {
			return "Joystick Button 13";
		}
	}, JOY14 {
		public String getAHKString() {
			return "Joy14";
		}
		public String getDescription() {
			return "Joystick Button 14";
		}
	}, JOY15 {
		public String getAHKString() {
			return "Joy15";
		}
		public String getDescription() {
			return "Joystick Button 15";
		}
	}, JOY16 {
		public String getAHKString() {
			return "Joy16";
		}
		public String getDescription() {
			return "Joystick Button 16";
		}
	}, JOY17 {
		public String getAHKString() {
			return "Joy17";
		}
		public String getDescription() {
			return "Joystick Button 17";
		}
	}, JOY18 {
		public String getAHKString() {
			return "Joy18";
		}
		public String getDescription() {
			return "Joystick Button 18";
		}
	}, JOY19 {
		public String getAHKString() {
			return "Joy19";
		}
		public String getDescription() {
			return "Joystick Button 19";
		}
	}, JOY20 {
		public String getAHKString() {
			return "Joy20";
		}
		public String getDescription() {
			return "Joystick Button 20";
		}
	}, JOY21 {
		public String getAHKString() {
			return "Joy21";
		}
		public String getDescription() {
			return "Joystick Button 21";
		}
	}, JOY22 {
		public String getAHKString() {
			return "Joy22";
		}
		public String getDescription() {
			return "Joystick Button 22";
		}
	}, JOY23 {
		public String getAHKString() {
			return "Joy23";
		}
		public String getDescription() {
			return "Joystick Button 23";
		}
	}, JOY24 {
		public String getAHKString() {
			return "Joy24";
		}
		public String getDescription() {
			return "Joystick Button 24";
		}
	}, JOY25 {
		public String getAHKString() {
			return "Joy25";
		}
		public String getDescription() {
			return "Joystick Button 25";
		}
	}, JOY26 {
		public String getAHKString() {
			return "Joy26";
		}
		public String getDescription() {
			return "Joystick Button 26";
		}
	}, JOY27 {
		public String getAHKString() {
			return "Joy27";
		}
		public String getDescription() {
			return "Joystick Button 27";
		}
	}, JOY28 {
		public String getAHKString() {
			return "Joy28";
		}
		public String getDescription() {
			return "Joystick Button 28";
		}
	}, JOY29 {
		public String getAHKString() {
			return "Joy29";
		}
		public String getDescription() {
			return "Joystick Button 29";
		}
	}, JOY30 {
		public String getAHKString() {
			return "Joy30";
		}
		public String getDescription() {
			return "Joystick Button 30";
		}
	}, JOY31 {
		public String getAHKString() {
			return "Joy31";
		}
		public String getDescription() {
			return "Joystick Button 31";
		}
	}, JOY32 {
		public String getAHKString() {
			return "Joy32";
		}
		public String getDescription() {
			return "Joystick Button 32";
		}
	};

	public abstract String getAHKString();
	public abstract String getDescription();
	public boolean is(String chars) {
		return chars.equalsIgnoreCase(getAHKString());
	}

}
