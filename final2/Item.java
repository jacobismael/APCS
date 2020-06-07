import java.awt.Color;
import java.awt.Graphics;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Item extends Entity {

    public Item(int x, int y, int width, int height, String name) {
        super(x, y, width, height, name);
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        g.setColor(Color.red);
        g.fillRect(getX() + xDiff, getY() + yDiff, getWidth(), getHeight());
    }

    public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(getX()+xDiff-5, getY()+yDiff+5, 20, 10);
	}

    public void drawInventoryItem(Graphics g, int x, int y, boolean selected) {
        g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
        g.fillRect(x, y, 50, 50);
        if (selected) {
            g.setColor(Color.white);
        } else {
            g.setColor(Color.black);
        }
        g.drawRect(x, y, 50, 50);
    }

    public void playSound() {// plays pickup sound
        try {
            URL url = this.getClass().getClassLoader().getResource("sounds/item.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    public void changeCoords(int x, int y) {
        setX(x);
        setY(y);
    }
    
    public boolean isSword() {
        return false;
    }

    public boolean isBook() {
        return false;
    }

    public void toggle() {}
}