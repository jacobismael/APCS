import java.awt.Color;
import java.awt.Graphics;

public class Structure extends Wall {
	private int x;
	private int y;
	private int width;
	private int height;

	public Structure(int x, int y, int width, int height) {
		super(x, y, width, height);

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void drawMe(Graphics g, int xDiff, int yDiff) {

        drawShadow(g, xDiff, yDiff);
        drawMain(g, xDiff, yDiff);

    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

	public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(x+xDiff-10, y+yDiff+50, width*2, width);
	}

	public void drawMain(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(50,50,50));
		g.fillRect(x+xDiff, y+yDiff+20, width, height);
	}

}
