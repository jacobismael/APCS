import java.awt.Color;
import java.awt.Graphics;

public class Player
{
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean attacking;

	private int health;
	
	public Player(int x, int y)
	{	
		this.x = x;
		this.y = y;
		
		this.width=10;	 //total width of the player
		this.height=30;  //total height of the player

		this.attacking = false;
		this.health = 100;
	}
	

	public void drawMe(Graphics g)
	{
		if(attacking) {
			g.setColor(new Color(1.0f, 1.0f, 1.0f, 0.7f));
			g.fillOval(x-20,y, 50, 20);
		}
		g.setColor(Color.BLUE);
		g.fillRect(x+3,y,4,10);
		g.fillOval(x, y-10, 10, 10);

	}

	public void attack() {
		attacking = true;
	}

	public void setAttacking(boolean state) {
		this.attacking = state;
	}

	public void drawShadow(Graphics g) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(x-5, y+5, 20, 10);
	}
	
	public boolean checkCollision(Item item, int xDiff, int yDiff){
		
		

		int pX = x;
		int pY = y;
		int pWidth = width;
		int pHeight = height;
		
		int tX = item.getX()+xDiff;
		int tY = item.getY()+yDiff;
		int tWidth = item.getWidth();
		int tHeight = item.getHeight();
		
		
		if( pX+pWidth >= tX && pX <= tX + tWidth  &&  
			pY+pHeight >= tY && pY <= tY + tHeight )
		{
			return true;
			
		}
			
		
		
		
		return false;
	}

	public boolean checkCollision(Entity item, int xDiff, int yDiff){
		
		

		int pX = x;
		int pY = y;
		int pWidth = width;
		int pHeight = height;
		
		int tX = item.getX()+xDiff;
		int tY = item.getY()+yDiff;
		int tWidth = item.getWidth();
		int tHeight = item.getHeight();
		
		
		if( pX+pWidth >= tX && pX <= tX + tWidth  &&  
			pY+pHeight >= tY && pY <= tY + tHeight )
		{
			return true;
			
		}
			
		
		
		
		return false;
	}

	public void changeHealth(int delta) {
		this.health += delta;
	}

	public int getHealth() {
		return health;
	}

	public boolean checkCollision(Person item, int xDiff, int yDiff){
		
		

		int pX = x-20;
		int pY = y-20;
		int pWidth = width+40;
		int pHeight = height+40;
		
		int tX = item.getX()+xDiff;
		int tY = item.getY()+yDiff;
		int tWidth = item.getWidth();
		int tHeight = item.getHeight();
		
		
		if( pX+pWidth >= tX && pX <= tX + tWidth  &&  
			pY+pHeight >= tY && pY <= tY + tHeight )
		{
			return true;
			
		}
		
		return false;
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

}
