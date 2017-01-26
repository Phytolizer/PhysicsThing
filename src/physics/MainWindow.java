package physics;

import java.awt.*;

/**
 * Created by mario on 1/25/2017.
 */
public class MainWindow extends Graphics {
	public MainWindow() {
		super("Menu");
		imgBuffer = frame.createImage(width, height);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
	}

	@Override
	public void run() {
		while (running) {
			Background.updateColor();
			updateSize();
			if(visible) {
				startDraw();
				draw();
				endDraw();
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void draw() {
		art.setColor(Background.getCurrentColor());
		art.fillRect(0, 0, width, height);
		art.setColor(Color.black);
		DrawingTools.drawTextAround(f, "Physics Simulator!",width / 2, WINDOW_BAR_HEIGHT + 30, art);
	}
}
