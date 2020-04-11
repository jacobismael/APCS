import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Table extends JPanel implements ActionListener{

	private Card[] deck;
	private String[] suits;
	private int playerIndex;
	private int points;
	private int score;

	private boolean gameStart;

	private String endMessage;

	private JButton startGameButton;
	private JButton hitButton;
	private JButton standButton;

	public Table(){
		setLayout(null);

		points = 20;
		score = 0;

		endMessage = ""; 

		gameStart = false;

		suits = new String[]{"hearts", "diamonds", "spades", "clubs"};

		startGameButton = new JButton("New Game");
		startGameButton.setBounds(450, 20, 100, 60);
		startGameButton.addActionListener(this);
		add( startGameButton );

		hitButton = new JButton("Hit");
		hitButton.setBounds(390, 20, 100, 60); 
		hitButton.addActionListener(this);
		add( hitButton );

		standButton = new JButton("Stand");
		standButton.setBounds(510, 20, 100, 60);
		standButton.addActionListener(this);
		add( standButton );

		playerIndex = 0;
		deck = new Card[52];
		int cardN = 0;

		for(int i = 0; i < 4; i++) {
			String suit = suits[i];
			deck[cardN] = new Card(1, "A", suit);
			cardN++;
			for(int j = 2; j <= 10; j++) {
				deck[cardN] = new Card(j, j+"", suit);
				cardN++;
			}
			deck[cardN] = new Card(10, "J", suit);
			cardN++;
			deck[cardN] = new Card(10, "Q", suit);
			cardN++;
			deck[cardN] = new Card(10, "K", suit);
			cardN++;
		}
		checkVisibility();
	}
	
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(1000,600);
	}

	public void paintComponent(Graphics g){	
		super.paintComponent(g);
		
		g.setColor(new Color(0, 100, 0));
		g.fillRect(0,0,1000,600);

		int x = 20;
		int y = 200;
		score = 0;
		for(int i = 0; i < playerIndex; i++) {
			deck[i].drawMe(g, x, y);
			x += 80;
			score+=deck[i].getValue();
		}

		if(score == 21 || score > 21) {
			stand();
		}

		g.setFont(new Font("Arial", Font.PLAIN, 20));

		g.setColor(Color.WHITE);
		g.drawString("Points: "+points, 10, 20);
		g.drawString(endMessage, 100, 500);

		if(gameStart) {
			g.drawString("Score: "+score, 10, 40);
		}
	
	}
	


	private void shuffle(){
		//write code to shuffle your deck
		for(int i = 0; i < deck.length; i++) {
			int tempI = (int)(Math.random() * 52);
			Card temp = deck[tempI];
			deck[tempI] = deck[i];
			deck[i] = temp;
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startGameButton && points > 0) {
			gameStart = true;
			endMessage = "";
			shuffle();
			playerIndex = 2;
			System.out.print("\033[H\033[2J");  
        	System.out.flush();
			// for(int i = 0; i < deck.length; i++) {
			// 	System.out.println(i+1 + ") "+deck[i]);
			// }
			System.out.println();
			points--;
		} else if(e.getSource() == hitButton) {
			if(playerIndex < deck.length) {
				playHitSound();
				playerIndex++;
			}
		} else if(e.getSource() == standButton) {
			stand();
		}
		checkVisibility();	
		repaint();
	}

	public void checkVisibility() {
		if(!gameStart) {
			startGameButton.setVisible(true);
			hitButton.setVisible(false);
			standButton.setVisible(false);
		} else {
			startGameButton.setVisible(false);
			hitButton.setVisible(true);
			standButton.setVisible(true);
		}
	}

	public void stand() {
		gameStart = false;
		if(score < 15 || score > 21) {
			points+=0;
			endMessage = score+": Bust";
			playLoseSound();
		} else if(score > 15 && score < 19) {
			points++;
			endMessage = score+": You Win 1 point";
			playWinSound();
		} else if(score == 19) {
			points+=2;
			endMessage = score+": You Win 2 points";
			playWinSound();
		} else if(score == 20) {
			points+=3;
			endMessage = score+": You Win 3 points";
			playWinSound();
		} else if(score == 21) {
			points+=5;
			endMessage = score+": Blackjack! You Win 5 points";
			playWinSound();
		}
		checkVisibility();
	}

	private void playHitSound() {// plays laser sound
		try {
			URL url = this.getClass().getClassLoader().getResource("sounds/hit.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(url));
			clip.start();
		} catch (Exception exc) {
			exc.printStackTrace(System.out);
		}
    }

	private void playWinSound() {// plays laser sound
		try {
			URL url = this.getClass().getClassLoader().getResource("sounds/win.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(url));
			clip.start();
		} catch (Exception exc) {
			exc.printStackTrace(System.out);
		}
    }

	private void playLoseSound() {// plays laser sound
		try {
			URL url = this.getClass().getClassLoader().getResource("sounds/lose.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(url));
			clip.start();
		} catch (Exception exc) {
			exc.printStackTrace(System.out);
		}
    }
	
}
