import java.awt.Graphics;
import java.awt.Color;

public class Automobile{

	private Color bodyColor;
	private int x = 100;
	private int y = 100;
	private int width;
	private int height;
	private int speed;
	private int lighttoggle;
	
	
	public Automobile(Color bodyColor, int x, int y){

		this.bodyColor = bodyColor;
		this.x = x;
		this.y = y;
		this.width = 70;
		this.height = 20;
		this.speed = 1;

		this.lighttoggle = 0;
	}

		
	public void drawMe(Graphics g){
		
		this.drawFrame(g);
		this.drawWheels(g);
	}
	
	public void drawFrame(Graphics g){
		g.setColor( bodyColor );
		g.fillRect(x,y,width,height);
	}
	
	public void drawWheels(Graphics g){	
		g.setColor( Color.black );
		g.fillOval(x+5,y+10, 15, 15);
		g.fillOval(x+50,y+10, 15, 15);
	}

	public Color getBodyColor() {
        return bodyColor;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getSpeed() {
		return speed;
	}

	public void setX(int x) {
		this.x = x;
	}	

	public void setY(int y) {
		this.y = y;
	}

	public void drive() {
		x -= speed;

		if(x < -100) {
			x = 850;
		}
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public void LightOn() {
		lighttoggle = 1;
	}

	public void LightOff() {
		lighttoggle = 0;
	}

	public int getLightT() {
		return lighttoggle;
	}
	
}