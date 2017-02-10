package physics;

/**
 * @author onContentStop
 */
public class Main {
	public static MainWindow mainWindow;
	public static SecondWindow secondWindow;
	public static Timer colorSwitcher;

	public static void main(String[] args) {
		colorSwitcher = new Timer();
		new Thread(colorSwitcher).start();
		mainWindow = new MainWindow();
		mainWindow.setVisible(true);
		new Thread(mainWindow).start();
		secondWindow = new SecondWindow();
		new Thread(secondWindow).start();
	}
}
