import java.awt.Graphics;
import java.awt.Color;

public class MediumCar extends Automobile {

    public MediumCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
    }

    public void drawMe(Graphics g) {
        drawFrame(g);
        drawWindows(g);
        drawWheels(g);
    }

    public void drawFrame(Graphics g) {
        super.drawFrame(g);

        g.setColor(Color.YELLOW);

        g.fillOval(getX() - 3, getY() + 2, 5, 10);
    }

    public void drawWindows(Graphics g) {

        g.setColor(Color.BLACK);

        g.drawLine(getX() + 20, getY() - 10, getX() + 15, getY());
        g.drawLine(getX() + getWidth() - 15, getY() - 10, getX() + getWidth() - 10, getY());
        g.drawLine(getX() + 20, getY() - 10, getX() + getWidth() - 15, getY() - 10);

        g.drawLine(getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2), getY() - 10,
                getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2), getY());
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