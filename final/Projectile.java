import java.awt.Color;
import java.awt.Graphics;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;
 
public class Projectile{
    private int x;
    private int y;
     
    private int width;
    private int height;

    private boolean visible;
     
    private Color red;
 
     
    public Projectile(int x, int y){

        this.x = x;
        this.y = y;
         
        this.width = 5;
        this.height = 10;
         
        this.red = new Color(255,0,0);
        this.visible = false;
 
 
    }
     
 
    public void drawMe(Graphics g){
        if(visible) {
            g.setColor(red);
            g.fillRect(x,y,width,height);
        }
         
    }

    public void moveUp() {
        if(visible) {
            y--;

            if( y < 0) {
                visible = false;
            }
        }
    }
    
    public void shoot() {
        visible = true;
        playLaserSound();
    }

    public void setPosition(int x, int y) {
        if(!visible) {
            this.x = x + 23;
            this.y = y;
        }
    }

    public void kill() {
        visible = false;
    }

    public void setVisible(boolean x) {
        visible = x;
    }

    public int checkCollision(Enemy e) {
        if(e.getVisible() && visible) {
            int pX = x;
            int pY = y;
            int pWidth = width;
            int pHeight = height;

            int tX = e.getX();
            int tY = e.getY();
            int tWidth = e.getWidth();
            int tHeight = e.getHeight();
            if(pX+pWidth >= tX && pX <= tX + tWidth  &&  pY+pHeight >= tY && pY <= tY + tHeight){
                e.kill();
                kill();
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public boolean getVisible() {
        return visible;
    }
    
    private void playLaserSound() {// plays laser sound

        try {
            URL url = this.getClass().getClassLoader().getResource("Sound/laser.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
     
 
}