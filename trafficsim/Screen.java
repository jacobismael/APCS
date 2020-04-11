import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;


public class Screen extends JPanel{
	
	private ArrayList<Automobile> carList;
	private Color[] colors;

	private int frame, sunX, sunY, moonX, moonY, z;
	private Color skyBlue;
	private double timer;

	int x, y;

	public Screen(){

		colors = new Color[]{Color.red, Color.green, Color.blue, Color.magenta, Color.orange, Color.cyan, Color.gray, Color.white, new Color(50, 50, 50)};		
		
		carList = new ArrayList<Automobile>();

		frame = 0;
        sunX = 100;
        sunY = 100;
        moonX = 50;
		moonY = 50;

		x = 10;
		y = 300;

		int increment = 150;

		carList.add(new Sedan(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SportsCar(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SUV(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new Truck(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;

		carList.add(new Sedan(colors[(int)(Math.random() * colors.length)], x, y));
		x = 10;
		y+=75;
		carList.add(new SportsCar(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SUV(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new Truck(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;

		carList.add(new Sedan(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SportsCar(colors[(int)(Math.random() * colors.length)], x, y));
		x = 10;
		y+=75;
		carList.add(new SUV(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new Truck(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;

		carList.add(new Sedan(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SportsCar(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SUV(colors[(int)(Math.random() * colors.length)], x, y));
		x = 10;
		y+=75;
		carList.add(new Truck(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;

		carList.add(new Sedan(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SportsCar(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new SUV(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
		carList.add(new Truck(colors[(int)(Math.random() * colors.length)], x, y));
		x+=increment;
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		frame += 1;

		g.setColor(skyBlue);
		g.fillRect(0,0,800,600);

        // sun
        g.setColor(new Color(1f, 1f, 0.2f, 0.4f));
        g.fillOval(sunX - 20, sunY - 20, 90, 90);
        g.setColor(new Color(246, 227, 9));
        g.fillOval(sunX, sunY, 50, 50);
        // moon
        g.setColor(new Color(1f, 1f, 1f, 0.4f));
        g.fillOval(moonX - 10, moonY - 10, 50, 50);
        g.setColor(Color.white);
		g.fillOval(moonX, moonY, 30, 30);

		g.setColor(Color.green);
		
		g.fillRect(0, 200, 800, 400);

		g.setColor(Color.darkGray);


		int y = 320;

		g.fillRect(0, y, 800, 25);
		
		y = 400;

		g.fillRect(0, y, 800, 25);
		y = 470;
		g.fillRect(0, y, 800, 25);
		y = 540;
		g.fillRect(0, y, 800, 25);
		
		//draw cars

		for (int i = 0; i < carList.size(); i++) {
			carList.get(i).drawMe(g);
		}
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
			

			for (int i = 0; i < carList.size(); i++) {
				carList.get(i).drive();
				if(z < 150) {
					carList.get(i).LightOn();
				} else {
					carList.get(i).LightOff();
				}
			}

			
			repaint();
        }
        
    }

	
	
}
