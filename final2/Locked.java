import java.awt.Color;
import java.awt.Graphics;

public class Locked extends Wall {
    
    private boolean open;
    private Switch gate;

    public Locked(int x, int y, int width, int height, Switch gate) {
        super(x, y, width, height);
        this.gate = gate;
        open = gate.getState();
    }

    public void interact() {
        open = !open;
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        if(open) {
            g.setColor(Color.red);
        } else {
            g.setColor(Color.green);
        }
        g.fillRect(getX()+xDiff, getY()+yDiff, getWidth(), getHeight());
    }

    public void checkState() {
        this.open = gate.getState();
        changeState(open);
    }

    public boolean getState() {
        return open;
    }
}