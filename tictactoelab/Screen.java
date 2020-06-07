import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;
 
public class Screen extends JPanel implements MouseListener, ActionListener {
 
    private Game game;
    private JButton newGame;
    private JButton playAI;
    private boolean gameStatus;
    private int p1wins, p2wins;
    private boolean pointAdded;
    private boolean playedSound;

    private boolean hell;
    private int turnN;

    private boolean buttonVisible;
 
    public Screen() {
        game = new Game();
        gameStatus = true;

        p1wins = 0;
        p2wins = 0;

        pointAdded = false;
        playedSound = false;

        hell = false;
        turnN = 1;

        buttonVisible = true;

        newGame = new JButton("New Game");
        newGame.setBounds(350, 200, 100, 30);
        newGame.addActionListener(this);
        add(newGame);

        playAI = new JButton("Play CPU");
        playAI.setBounds(350, 240, 100, 30);
        playAI.addActionListener(this);
        add( playAI );

        addMouseListener(this);
        setLayout(null);
    }
 
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(454, 304);
    }
 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        //draw background
        g.setColor(Color.white);
        g.fillRect(0, 0, 304, 304);

        g.setColor(Color.black);
        g.fillRect(100, 5, 2, 294);
        g.fillRect(204, 5, 2, 294);
        g.fillRect(5, 100, 294, 2);
        g.fillRect(5, 204, 294, 2);

        game.draw(g);
        

        if(game.checkTicTacToe() != 0) {
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("P" + game.checkTicTacToe() + " wins", 354, 150);
            if(!playedSound) {
                playWinSound();
                playedSound = true;
            } else {
                playedSound = false;
            }
            gameStatus = false;
            buttonVisible = true;
            hell = false;

            if(!pointAdded) {
                if(game.checkTicTacToe() == 1) {
                    p1wins++;
                } else if(game.checkTicTacToe() == 2) {
                    p2wins++;
                }
                pointAdded = true;
            }
        }


        g.setFont(new Font("Arial", Font.PLAIN, 15));
        g.drawString("P1(X): " + p1wins, 350, 50);
        g.drawString("P2(O): " + p2wins, 350, 100);
        
        if(game.checkFull() && game.checkTicTacToe() == 0) {
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("Tie", 354, 150);
            gameStatus = false;
            hell = false;
            buttonVisible = true;
        }
        checkVisible();
    }
 
 
    //MUST IMPLEMENT ALL METHODS OF MOUSELISTENER REGARDLESS IF  
    //YOU USE IT OR NOT IN ORDER FOR MOUSELISTENER TO WORK!!!!
    public void mousePressed(MouseEvent e) {
 
        //Print location of x and y
        int row = (int)(Math.floor((double)e.getY() / 100.0));
        int column = (int)(Math.floor((double)e.getX() / 100.0));

        game.insertXO(row, column);

        if(hell) {
            game.playComp();
        }
 
        repaint();

        checkVisible();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newGame) {
            gameStatus = true;
            newGame();
            buttonVisible = false;
        } else if(e.getSource() == playAI) {
            gameStatus = true;
            newGame();
            hell = true;
            buttonVisible = false;
        }
        
        checkVisible();
        repaint();
    }

    public void  checkVisible() {
        if(buttonVisible) {
            newGame.setVisible(true);
            playAI.setVisible(true);
        } else {
            newGame.setVisible(false);
            playAI.setVisible(false);
        }
    }

    public void newGame() {
        game.reset();
    }
 
    public void mouseReleased(MouseEvent e) {}
 
    public void mouseEntered(MouseEvent e) {}
 
    public void mouseExited(MouseEvent e) {}
 
    public void mouseClicked(MouseEvent e) {}

    private void playWinSound() {// plays laser sound

        try {
            URL url = this.getClass().getClassLoader().getResource("sounds/winSound.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    private void playTieSound() {
        try {
            URL url = this.getClass().getClassLoader().getResource("sounds/tie.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    } 
 
 
}