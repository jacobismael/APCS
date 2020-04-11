import java.awt.Graphics;
import java.awt.Color;

public class TallBuilding {

    private int cols, rows;
    private int x, y;
    private Color gray;
    private Color yellow;

    public TallBuilding(int rows, int cols, int x, int y) {
        this.rows = rows;
        this.cols = cols;
        this.x = x;
        this.y = y;
        
        gray = new Color(50,50,50);
        yellow = new Color(255, 255, 0);
    }

    public void drawMe(Graphics g) {
        int xCoords = x;
        int yCoords = y;
        for(int r = 0; r<rows; r++) {
            for(int c = 0; c<cols; c++) {
                // draw one building
                g.setColor(gray);
                g.fillRect(xCoords, yCoords, 50, 100);
                int xWin = xCoords + 8;
                int yWin = yCoords + 8;
                for(int wy = 0; wy < 8; wy++) {
                    for(int wx = 0; wx < 4; wx++) {
                        g.setColor(yellow);
                        g.fillRect(xWin,yWin,5,5);
                        xWin += 10;
                    }
                    yWin += 10;
                    xWin = xCoords + 8;
                }
                xCoords += 70;
            }
            yCoords += 120;
            xCoords = x;
        }
    }
}