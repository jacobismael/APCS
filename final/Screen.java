import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Font;
 
 
 
public class Screen extends JPanel implements KeyListener {
 
    private Projectile[] shots;
    private Ship s1;

    private int[] starsX;
    private int[] starsY;
    private int starsize;

    private Enemy[] enemies;
    private Enemy[] enemies1;
    private Enemy[] enemies2;

    int level;
    int dead;
    boolean endscreen;
 
     
    public Screen(){

        starsize = 500;
        starsX = new int[starsize];
        starsY = new int[starsize];

        for(int i = 0; i < starsize; i++) {
            starsX[i] = (int)(Math.random() * 800);
            starsY[i] = (int)(Math.random() * 600);
        }

        s1 = new Ship(50,500);

        level = 1;
        dead = 0;
        enemies1 = new Enemy[5];
        enemies2 = new Enemy[10];
        shots = new Projectile[10];

        enemies = enemies1;

        endscreen = false;
        
        // for(int i = 0; i < enemies.length; i++) {
        //     enemies[i] = new Enemy( (int)(Math.random() * 551 + 200) , (int)(Math.random() * 551) );
        // }
        
        for(int i = 0; i < shots.length; i++) {
            shots[i] = new Projectile( s1.getX() , s1.getY() );
        }
        
        for(int i = 0; i < enemies.length; i++) {
            enemies[i] = new Enemy((int)(Math.random() * 651 + 50));
        }
        
        for(int i = 0; i < enemies2.length; i++) {
            enemies2[i] = new Enemy((int)(Math.random() * 651 + 50));
        }
        
        for(Enemy x : enemies) {
            x.start();
        }
        setFocusable(true);
        addKeyListener(this);

        System.out.println("Initialized");
    }
    
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
     
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
     

        g.setColor(Color.black);
        g.fillRect(0, 0, 810, 610);
        if(level == 1) {
            g.setColor(new Color (0, 168, 255));
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.yellow);
            g.fillOval(50, 50, 100, 100);
        } else if(level == 2) {
            g.setColor(Color.black);
            g.fillRect(0, 0, 810, 610);

            g.setColor(Color.white);
            for(int i = 0; i < starsize; i++) {
                g.fillRect(starsX[i], starsY[i], 2, 2);
            } 
        } else {
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.PLAIN, 50));
            g.drawString("The End - Press \'f\' to restart", 10, 590);
            g.drawString("Score: "+s1.getScore(), 10, 100);
        }

        if(!endscreen) {

            
            g.setColor(new Color(50, 50, 50));
            g.fillRect(0, 450, 800, 150);
            g.setColor(Color.gray);
            g.fillRect(0, 500, 800, 100);
            g.setColor(Color.black);
            g.fillRect(40, 500, 720, 60);
            g.setColor(Color.darkGray);
            g.fillRect(50, 500, 700, 50);
            
            g.setColor(Color.white);
            g.drawString("Level " + level, 50, 200);
            
            // Draw Projectile
            for(Projectile x : shots) {
                x.drawMe(g);
            }
            
            // Draw ship
            s1.drawMe(g);
            
            for(Enemy x : enemies) {
                x.drawMe(g);
            }
        } 
            
    }
    
    public void restart() {
        
        for(Projectile x : shots) {
            x.setPosition( s1.getX() , s1.getY() );
            x.setVisible(false);
        }
        

        for( Enemy x : enemies1) {
            x.reset();
        }

        for( Enemy x : enemies2 ) {
            x.reset();
        }

        for(Enemy x : enemies) {
            x.start();
        }

        dead = 0;
    }

    public void superReset() {
        restart();
        level = 1;
        s1.setLives(3);
        s1.setScore(0);
        endscreen = false;
        enemies = enemies1;
    }
 
 
    public void animate(){
         
        while(true){
            //wait for .01 second
            try {
                Thread.sleep(s1.getFr());
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
             
            for(Projectile x : shots) {
                x.moveUp();
            }

            if(s1.getLives() == 0) {
                superReset();
            }
             
            for(Enemy x : enemies) {
                for(Projectile y : shots) {
                    int z = y.checkCollision(x);
                    s1.iScore(z);
                }
                x.move();
                x.checkP(s1);
                if(x.rDS() == true) {
                    dead++;
                }

                if(dead == enemies.length) {
                    switchLevel();
                }
            }

            if(s1.getReset()) {
                restart();
                s1.setReset(false);
            } else if(s1.getSReset()) {
                superReset();
                s1.setSReset(false);
            }

            //repaint the graphics drawn
            repaint();
        }
 
    }

    public void switchLevel() {
        try {
            Thread.sleep(500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        level++;
        if(level == 2) {
            enemies = enemies2;
        } else if(level > 2){
            endscreen = true;
        }
        restart();
        s1.reload();
    }

    public void keyPressed(KeyEvent e) {
        if( e.getKeyCode() == 32 && level < 3) { // 'space' key pressed
            if(s1.getAA() > 0) {

                for(Projectile x : shots) {
                    x.setPosition( s1.getX() , s1.getY() );
                    if(!x.getVisible()) {
                        x.shoot();
                        break;
                    }
                }
            }
            s1.shoot();
        } else if( e.getKeyCode() == 65 || e.getKeyCode() == 37) {
            s1.moveLeft();
        } else if( e.getKeyCode() == 68 || e.getKeyCode() == 39) {
            s1.moveRight();
        } else if( e.getKeyCode() == 69) {
            s1.reload();
        } else if( e.getKeyCode() == 82) {
            s1.reset();
            restart();
        } else if( e.getKeyCode() == 81) {
            s1.loseLife();
        } else if( e.getKeyCode() == 80) {
            switchLevel();
        } else if( e.getKeyCode() == 70) {
            superReset();
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}
     
 
}