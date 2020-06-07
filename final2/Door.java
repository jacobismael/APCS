import java.awt.Color;
import java.awt.Graphics;

public class Door extends Locked{

    public Door(int x, int y, int height, Switch gate) {
        super(x, y, 100, height, gate);
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        // g.setColor(new Color(31, 31, 36));
        g.setColor(new Color(74, 32, 0));
        if(getState()) {
            g.fillRect(getX()+xDiff, getY()+yDiff, 13, getHeight());
            g.fillRect(getX()+xDiff+74+13, getY()+yDiff, 13, getHeight());
        } else {
            g.fillRect(getX()+xDiff, getY()+yDiff, getWidth(), getHeight());
        }
    }

    public boolean hasState() {
        return true;
    }
}