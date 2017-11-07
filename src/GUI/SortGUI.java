package GUI;

import javax.swing.JFrame;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment SortGUI
 */
public class SortGUI extends JFrame {
	
	/* just a basic GUI to start with */
	public static void main(String[] args) {
		JFrame f = new SortGUI();
		f.setVisible(true);
	}
	
	/* just for fun made the color pane */
	// variable for window size
	private final int WIDTH = 255 * 255 * 255;
	private final int HEIGHT = 800;
	
	public SortGUI() {
		this.setTitle("Testing");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* add Graphic view */
		GraphicView gv = new GraphicView();
		this.add(gv);
	}
}
