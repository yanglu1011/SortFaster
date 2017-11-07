package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment GraphicView
 */
public class GraphicView extends JPanel {

	public GraphicView() {
		// repaint();
	}

	@Override
	public void paintComponent(Graphics g1) {
		super.paintComponent(g1);
		Graphics2D g2 = (Graphics2D) g1;

		/* let's try draw the colors through */
		/* unsure about possible implement of sorting colors */
		colorPane(g2);
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
