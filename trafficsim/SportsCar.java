import java.awt.Graphics;
import java.awt.Color;

public class SportsCar extends MediumCar {
    public SportsCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
        setSpeed(5);
    }

    public void drawFrame(Graphics g) {
        // g.setColor(getBodyColor());
        // g.fillRect(getX()+13, getY()-8, 54, 10);
        // g.setColor(new Color(100, 100, 255));
        // g.fillRect(getX()+15, getY()-6, 50, 10);

        
        if(getLightT() == 1) {
            g.setColor(new Color(1f, 1f, 0.2f, 0.7f));
            g.fillOval(getX()-20, getY(), 25, 10);
        }
        
        super.drawFrame(g);
        
        g.setColor(Color.YELLOW);

        g.fillOval(getX() - 3, getY() + 2, 5, 10);

        g.setColor(Color.BLACK);

        g.drawLine(getX() + 15, getY(), getX() + 20, getY() + getHeight());

        g.drawLine(getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2) + 10, getY(),
                getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2) + 10, getY() + getHeight());

        // g.setColor(Color.BLACK);

        // g.drawOval(getX()-3, getY()+2, 5, 10);
    }

    public void drawWindows(Graphics g) {

        g.setColor(Color.BLACK);

        g.drawLine(getX() + 20, getY() - 10, getX() + 15, getY());
        g.drawLine(getX() + getWidth() - 15, getY() - 10, getX() + getWidth() - 10, getY());
        g.drawLine(getX() + 20, getY() - 10, getX() + getWidth() - 15, getY() - 10);

        g.drawLine(getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2) + 10, getY() - 10,
                getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2) + 10, getY());
    }

    public void drawWheels(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillOval(getX() + 5, getY() + 10, 15, 15);
        g.fillOval(getX() + 50, getY() + 10, 15, 15);

        g.setColor(new Color(100, 100, 100));

        g.fillOval(getX() + 8, getY() + 13, 9, 9);
        g.fillOval(getX() + 53, getY() + 13, 9, 9);

    }
}