import java.awt.Graphics;
import java.awt.Color;

public class SmallSportsCar extends SmallCar {
    
    public SmallSportsCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
    }

    public void drawFrame(Graphics g) {
        super.drawFrame(g);

        g.setColor(getBodyColor());

        int[] xArr = new int[] {getX(), getX(), getX()-15};
        int[] yArr = new int[] {getY(), getY()+getHeight()-5, getY()+getHeight()-5};


        g.fillPolygon(xArr, yArr, 3);
    
    
    
    }  

}