package physics;

import java.awt.event.KeyEvent;

/**
 * Created by mario on 1/25/2017.
 */
public class KeyHandler {
	public static void pressKey(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		switch(keyCode) {

		}
		switch(keyChar) {
			case 'x':
				Main.secondWindow.setVisible(true);
		}
	}
}
