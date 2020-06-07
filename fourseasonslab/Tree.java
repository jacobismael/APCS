import java.awt.Color;
import java.awt.Graphics;

public class Tree {
    
    private int x, y;
    private Color brown, leaf;

    private Color orange, red, yellow;
    private int color;

    private Leaf[] leaves;

    public Tree() {
        y = 400;
        x = (int)(Math.random() * 749);

        leaves = new Leaf[10];

        brown = new Color(83,53,10);

        orange = new Color(255, 179, 0);
        red = new Color(255, 0, 0);
        yellow = new Color(255, 255, 0);

        color = (int)(Math.random() * 3);

        // set up every leaf
        for(int i = 0; i < leaves.length; i++) {
            leaves[i] = new Leaf(this.x, this.x + 50);
        }
    }

    public void drawMe(Graphics g, int season) {
        if(season == 1) {
            g.setColor(brown);
            g.fillRect(x + 20, y + 10, 10, 90);
            // g.setColor(leaf);
            // g.fillOval(x, y, 50, 50); 
        } else if(season == 2) {
            leaf = new Color(0, 235, 135);
            g.setColor(brown);
            g.fillRect(x + 20, y + 10, 10, 90);
            g.setColor(leaf);
            g.fillOval(x, y, 50, 50); 
        } else if(season == 3) {
            leaf = new Color(0, 135, 135);
            g.setColor(brown);
            g.fillRect(x + 20, y + 10, 10, 90);
            g.setColor(leaf);
            g.fillOval(x, y, 50, 50); 
        } else if(season == 4) {

            g.setColor(brown);
            g.fillRect(x + 20, y + 10, 10, 90);
            for(Leaf x : leaves) {
                x.drawMe(g);
            }
            if(color == 0) {
                g.setColor(red);
            } else if(color == 1) {
                g.setColor(yellow);
            } else if(color == 2) {
                g.setColor(orange);
            }
            g.fillOval(x, y, 50, 50); 
        }

    }

    public void animate() {
        for(Leaf x : leaves) {
            x.fall();
        }
    }



}