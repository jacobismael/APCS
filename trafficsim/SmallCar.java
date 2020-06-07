import java.awt.Graphics;
import java.awt.Color;

public class SmallCar extends Automobile{

    public SmallCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
    }



    public void drawFrame(Graphics g) {
        g.setColor( getBodyColor() );
        g.fillRect(getX(), getY(), getWidth()-35, getHeight()-5);
    }


    public void drawWheels(Graphics g) {
        g.setColor(Color.BLACK);

        g.fillOval(getX()+3, getY()+9, 10, 10);
        g.fillOval(getX()+20, getY()+9, 10, 10); 
    }


}