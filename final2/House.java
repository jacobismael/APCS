import java.awt.Color;
import java.awt.Graphics;

public class House extends Structure{
 
    public House(int x, int y) {
        super(x, y, 80, 70);
    }

    public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(getX()+xDiff-40, getY()+yDiff+60, 100, 20);
	}

	public void drawMain(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(82, 52, 33));
        g.fillRect(getX()+xDiff-30, getY()+yDiff, 80, 70);
        g.setColor(Color.black);
        g.fillRect(getX()+xDiff, getY()+yDiff+40, 20, 30);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(getX()+xDiff-40, getY()+yDiff, 100, 10);
	}

}