import java.awt.Color;
import java.awt.Graphics;

public class HealthBar {

    int w, h;
    int x, y;

    public HealthBar() {
        
        this.w = 50;
        this.h = 5;
    }

    public void drawMe(Graphics g, int x, int y, int lives) {
        g.setColor(Color.green);
        g.fillRect(x, y - 10, ((w / lives) * lives), h);
    }

}