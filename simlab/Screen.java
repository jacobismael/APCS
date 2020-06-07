import javax.swing.*;
//import java.awt.Graphics;
//import java.awt.Graphics2d;
//import java.awt.RenderingHints;
//import java.awt.Color;
//import java.awt.Dimension;
import java.awt.*;
 
 
 
public class Screen extends JPanel {

    private Houses h1, h2;
    private TallBuilding b1, b2;
    private Tree t1, t2;
    private Color yellow1;
    private Color yellow2;
    private Color white;
    private Color transyellow, transwhite;
    private int sunX, sunY, moonX, moonY;
    private int frame;
    private Color skyBlue;
    private int z;
    private double timer;

    public Screen(){
        
        //sets up the instance variables
        h1 = new Houses(3, 4, 50, 400);        
        h2 = new Houses(4, 4, 450, 350);

        b1 = new TallBuilding(2, 2, 700, 400);
        b2 = new TallBuilding(1, 5, 50, 600);

        t1 = new Tree(3, 3, 300, 400);
        t2 = new Tree(1, 4, 500, 700);

        yellow1 = new Color(246, 227, 9);
        yellow2 = new Color(254, 254, 254);
        white = new Color(255, 255, 255);

        transyellow = new Color(1f, 1f, 0.2f, 0.4f);
        transwhite = new Color(1f, 1f, 1f, 0.4f);

        frame = 0;
        sunX = 100;
        sunY = 100;
        moonX = 50;
        moonY = 50;
    }
 
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(1000,800);
    }
     
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);

        frame += 1;

        // sky
        g.setColor(skyBlue);
        g.fillRect(0,0,1000,800);

        // sun
        g.setColor(transyellow);
        g.fillOval(sunX - 20, sunY - 20, 90, 90);
        g.setColor(yellow1);
        g.fillOval(sunX, sunY, 50, 50);
        // moon
        g.setColor(transwhite);
        g.fillOval(moonX - 10, moonY - 10, 50, 50);
        g.setColor(white);
        g.fillOval(moonX, moonY, 30, 30);

        g.setColor(new Color(0,255,0));
        g.fillRect(0, 300, 1000, 500);

        h1.drawMe(g);

        h2.drawMe(g);

        b1.drawMe(g);

        b2.drawMe(g);

        t1.drawMe(g);
            
        t2.drawMe(g);
     
     
    }

    public void animate() {
        while(true) {

            sunY = 400 - (int)(Math.sin(frame * 0.01)*300);
            sunX = 400 - (int)(Math.cos(frame * 0.01)*300);

            moonY =  400 + (int)(Math.sin(frame * 0.01)*300);
            moonX = 400 + (int)(Math.cos(frame * 0.01)*300);

            // if(skyBlue > 100 && skyBlue < 256) {
            //     skyBlue-=4;
            // } else {
            //     skyBlue+=4;
            // }
            timer+=0.01;

            z = (int) (63 * Math.sin(timer) + 63) + 100;      
            skyBlue = new Color(135, z, 235);      

            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            repaint();
        }
        
    }
 
}