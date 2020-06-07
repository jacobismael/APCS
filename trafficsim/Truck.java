import java.awt.Graphics;
import java.awt.Color;

public class Truck extends BigCar {

    public Truck(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        setSpeed(1);
    }

    public void drawMe(Graphics g) {
        super.drawMe(g);
    }

    public void drawFrame(Graphics g) {

        if(getLightT() == 1) {
            g.setColor(new Color(1f, 1f, 0.2f, 0.7f));
            g.fillOval(getX()-20, getY(), 25, 10);
        }

        super.drawFrame(g);

        g.setColor(Color.BLACK);

        g.drawLine(getX() + 15, getY()-5, getX() + 20, getY() + getHeight());

        g.drawLine(getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2), getY()-5,
                getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2), getY() + getHeight());

        g.drawLine(getX() + getWidth() - 10, getY()-5, getX() + getWidth() - 15, getY() + getHeight());

        g.setColor(getBodyColor());

        g.fillRect(getX()+getWidth(), getY()-5, 15, (getHeight()/2)+5);
    }

}