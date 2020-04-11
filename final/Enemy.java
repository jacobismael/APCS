import java.awt.Color;
import java.awt.Graphics;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;
 
public class Enemy{
    private int x;
    private int y;
     
    private int width;
    private int height;

    private int xV;
    private int lives;
     
    private Color green;
    private HealthBar hb;

    private boolean visible;
    private boolean killed;
     
    public Enemy(int x){
         
        this.x = x;
        this.y = 50;

        this.xV = 1;
         
        this.width = 50;
        this.height = 50;
        
        this.lives = 1;

        this.green = new Color(0,255,0);
        this.hb = new HealthBar();
        
        this.killed = false;
    }
     
 
    public void drawMe(Graphics g){
        if(visible){
            g.setColor(Color.blue);
            g.fillRect(x, y, width, height);
            g.setColor(green);
            g.fillRect(x + 5,y + 5,width - 10,height - 10);
            hb.drawMe(g, x, y, lives);
        }
    }

    public void start() {
        visible = true;
    }

    public void moveUp() {
        y -= 10;
    }

    public void moveDown() {
        y += 10;
    }

    private void playDeathSound() {// plays laser sound

        try {
            URL url = this.getClass().getClassLoader().getResource("Sound/up.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void kill() {
        visible = false;
        lives = 0;
        killed = true;
        playDeathSound();
    }

    public boolean getVisible() {
        return visible;
    }

    public void reset() {
        y = 50;
        lives = 1;
        visible = true;
        killed = false;
    }

    public void checkP(Ship s) {
        if(y > 450 && visible) {
            kill();
            s.loseLife();
        }
    }

    public void move() {
        if(visible) {
            if(x > 50 && x < 700) {
                x+=xV;
            } else if(x == 700) {
                xV = -1;
                y += 50;
                x += xV;
            } else if(x == 50) {
                xV = 1;
                y += 50;
                x += xV;
            }
        }
    }

    public boolean rDS() {
        boolean temp = killed;
        if(killed) {
            killed = false;
        }
        return temp;
    }
}