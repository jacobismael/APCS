import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.ArrayList;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Book extends Item {

    private BufferedImage img;
    private ArrayList<String> text;
    private boolean open;

    public Book(int x, int y) {
        super(x, y, 20, 10, "Book");
        open = false;
        try {
            img = ImageIO.read(new File("./img/book.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Book(int x, int y, String name, ArrayList<String> text) {
        super(x, y, 20, 10, name);
        open = false;
        try {
            img = ImageIO.read(new File("./img/book.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.text = text;
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(getX() + xDiff, getY() + yDiff, getWidth(), getHeight());
    }

    public void drawBook(Graphics g) {
        if(open) {
            g.setColor(Color.white);
            g.fillRect(50, 50, 900, 700);
            g.setColor(Color.black);
            int y = 70;
            for (int i = 0; i < text.size(); i++) {
                g.drawString(text.get(i), 60, y);
                y+=20;
            }
        }
    }

    public void drawShadow(Graphics g, int xDiff, int yDiff) {
		g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(getX()+xDiff-5, getY()+yDiff+2, 30, 15);
	}

    public void drawInventoryItem(Graphics g, int x, int y, boolean selected) {

        super.drawInventoryItem(g, x, y, selected);

        g.drawImage(img, x+5, y+5, 40, 40, null);

    }

    public void toggle() {
        open = !open;
    }

    public boolean isBook() {
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