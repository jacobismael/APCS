import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sword extends Item {

    private BufferedImage img;

    public Sword(int x, int y) {
        super(x, y, 20, 10, "Sword");
        try {
            img = ImageIO.read(new File("./img/sword.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        g.setColor(new Color(97, 39, 0));
        g.fillRect(getX() + xDiff, getY() + yDiff, getWidth(), getHeight());
    }

    public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
    
        g.fillOval(getX()+xDiff-5, getY()+yDiff+2, 30, 15);
	}

    public void drawInventoryItem(Graphics g, int x, int y, boolean selected) {

        super.drawInventoryItem(g, x, y, selected);

        g.drawImage(img, x, y, 50, 50, null);

    }

    public boolean isSword() {
        return true;
    }

    @Override
    public void playSound() {// plays pickup sound
        try {
            URL url = this.getClass().getClassLoader().getResource("sounds/chest.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

}