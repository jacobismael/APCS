import java.awt.Graphics;
import java.awt.Color;

public class Tree {

    private int cols, rows;
    private int x, y;
    private Color brown;
    private Color green;

    public Tree(int rows, int cols, int x, int y) {
        this.rows = rows;
        this.cols = cols;
        this.x = x;
        this.y = y;

        brown = new Color(101, 67, 33);
        green = new Color(0, 155, 0);
    }

    public void drawMe(Graphics g) {
        int xCoords = x;
        int yCoords = y;
        for(int r = 0; r<rows; r++) {
            for(int c = 0; c<cols; c++) {
                g.setColor(brown);
                g.fillRect(xCoords, yCoords, 10, 40);
                g.setColor(green);
                g.fillOval(xCoords - 10, yCoords - 5, 30, 30);
                xCoords += 50;
            }
            yCoords+= 50;
            xCoords = x;
        }
    }
}