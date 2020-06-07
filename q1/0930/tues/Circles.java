import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
 
public class Circles extends JPanel {
    private int x, y;
 
    public Circles() {
        //(1) What is imported to get Graphics to work?
        x = 400;
        y = 200;
 
    }
 
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        //(2) In the paintComponent method, what do you think it is drawing?
        Color colorRed = new Color(255, 255, 0);
		Color colorBrown = new Color(51,25,0);
		Color colorGreen = new Color(0, 255, 0);
        g.setColor(colorRed);
        g.fillOval(x,y,50,50);
		g.setColor(colorBrown);
		g.fillRect(x + 85, y + 50, 30, 100);	
		g.setColor(colorGreen);
		g.fillOval(x + 50, y + 25, 100, 100);
 
 
    }
 
 
}