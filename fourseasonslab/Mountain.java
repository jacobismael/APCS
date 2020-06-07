import java.awt.Color;
import java.awt.Graphics;

public class Mountain {
    private Color gray;
    private Color white;

    private int x;
    private int[] xCoords;
    private int[] yCoords;

    private int[] sxCoords;
    private int[] syCoords;

    public Mountain() {
        x = (int)(Math.random() * 801);
        xCoords = new int[5];
        yCoords = new int[5];
        sxCoords = new int[3];
        syCoords = new int[3];

        xCoords[0] = x - 100;
        xCoords[1] = x + 100;
        xCoords[2] = x + 50;
        xCoords[3] = x;
        xCoords[4] = x - 50;

        sxCoords[0] = xCoords[4];
        sxCoords[1] = xCoords[2];
        sxCoords[2] = xCoords[3];

        yCoords[0] = 500;
        yCoords[1] = 500;
        yCoords[2] = 300;
        yCoords[3] = 100;
        yCoords[4] = 300;

        syCoords[0] = yCoords[4];
        syCoords[1] = yCoords[2];
        syCoords[2] = yCoords[3];

        gray = new Color(50, 50, 50);
        white = new Color(255, 255, 255);
    }

    public void drawMe(Graphics g, int season) {
        g.setColor(gray);

        g.fillPolygon(xCoords, yCoords, 5);
        if(season == 1) {
            g.setColor(white);
            g.fillPolygon(sxCoords, syCoords, 3);
        }
    }
}