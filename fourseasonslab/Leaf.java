import java.awt.Color;
import java.awt.Graphics;
 
 
public class Leaf{
    
    private int x;
    private int y;
    private Color orange, red, yellow;
    private int color;

    public Leaf(int xmin, int xmax) {
        x = (int)(Math.random() * (xmax - xmin) + xmin);
        y = (int)(Math.random() * 196 + 300);
        orange = new Color(255, 179, 0);
        red = new Color(255, 0, 0);
        yellow = new Color(255, 255, 0);

        color = (int)(Math.random() * 3);
    }
     
    public void drawMe(Graphics g) {
        if(color == 0) {
            g.setColor(red);
        } else if(color == 1) {
            g.setColor(yellow);
        } else if(color == 2) {
            g.setColor(orange);
        }
        g.fillOval(x, y, 2, 2);
    }
    
    public void fall() {
        y++;
        if(y > 600) { 
            y = 450;
        }
    }
}