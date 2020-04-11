import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import java.util.ArrayList;
import java.lang.Math;
// import java.awt.event.EventListener;
 
 

// import jdk.internal.org.jline.terminal.MouseEvent;

public class Screen extends JPanel {

	private Color yellow;
	ArrayList<Integer> starsX;
	ArrayList<Integer> starsY;
	Random rand;
	public Color yellow2;
	private Color black;
	private Color green;
	private Color blue;
	private Color transyellow;
	private Color transblue;
	private Color white;
	private int moonX;
	private int moonY;
	private int cometX, cometY;
	private int starsize;
	private boolean noSphere;
	private int px, py, px2, py2, h, w, w2, h2;
	private int planetX, planetY;
	private int frame;
	
	public Screen() {
		frame = 0;
		rand = new Random();
		yellow = new Color(246, 227, 9);
		yellow2 = new Color(254, 254, 254);
		black = new Color(0,0,0);
    	blue = new Color(207, 224, 255);
		white = new Color(255, 255, 255);
		green = new Color(0, 255, 0);
		transyellow = new Color(1f, 1f, 0.2f, 0.1f);
		transblue = new Color(0.8f, 0.8f, 1f, 0.5f);
		moonX = -100;
		moonY = 477;
		cometX = 400;
		cometY = 0;
		px = 50;
		py = 50;
		px2 = 50;
		py2 = 50;
		w = 5;
		h = 5;
		h2 = 5;
		w2 = 5;
		planetX = 300;
		planetY = 300;
		noSphere = true;
		starsize = 2000;
		starsX = new ArrayList<Integer>();
		starsY = new ArrayList<Integer>();
		
		for(int i = 0; i<starsize; i++) {
    		starsX.add(rand.nextInt(800));
		}

		for(int i = 0; i<starsize; i++) {
			starsY.add(rand.nextInt(600));
		}
	}
 
    public Dimension getPreferredSize(){
        return new Dimension(800,600);
    }
     
    public void paintComponent(Graphics g){
		super.paintComponent(g);
		frame += 1;
		//space
		g.setColor(black);
		g.fillRect(0,0,1000,800);

		g.setColor(white);
		for(int i=0; i<starsize; i++) {
			g.fillOval(starsX.get(i), starsY.get(i), 2, 2);
		}
		/*
		for (int i = 0; i<100; i++) {
			System.out.println("star " + i);
			g.setColor(white);
			g.fillOval(rand.nextInt(), rand.nextInt(), 50,50);
			
		}
		*/

		g.setColor(transblue);
		g.fillOval(px2, py2, w2, h2);
		g.setColor(white);
		g.fillOval(px, py, w, h);

		
		if(noSphere){
			g.setColor(transyellow);
        	g.fillOval(250, 150, 300, 300);
		}

    // comet
    g.setColor(white);
		g.fillOval(cometX-32, cometY-16, 8, 8);
		g.fillOval(cometX-28, cometY-14, 8, 8);
		g.fillOval(cometX-24, cometY-12, 9, 9);
    g.fillOval(cometX-20, cometY-10, 9, 9);
		g.fillOval(cometX-16, cometY-8, 10, 10);
		g.fillOval(cometX-12, cometY-6, 10, 10);
		g.fillOval(cometX-8, cometY-4, 11, 11);
		g.fillOval(cometX-4, cometY-2, 11, 11);
    g.setColor(blue);
		g.fillOval(cometX, cometY, 12, 12);
		
		g.setColor(green);
		g.fillOval(planetX, planetY, 30, 30);
		g.setColor(blue);
		g.fillOval(planetX + 5, planetY + 5, 20, 20);
		
		// the sun
		g.setColor(yellow);
		g.fillOval(350, 250, 100, 100);
		g.setColor(yellow2);
		g.fillOval(367, 267, 65, 65);

    if(!noSphere) {
      g.setColor(black);
      g.fillOval(350, 250, 100, 100);
    }
		
		g.setColor(black);
		g.fillOval(moonX, moonY, 96, 96);
    }
	
	public void animate() {
		while(true) {
			frame += 1;
			moonX+=2;
			moonY--;
			
			h+=4;
			w+=4;
			w2+=64;
			h2+=64;
			px2-=32;
			py2-=32;
			px-=2;
			py-=2;
			//planetX = (int)(Math.sin(frame) * 10);
			planetY = (int)(Math.sin(frame * 0.1)*100) + 300;
			planetX = (int)(Math.cos(frame * 0.1)*100) + 400;
			  cometX +=10;
			  cometY+=5;
			  

			  if (cometX > 800) {
				cometX = 400;
				cometY = 0;
			  }
					
					if(w > 30){
						w = 5;
						h = 5;
						w2 = 5;
						h2 = 5;
						px = 50;
						py = 50;
						px2 = 50;
						py2 = 50;
					}

					try {
						Thread.sleep(50);
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
					
					if(moonX > 800) {
						moonX = -100;
						moonY = 477;
					}
					
					repaint();
		}
	}
	
	/*
	public void mouseClicked(MouseEvent e) {
		System.out.println("Hi");
	}
	*/
}