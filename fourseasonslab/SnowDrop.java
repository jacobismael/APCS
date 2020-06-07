import java.awt.Color;
import java.awt.Graphics;

public class SnowDrop {
    private int x;
    private int y;
    private Color white;

    public SnowDrop() {
        x = (int)(Math.random() * 799);
        y = (int)(Math.random() * 596);
        white = new Color(255,255,255);
    }
     
    public void drawMe(Graphics g) {
        g.setColor(white);
        g.fillOval(x, y, 2, 2);
    }
    
    public void fall() {
        y++;
        if(y > 600) { 
            y = 0;
            x = (int)(Math.random() * 799);
        }
    }
}