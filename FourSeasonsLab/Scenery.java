import javax.swing.JPanel;
import java.awt.*;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Scenery extends JPanel implements ActionListener {
 
    private RainDrop[] rain;
    private SnowDrop[] snow;
    private Tree[] trees;
    private Mountain[] mountains;

    private int[] cloudsP = new int[10];

    private Color yellow1;
    private Color yellow2;
    private Color transyellow, transwhite;
    private int sunX, sunY, moonX, moonY;
    private int frame;
    private Color skyBlue, gray;
    private int z;
    private double timer;

    private Color white, green, darkgreen, yellow;
    private long speed;

    private int season; // 1-winter 2-spring 3-summer 4-fall
    private JButton summer, winter, spring, fall;
    private boolean clouds;
    private int cloudsA;

    public Scenery() {

        setLayout(null);

        white = new Color(255, 255, 255);
        green = new Color(186, 220, 88);
        darkgreen = new Color(0, 148, 50);
        yellow = new Color(254, 202, 87);
        gray = new Color(50, 50, 50);

        summer = new JButton("Summer");
        summer.setBounds(10, 10, 100, 30);
        add(summer);
        summer.addActionListener(this);

        winter = new JButton("Winter");
        winter.setBounds(10, 50, 100, 30);
        add(winter);
        winter.addActionListener(this);

        spring = new JButton("Spring");
        spring.setBounds(120, 10, 100, 30);
        add(spring);
        spring.addActionListener(this);

        fall = new JButton("Fall");
        fall.setBounds(120, 50, 100, 30);
        add(fall);
        fall.addActionListener(this);

        rain = new RainDrop[1000];
        snow = new SnowDrop[1000];
        trees = new Tree[10];
        mountains = new Mountain[5];

        for(int i = 0; i < cloudsP.length; i++) {
            cloudsP[i] = (int)(Math.random() * 701);
        }

        // set up every rain drop
        for(int i = 0; i < rain.length; i++) {
            rain[i] = new RainDrop();
        }

        // set up every snowdrop
        for(int i = 0; i < snow.length; i++) {
            snow[i] = new SnowDrop();
        }

        // set up every tree
        for(int i = 0; i < trees.length; i++) {
            trees[i] = new Tree();
        }

        for(int i = 0; i < mountains.length; i++) {
            mountains[i] = new Mountain();
        }

        season = 1;
        clouds = true;
        cloudsA = 10;

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
        return new Dimension(800,600);
    }
 
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        frame += 1;

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(skyBlue);
        g.fillRect(0,0,800,600);


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

        if(season == 1) {
            speed = 10;
            // winter
            for(Mountain x : mountains) {
                x.drawMe(g, season);
            }
            for(int i = 0; i < trees.length; i++) {
                trees[i].drawMe(g, season);
            }
            for(int i = 0; i < snow.length; i++) {
                snow[i].drawMe(g);
            }
            g.setColor(white);
            g.fillRect(0, 500, 800, 100);


        } else if(season == 2) {
            speed = 5;
            // spring
            for(Mountain x : mountains) {
                x.drawMe(g, season);
            }
            for(int i = 0; i < trees.length; i++) {
                trees[i].drawMe(g, season);
            }
            // draw every rain drop
            for(int i = 0; i < rain.length; i++) {
                rain[i].drawMe(g);
            }   
            g.setColor(green);
            g.fillRect(0, 500, 800, 100);


        } else if(season == 3) {
            speed = 10;
            //summer
            for(Mountain x : mountains) {
                x.drawMe(g, season);
            }
            g.setColor(darkgreen);
            g.fillRect(0, 500, 800, 100);

            for(int i = 0; i < trees.length; i++) {
                trees[i].drawMe(g, season);
            }
        } else if(season == 4) {
            speed = 10;
            //fall
            for(Mountain x : mountains) {
                x.drawMe(g, season);
            }
            for(int i = 0; i < trees.length; i++) {
                trees[i].drawMe(g, season);
            }
            g.setColor(yellow);
            g.fillRect(0, 500, 800, 100);
        }

        if(clouds) {
            for(int i = 0; i < cloudsA; i++) {
                g.setColor(white);
                g.fillOval(cloudsP[i], 200, 100, 20);
            }
        }

        
         
    }
 
    public void animate(){
        while(true){
            //wait for .001 second

            if(season == 2) {

                try {
                    Thread.sleep(5);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                
                sunY = 400 - (int)(Math.sin(frame * 0.005)*300);
                sunX = 400 - (int)(Math.cos(frame * 0.005)*300);

                moonY =  400 + (int)(Math.sin(frame * 0.005)*300);
                moonX = 400 + (int)(Math.cos(frame * 0.005)*300);
            } else {
                sunY = 400 - (int)(Math.sin(frame * 0.005)*300);
                sunX = 400 - (int)(Math.cos(frame * 0.005)*300);

                moonY =  400 + (int)(Math.sin(frame * 0.005)*300);
                moonX = 400 + (int)(Math.cos(frame * 0.005)*300);
            }

            timer+=0.005;

            z = (int) (63 * Math.sin(timer) + 63) + 100;      
            skyBlue = new Color(135, z, 235);   

            for(int i = 0; i < rain.length; i++) {
                rain[i].fall();
            }

            for(int i = 0; i < snow.length; i++) {
                snow[i].fall();
            }

            for(Tree x : trees) {
                x.animate();
            }

            try {
                Thread.sleep(speed);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
 
            //repaint the graphics drawn
            repaint();
        }
 
    }

    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == winter) {
          season = 1;
          clouds = true;
          cloudsA = 10;
      } else if(e.getSource() == spring) {
          season = 2;
          clouds = true;
          cloudsA = 5;
      } else if(e.getSource() == summer) {
          season = 3;
          clouds = false;
      } else if(e.getSource() == fall) {
          season = 4;
          clouds = true;
          cloudsA = 5;
      }

      repaint();
    }
     
     
     
}