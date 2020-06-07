import java.awt.Color;
import java.awt.Graphics;

public class Square {
    private int x;
	private int y;
	
	public Square(int x, int y){	
		this.x = x;
		this.y = y;
	}
	

	public void drawMe(Graphics g, int xDiff, int yDiff){		
		g.setColor(Color.black);
		g.fillRect(x+xDiff,y+yDiff,10,10);
	}
}