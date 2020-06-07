import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Scenery extends JPanel {
	
	private int background; // 1-night 2-day
	private int clouds; // 1-yes 2-no
	private Color lightBlue = new Color(108, 206, 209);
	private Color darkBlue = new Color(0, 0, 15);
	private Color white = new Color(255, 255, 255);
	private Color brown = new Color(69, 38, 1);
	private Color lightGreen = new Color(10, 255, 35);
	private Color black = new Color(0, 0, 0);
	private Color yellow = new Color(255, 255 , 0);
	private Color gray = new Color(10, 10, 10);
	
	public Scenery(int background, int clouds) {
		this.background = background;
		this.clouds = clouds;
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(800, 600);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (background == 1) {
			g.setColor(darkBlue);
		} else if (background == 2) {
			g.setColor(lightBlue);
		}
		g.fillRect(0,0,800,600);
		
		if (background == 1) {
			if (clouds == 1) {
				g.setColor(gray);
				g.fillOval(50, 200, 300, 50);
				g.fillOval(400, 50, 300, 50);
				g.fillOval(200, 400, 300, 50);	
			}
			g.setColor(yellow);
			g.fillOval(0, 210, 200, 200);
			g.fillOval(300, 210, 200, 200);
			g.fillOval(600, 210, 200, 200);

			g.setColor(black);
			g.fillRect(387, 300, 25, 30);
			g.fillRect(393, 300, 13, 200);
			g.fillRect(385, 400, 30, 50);
			g.fillRect(380, 450, 40, 50);

			g.fillRect(687, 300, 25, 30);
			g.fillRect(693, 300, 13, 200);
			g.fillRect(685, 400, 30, 50);
			g.fillRect(680, 450, 40, 50);

			g.fillRect(87, 300, 25, 30);
			g.fillRect(93, 300, 13, 200);
			g.fillRect(85, 400, 30, 50);
			g.fillRect(80, 450, 40, 50);

			g.fillRect(150, 200, 50, 300);
			g.fillOval(-50, 30, 500, 200);
			g.fillRect(600, 200, 50, 300);
			g.fillOval(400, 30, 500, 200);
			g.fillRect(0,500,800,100);
		} else if (background == 2) {
			g.setColor(yellow);
			g.fillOval(0,0,100,100);
			if (clouds == 1) {
				g.setColor(white);
				g.fillOval(50, 200, 300, 50);
				g.fillOval(400, 50, 300, 50);
				g.fillOval(200, 400, 300, 50);	
			}
			g.setColor(black);
			g.fillRect(387, 300, 25, 30);
			g.fillRect(393, 300, 13, 200);
			g.fillRect(385, 400, 30, 50);
			g.fillRect(380, 450, 40, 50);

			g.fillRect(687, 300, 25, 30);
			g.fillRect(693, 300, 13, 200);
			g.fillRect(685, 400, 30, 50);
			g.fillRect(680, 450, 40, 50);

			g.fillRect(87, 300, 25, 30);
			g.fillRect(93, 300, 13, 200);
			g.fillRect(85, 400, 30, 50);
			g.fillRect(80, 450, 40, 50);

			g.setColor(brown);
			g.fillRect(150, 200, 50, 300);
			g.setColor(lightGreen);
			g.fillOval(-50, 30, 500, 200);
			g.setColor(brown);
			g.fillRect(600, 200, 50, 300);
			g.setColor(lightGreen);
			g.fillOval(400, 30, 500, 200);
			g.setColor(lightGreen);
			g.fillRect(0,500,800,100);
		}

	}
}