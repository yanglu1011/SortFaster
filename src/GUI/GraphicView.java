package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import sortAlgorithms.Bubblesort;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment GraphicView
 */
public class GraphicView extends JPanel {

	
	
	private class KeyboardListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent key) {
			if (key.getKeyCode() == KeyEvent.VK_SPACE){
				bs.sort(arr);
				bs.isSorted(arr);
				repaint();
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
		}

	}

	private int[] arr;
	private int width;
	private int height;
	private Bubblesort bs = new Bubblesort();
	
	public GraphicView(int[] arr, int width, int height) {
		this.arr = arr;
		this.width = width;
		this.height = height;
		this.addKeyListener(new KeyboardListener());
	}
		

	@Override
	public void paintComponent(Graphics g1) {
		super.paintComponent(g1);
		Graphics2D g2 = (Graphics2D) g1;

		// draw the array boxes
		drawNodes(g2);
		drawValue(g2);
		
		/* this is going to be later */
		/* let's try draw the colors through */
		/* unsure about possible implement of sorting colors */
//		colorPane(g2);
	}

	/* I am thinking to draw grid size based off the available space across the window */
	private void drawNodes(Graphics2D g2) {
		int halfH = height / 2;
		int space = width / arr.length;
//		System.out.println(space);
		int nodeSize = space - 5;
		// start position
		int startY = halfH - nodeSize / 2;
		for (int i = 0; i < arr.length; i++){
			g2.drawRect(i * space, startY, nodeSize, nodeSize);
		}
	}
	
	private void drawValue(Graphics2D g2) {
		int halfH = height / 2;
		int space = width / arr.length;
		int nodeSize = space - 5;
		// start position
		int startY = halfH - nodeSize / 2;
		for (int i = 0; i < arr.length; i++){
			String str = "" + arr[i];
			g2.drawString(str, i * space + space / 2, halfH);
		}
	}

	public void colorPane(Graphics2D g2) {
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 800;
		int r = 0, g = 0, b = 0;
		
		for (r = 0; r < 255; r++) {
			Color c = new Color(r, g, b);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
		for (g = 0; g < 255; g++) {
			Color c = new Color(r, g, b);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
		for (r = 255; r > 0; r--) {
			Color c = new Color(r, g, b);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
		for (b = 0; b < 255; b++) {
			Color c = new Color(r, g, b);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
		for (g = 255; g > 0; g--) {
			Color c = new Color(r, g, b);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
		for (r = 0; r < 255; r++) {
			Color c = new Color(r, g, b);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
		for (b = 255; b > 0; b--) {
			Color c = new Color(r, g, b);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
		for (g = 0; g < 255; g++) {
			Color c = new Color(r, g, g);
			g2.setColor(c);
			g2.drawLine(x1, y1, x2, y2);
			x1++;
			x2++;
		}
	}
}
