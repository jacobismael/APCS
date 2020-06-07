import java.awt.Color;
import java.awt.Graphics;
 
public class Ship{
    private int x;
    private int y;
     
    private int width;
    private int height;

    int lives;
    int lLives;

    double ammo;
    double Uammo;
    boolean reloading;

    int frame;
    boolean gStatus;

    int score;

    private int fr;

    private boolean reset;
    private boolean sReset;
     
    private Color color;
     
    public Ship(int x, int y){
         
        this.x = x;
        this.y = y;

        reset = false;
        sReset = false;
         
        this.width = 50;
        this.height = 50;
        
        this.frame = 0;
        this.gStatus = true;

        this.lives = 3;
        this.lLives = 0;

        this.ammo = 5;
        this.Uammo = 0;
        this.reloading = false;
        
        this.color = new Color(100,100,100);
         
        this.score = 0;

        this.fr = 2;
 
    }
     
 
    public void drawMe(Graphics g){
        frame++;
        g.setColor(Color.gray);
        g.fillRect(x,y,width,height);
        g.setColor(color);
        g.fillRect(x+10, y - 20, 10, 20);
        g.fillRect(x+30, y - 20, 10, 20);
        g.setColor(Color.red);
        g.fillRect(x + 10, y - 20, 10, 5);
        g.fillRect(x + 30, y - 20, 10, 5);
        g.fillRect(x + (int)(Uammo * 5.0), y + 50, (int)(ammo * 10.0), 10);
        g.setColor(Color.green);
        g.fillRect(40, 500 + (lLives * 20), 10, lives * 20);
        g.fillRect(750, 500 + (lLives * 20), 10, lives * 20);
        g.setColor(Color.white);
        g.drawString("Score: "+score, 50, 250);
        g.drawString("Ammo: "+(int)(ammo), 50, 350);
        g.drawString("Lives: "+lives, 50, 300);
    }

    public void moveLeft() {
        if(x >= 50 && (x - 10) >= 50) {
            x -= 10;
        }
    }

    public int getScore() {
        return score;
    }

    public int getFr() {
        return fr;
    }

    public void moveRight() {
        if(x <= 700 && (x + 10) <= 700) {
            x += 10;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void shoot() {
        if(ammo > 0 && !reloading) {
            ammo--;
            Uammo++;
        }
    }

    public double getAA() {
        return ammo;
    }

    public void loseLife() {
        if(lives > 0) {
            lives--;
            lLives++;
            reset();
        }
        if(lives == 0) {
            endgame();
        }
    }

    public void reload() {
        if(ammo != 5) {
            reloading = true;
        }
        
        while(ammo < 5) {
            ammo += 0.1;
            Uammo -= 0.1;
        }

        reloading = false;
    }

    public void reset() {
        ammo = 5;
        Uammo = 0;
        // lives = 3;
        // lLives = 0;
        frame = 0;
        gStatus = true;
        score = 0;
        reset = true;
    }

    public void setLives(int x) {
        lives = x;
        lLives = 0;
    } 

    public boolean getReset() {
        return reset;
    }

    public boolean getSReset() {
        return sReset;
    }

    public void setSReset(boolean x) {
        sReset = x;
    }

    public void endgame() {
        //end the game
        sReset = true;
        gStatus = false;
    }

    public void rsGame() {
        gStatus = true;
    }

    public void setScore(int x) {
        score = x;
    }

    public boolean getStatus() {
        return gStatus;
    }
    
    public void iScore(int x) {
        score += x;
    }
    public int getLives() {
        return lives;
    }

    public void setReset(boolean x) {
        reset = x;
    }
}