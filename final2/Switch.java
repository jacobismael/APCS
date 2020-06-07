import java.awt.Color;
import java.awt.Graphics;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Switch extends Entity {
    
    private boolean open;
    private Locked ptr;

    public Switch(int x, int y) {
        super(x, y, 10, 10, "Switch");
        this.open = true;
    }

    public Switch(int x, int y, boolean switched) {
        super(x, y, 10, 10, "Switch");
        this.open = switched;
    }

    public void drawMe(Graphics g, int xDiff, int yDiff) {
        int[] xValsl = new int[4];
        int[] yValsl = new int[4];


        g.setColor(new Color(51, 26, 0));
        if(open) {
            xValsl[0] = getX()+xDiff;
            xValsl[1] = getX()+2+xDiff;
            xValsl[2] = getX()+6+xDiff;
            xValsl[3] = getX()+4+xDiff;

            yValsl[0] = getY()+yDiff;
            yValsl[1] = getY()+yDiff;
            yValsl[2] = getY()+8+yDiff;
            yValsl[3] = getY()+8+yDiff;
        } else {
            xValsl[0] = getX()+8+xDiff;
            xValsl[1] = getX()+10+xDiff;
            xValsl[2] = getX()+6+xDiff;
            xValsl[3] = getX()+4+xDiff;

            yValsl[0] = getY()+yDiff;
            yValsl[1] = getY()+yDiff;
            yValsl[2] = getY()+8+yDiff;
            yValsl[3] = getY()+8+yDiff;
        }

        g.fillPolygon(xValsl, yValsl, 4);
        g.setColor(new Color(48, 44, 40));
        g.fillRect(getX() + xDiff, getY() + yDiff+8, getWidth(), 2);
    }

    public void drawShadow(Graphics g, int xDiff, int yDiff) {
        g.setColor(new Color(0.1f, 0.1f, 0.1f, 0.7f));
		g.fillOval(getX()+xDiff-5, getY()+yDiff+5, 20, 10);
    }

    public void interact() {
        open = !open;
    }

    public String getMessage() {
        if(open) {
            return "Press E to turn on Switch";
        }
        return "Press E to turn off Switch";
    }

    public boolean getState() {
        return open;
    }

    public boolean isSwitch() {
        return true;
    }

    public boolean hasState() {
        return true;
    }

    public void setPtr(Locked l) {
        ptr = l;
    }

    public void setState(boolean state) {
        open = state;
    }

    public void checkState() {
        ptr.checkState();
    }

    public void playSound() {// plays switch sound
        try {
            URL url = this.getClass().getClassLoader().getResource("sounds/switch.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
}