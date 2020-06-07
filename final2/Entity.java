import java.awt.Color;
import java.awt.Graphics;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Entity {
    
    private int x;
    private int y;
    private int width;
    private int height;
    private String name;

    public Entity(int x, int y, int width, int height, String name) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        g.setColor(Color.magenta);
        g.fillRect(x + xDiff, y + yDiff, width, height);
    }

    public void drawShadow(Graphics g, int xDiff, int yDiff) {
        
    }

    public boolean isCoin() {
        return false;
    }

    public void interact() {
        
    }

    public void checkState() {
    }

    public boolean hasState() {
        return false;
    }

    public void changeX(int d) {
        this.x = d;
    }

    public void changeY(int d) {
        this.y = d;
    }

    public String getMessage() {
        return "";
    }

    public boolean isSwitch() {
        return false;
    }

    public boolean isWall() {
        return false;
    }

    public boolean isTouching(int xDiff, int yDiff) {
        return false;
    }

    public boolean isTree() {
        return false;
    }

    public void playSound() {// plays switch sound
    }
}