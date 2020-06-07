import java.awt.Color;
import java.awt.Graphics;

public class Person extends Entity {
    
    private Color color;
    private boolean isEnemy;
    private boolean alive;
    private int lives;
    private boolean boss;

    public Person(int x, int y, String name, Color c, boolean isEnemy) {
        super(x, y, 10, 30, name);
        this.color = c;
        this.isEnemy = isEnemy;
        this.alive = true;
        this.lives = 1;
    }

    public Person(int x, int y, String name, Color c, boolean isEnemy, int lives) {
        super(x, y, 10, 30, name);
        this.color = c;
        this.isEnemy = isEnemy;
        this.alive = true;
        this.lives = lives;
        this.boss = true;
    }

    public void drawMe(Graphics g, int xDiff, int yDiff)
	{
		g.setColor(color);
		g.fillRect(getX()+3+xDiff,getY()+yDiff,4,10);
		g.fillOval(getX()+xDiff, getY()-10+yDiff, 10, 10);
	}

	public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(getX()+xDiff-5, getY()+5+yDiff, 20, 10);
    }
    
    public boolean isTouchingPlayer(Player p1, int xDiff, int yDiff) {
        int pX = getX()+xDiff;
		int pY = getY()+yDiff;
		int pWidth = getWidth();
		int pHeight = getHeight();
		
		int tX = p1.getX();
		int tY = p1.getY();
		int tWidth = p1.getWidth();
		int tHeight = p1.getHeight();
		
		if( pX+pWidth >= tX && pX <= tX + tWidth  &&  
			pY+pHeight >= tY && pY <= tY + tHeight )
		{
			return true;
			
		}
			
		
		
		
		return false;
    }

    public void loseLife() {
        lives--;
    }

    public boolean died() {
        return (lives == 0);
    }

    public boolean isEnemy() {
        return isEnemy;
    }


    public void moveX(int delta) {
        changeX(delta);
    }

    public void moveY(int delta) {
        changeY(delta);
    }


    public boolean isAlive() {
        return alive;
    }

    public void die() {
        alive = false;
    }

    public boolean isBoss() {
        return this.boss;
    }
}