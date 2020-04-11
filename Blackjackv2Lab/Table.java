import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Table extends JPanel implements ActionListener{

	private ArrayList<Card> deck;
	private String[] suits;
	
	private ArrayList<Card> playerDeck;
	private ArrayList<Card> dealerDeck;

	private int playerScore;
	private int dealerScore;

	private int score;
	private int bet;

	private JButton startButton;
	private JButton hitButton;
	private JButton standButton;

	private JTextField betBox;

	private String endMessage;

	private boolean startGame;
	private boolean endGame;

	public Table(){
		setLayout(null);

		deck = new ArrayList<Card>();
		suits = new String[]{"hearts", "diamonds", "clubs", "spades"};
		playerDeck = new ArrayList<Card>();
		dealerDeck = new ArrayList<Card>();

		startButton = new JButton("New Game");
		startButton.setBounds(450, 270, 100, 60);
		startButton.addActionListener(this);
		add( startButton );

		hitButton = new JButton("Hit");
		hitButton.setBounds(390, 20, 100, 60); 
		hitButton.addActionListener(this);
		add( hitButton );

		standButton = new JButton("Stand");
		standButton.setBounds(510, 20, 100, 60);
		standButton.addActionListener(this);
		add( standButton );

		betBox = new JTextField();
		betBox.setBounds(890, 530, 100, 30);
		add( betBox );

		createDeck();

		playerScore = 0;
		dealerScore = 0;

		score = 20;

		startGame = false;
		endGame = false;

		endMessage = "";

		scramble();
		checkVisibility();
	}
	
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(1000,600);
	}

	public void paintComponent(Graphics g){	
		super.paintComponent(g);
		g.setColor(new Color(17, 87, 0));
		g.fillRect(0,0,1000,600);

		g.setColor(Color.WHITE);
		int x = 50;
		int y = 375;
		playerScore = 0;
		for(int i = 0; i < playerDeck.size(); i++) {
			playerDeck.get(i).drawMe(g, x, y);
			playerDeck.get(i).writeNumber(g, x, y);
			x+=80;
			playerScore+=playerDeck.get(i).getValue();
		}

		if(playerScore >= 21 && startGame) {
			stand();
		}

		g.drawString(playerScore+"", 10, 425);
		g.drawString("Bet: ", 860, 550);

		x = 50;
		y = 100;
		dealerScore = 0;
		for(int i = 0; i < dealerDeck.size(); i++) {
			dealerDeck.get(i).drawMe(g, x, y);
			x+=80;
			dealerScore+=dealerDeck.get(i).getValue();
		}
		if(startGame) {
			dealerScore -= dealerDeck.get(1).getValue();
		}

		g.drawString(dealerScore+"", 10, 150);

		g.drawString(endMessage, 500, 200);

		g.drawString("Score: "+score, 900, 580);
	}

	public void scramble() {
		for(int i = 0; i < deck.size(); i++) {
			int tempI = (int)(Math.random() * deck.size());
			Card temp = deck.get(tempI);

			deck.set(tempI, deck.get(i));
			deck.set(i, temp);
		}
	}

	public void deal(ArrayList<Card> player) {
		player.add(deck.get(0));
		deck.remove(0);
	} 

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startButton && score > 0) {

			int bet = Integer.parseInt(betBox.getText());
			
			if(score - bet >= 0 && bet > 0) {
				score-=bet;
				reset();
				startGame = true;
				endMessage = "";
				endGame = false;
				scramble();
				startGame(bet);
			} else {
				endMessage = "Cannot Bet More Than Your Current Score";
			}

		} else if(e.getSource() == hitButton) {
			deal(playerDeck);
		} else if(e.getSource() == standButton) {
			stand();
		}
		checkVisibility();
		repaint();
	}

	public void startGame(int bet) {
		endMessage = "";
		deal(playerDeck);
		deal(playerDeck);

		this.bet = bet;

		deal(dealerDeck);
		deal(dealerDeck);

		dealerDeck.get(1).flip();
	}

	public void stand() {
		dealerDeck.get(1).unflip();
		repaint();
		endGame = true;
		if(!(playerScore >= 21)) {
			if(dealerScore < 17) {
				while(dealerScore < 17) {
					deal(dealerDeck);
					repaint();
					dealerScore = 0;
					for(int i = 0; i < dealerDeck.size(); i++) {
						dealerScore+=dealerDeck.get(i).getValue();
					}
				}
			}
		} else {
			//dealer wins no matter what
			endMessage = "Bust: You Lose";
		}

		if(playerScore > dealerScore && !(playerScore > 21)) {
			endMessage = "You Win";
			score+=bet*2;
		} else if( dealerScore > 21) {
			endMessage = "Dealer Bust: You Win";
			score+=bet*2;
		} else if(playerScore == dealerScore) {
			endMessage = "Tie: Points Returned";
			score+=bet;
		} else {
			endMessage = "Bust: You Lose";
		}

		startGame = false;
		endGame = true;
		checkVisibility();
		repaint();
	}

	public void createDeck() {
		for(int i = 0; i < 4; i++) {
			for (int j = 2; j <= 10; j++) {
				deck.add(new Card(j, j+"", suits[i]));
			}
			deck.add(new Card(10, "J", suits[i]));
			deck.add(new Card(10, "Q", suits[i]));
			deck.add(new Card(10, "K", suits[i]));
			deck.add(new Card(11, "A", suits[i]));
		}
	}

	public void reset() {
		playerDeck.clear();
		dealerDeck.clear();
		deck.clear();
		createDeck();
	}

	public void checkVisibility() {
		if(startGame) {
			startButton.setVisible(false);
			hitButton.setVisible(true);
			standButton.setVisible(true);
		} else {
			startButton.setVisible(true);
			hitButton.setVisible(false);
			standButton.setVisible(false);
		}
		repaint();
	}
	
}
