import java.awt.Graphics;
import java.awt.Color;

public class Houses {
     
    private Color brown;
    private Color darkBrown;
    private Color green;
    
    private int rows, cols, x, y;

    public Houses(int rows, int cols, int x, int y) {
        brown = new Color(222, 184, 135);
        darkBrown = new Color(122, 84, 35);
        green = new Color(0, 155, 0);
        this.rows = rows;
        this.cols = cols;
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g) {
        int xCoords = x;
        int yCoords = y;
        for(int r = 0; r<rows; r++) {
            for(int c = 0; c<cols; c++) {
                // draw one house
                g.setColor(brown);
                g.fillRect(xCoords, yCoords, 30, 20);
                g.setColor(green);
                g.fillRect(xCoords, yCoords + 15, 30, 5);
                g.setColor(darkBrown);
                g.fillRect(xCoords - 5, yCoords - 10, 40, 10);
                g.fillRect(xCoords + 13, yCoords + 10, 5, 10);
                xCoords += 50;
            }
            yCoords += 50;
            xCoords = x;
        }
    }
     
}