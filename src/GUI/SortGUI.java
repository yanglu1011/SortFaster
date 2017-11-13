package GUI;

import java.util.Random;

import javax.swing.JFrame;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment SortGUI
 */
public class SortGUI extends JFrame {

	// size of the array
	private int arrSize = 0;
	/* Yang: this is testing */
	public static GraphicView gv;
	
	/* just a basic GUI to start with */
	public static void main(String[] args) {
		JFrame f = new SortGUI();
		f.setVisible(true);
	}

	/* just for fun made the color pane */
	// variable for window size
	private final int WIDTH = 800;
	private final int HEIGHT = 800;

	public SortGUI() {
		// hard code for testing
		arrSize = 10;
		int[] arr = generateSet(arrSize);
		
		this.setTitle("Testing");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* add Graphic view */
		gv = new GraphicView(arr, WIDTH, HEIGHT);
		this.add(gv);
		this.addKeyListener(gv.getKeyListeners()[0]);
	}

	private int[] generateSet(int arrSize) {
		Random r = new Random();
		boolean[] inArr = new boolean[arrSize];
		int[] arr = new int[arrSize];
		
		for (int i = 0; i < arrSize; i++){
			int num = r.nextInt(arrSize);
			// if already in array skip and try another array
			if (inArr[num]){
				i--;
				continue;
			}
			
			arr[i] = num;
			inArr[num] = true;
		}
		return arr;
	}
}
