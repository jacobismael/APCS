import java.awt.Color;
import java.awt.Graphics;

public class Tree extends Wall {
	
	
	private int x;
	private int y;

	private Color brown;
	private Color darkGreen;

	public Tree(int x, int y) {
		super(x, y, 20, 20);

		this.x = x;
		this.y = y;
		
		brown = new Color(64, 29, 1);
		darkGreen = new Color(0, 100, 0);
	}

	public void drawMe(Graphics g, int xDiff, int yDiff) {

		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(x+xDiff, y+yDiff+20, 80, 20);

		g.setColor(brown);
		g.fillRect(x + 30 + xDiff, y + yDiff, 20, 30);

		int[] xVals = new int[3];
		xVals[0] = x + xDiff;
		xVals[1] = x + 40 + xDiff;
		xVals[2] = x + 80 + xDiff;

		int[] yVals = new int[3];
		yVals[0] = y + yDiff;
		yVals[1] = y - 100 + yDiff;
		yVals[2] = y + yDiff;

		// g.fillOval(x+xDiff,y+yDiff,100,100);
		g.setColor(darkGreen);
		g.fillPolygon(xVals, yVals, 3);

	}

	public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(x+xDiff-30, y+yDiff, 80, 20);
	}

	public void drawTrunk(Graphics g, int xDiff, int yDiff) {
		g.setColor(brown);
		// g.fillRect(x + 30 + xDiff, y + yDiff, 20, 30);
		g.fillRect(x+xDiff, y+yDiff-20, 20, 30);
	}

	public void drawLeaves(Graphics g, int xDiff, int yDiff) {
		int[] xVals = new int[3];
		xVals[0] = x - 30 + xDiff;
		xVals[1] = x + 10 + xDiff;
		xVals[2] = x + 50 + xDiff;

		int[] yVals = new int[3];
		yVals[0] = y + yDiff - 20;
		yVals[1] = y - 100 - 20 + yDiff;
		yVals[2] = y + yDiff - 20;

		// g.fillOval(x+xDiff,y+yDiff,100,100);
		g.setColor(darkGreen);
		g.fillPolygon(xVals, yVals, 3);
	}

	public boolean isTree() {
        return true;
    }

}
