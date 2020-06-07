import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Card {

    private int value;
    private String name;
    private String suit;

    private BufferedImage suitImage;

    public Card(int value, String name, String suit) {
        this.value = value;
        this.name = name;
        this.suit = suit;
        

        if(suit.equals("hearts")) {
            try {
                suitImage = ImageIO.read(new File("images/PNG/"+name+"H.png"));
            } catch(IOException e) {
                System.out.println(e);
            }
        } else if(suit.equals("diamonds")) {
            try {
                suitImage = ImageIO.read(new File("images/PNG/"+name+"D.png"));
            } catch(IOException e) {
                System.out.println(e);
            }
        } else if(suit.equals("clubs")) {
            try {
                suitImage = ImageIO.read(new File("images/PNG/"+name+"C.png"));
            } catch(IOException e) {
                System.out.println(e);
            }
        } else if(suit.equals("spades")) {
            try {
                suitImage = ImageIO.read(new File("images/PNG/"+name+"S.png"));
            } catch(IOException e) {
                System.out.println(e);
            }
        }
    }

    public void drawMe(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.drawString(name+"", x, y);
        System.out.println(suitImage);
        g.drawImage(suitImage, x+5, y+5, 120, 150, null);

    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return value+" "+name+" "+suit;
    }

}
