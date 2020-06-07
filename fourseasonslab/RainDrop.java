import java.awt.Color;
import java.awt.Graphics;
 
 
public class RainDrop{
    
    private int x;
    private int y;
    private Color blue;

    public RainDrop() {
        x = (int)(Math.random() * 799);
        y = (int)(Math.random() * 596);
        blue = new Color(0,0,255);
    }
     
    public void drawMe(Graphics g) {
        g.setColor(blue);
        g.fillRect(x, y, 2, 5);
    }
    
    public void fall() {
        y++;
        if(y > 600) { 
            y = 0;
            x = (int)(Math.random() * 799);
        }
    }
}