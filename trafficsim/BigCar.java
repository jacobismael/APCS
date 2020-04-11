import java.awt.Graphics;
import java.awt.Color;

public class BigCar extends Automobile {

    public BigCar(Color bodyColor, int x, int y) {
        super(bodyColor, x, y);
    }

    public void drawMe(Graphics g) {
        drawFrame(g);
        drawWindows(g);
        drawWheels(g);
    }

    public void drawFrame(Graphics g) {

        g.setColor(getBodyColor());
        g.fillRect(getX(), getY() - 5, getWidth(), getHeight() + 5);

        g.setColor(Color.YELLOW);

        g.fillOval(getX() - 3, getY() + 2, 5, 10);

    }

    public void drawWindows(Graphics g) {

        g.setColor(Color.BLACK);

        g.drawLine(getX() + 20, getY() - 15, getX() + 15, getY()-5);
        g.drawLine(getX() + getWidth() - 15, getY() - 15, getX() + getWidth() - 10, getY()-5);
        g.drawLine(getX() + 20, getY() - 15, getX() + getWidth() - 15, getY() - 15);

        g.drawLine(getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2), getY() - 15,
                getX() + ((getX() + getWidth() - 15 - getX() + 20) / 2), getY()-5);
    }

    public void drawWheels(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillOval(getX() + 3, getY() + 8, 19, 19);
        g.fillOval(getX() + 48, getY() + 8, 19, 19);

        g.setColor(new Color(100, 100, 100));

        g.fillOval(getX() + 6, getY() + 11, 13, 13);
        g.fillOval(getX() + 51, getY() + 11, 13, 13);

        g.setColor(Color.black);

        g.fillOval(getX() + 11, getY() + 16, 3, 3);
        g.fillOval(getX() + 56, getY() + 16, 3, 3);

    }

}