import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Entity {

    private boolean clear;

    public Wall(int x, int y, int width, int height) {
        super(x, y, width, height, "wall");

        this.clear = false;
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        // g.setColor(new Color(31, 31, 36));
        g.setColor(Color.black);
        g.fillRect(getX()+xDiff, getY()+yDiff, getWidth(), getHeight());
    }

    public boolean isTouching(int xDiff, int yDiff) {
        if(!clear) {
            return Collisions.collide(getX(), getY(), getWidth(), getHeight(), ((1000-10)/2)-xDiff, ((800-20)/2)-yDiff, 10, 30);
        }
        return false;
    }

    public void changeState(boolean state) {
        this.clear = state;
    }

    public boolean isWall() {
        return true;
    }
}