import java.awt.Color;
import java.awt.Graphics;

public class Coin extends Item {

    public Coin(int x, int y) {
        super(x, y, 10, 10, "Coin");
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        g.setColor(Color.yellow);
        g.fillOval(getX()+xDiff, getY()+yDiff, getWidth(), getHeight());
    }

    // public void drawInventoryItem(Graphics g, int x, int y) {
    //     super.drawInventoryItem(g, x, y);
    //     g.setColor(Color.yellow);
    //     g.fillOval(x+10, y+10, 30, 30);
    // }

    public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(getX()+xDiff-2, getY()+yDiff+7, 15, 5);
	}


    public boolean isCoin() {
        return true;
    }
}
