package physics;

/**
 * Created by mario on 1/25/2017.
 */
public class SecondWindow extends Graphics {
	public SecondWindow() {
		super("Another Window");
		imgBuffer = frame.createImage(width, height);
	}

	@Override
	public void run() {
		while (running) {
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

	private void draw() {

	}
}
