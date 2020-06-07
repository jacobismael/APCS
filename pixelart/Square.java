import java.awt.Graphics;
import java.awt.Color;

public class Square{
    private int red;
    private int green;
    private int blue;
    private int size;
    
    public Square(int size) {
        this.red = 255;
        this.green = 255;
        this.blue = 255;
        this.size = size;
    }

    public Square(int s, int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
        this.size = s;
    }

    public void drawMe(Graphics g, int x, int y, boolean grid) {
        g.setColor(new Color(red, green, blue));
        g.fillRect(x, y, size, size);
        if(grid) {
            g.setColor(Color.black);
            g.drawRect(x, y, size, size);
        }
    }

    public void setColor(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public int getSize() {
        return size;
    }

    public int getR() {
        return red;
    }

    public int getG() {
        return green;
    }

    public int getB() {
        return blue;
    }
}