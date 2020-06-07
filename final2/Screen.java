import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Screen extends JPanel implements KeyListener, ActionListener, MouseListener {

	private JButton startButton;

	private Player p1;
	private Tree t1;
	private Tree t2;

	private ArrayList<Entity> env;
	private ArrayList<Item> items;
	private ArrayList<Item> inventory;
	private ArrayList<Person> persons;
	private ArrayList<Book> books;

	private ArrayList<Switch> quest1;
	private ArrayList<Door> quest1doors;

	private ArrayList<Tree> trees;
	private int treesize;

	public boolean hasSword;

	private Structure spawn;

	public boolean attacking;
	public boolean stillClicking;

	private Door door1, door2, door3;

	private boolean muted;

	private boolean left, right, up, down = false;

	private int xDiff, yDiff;

	private double xVelocity;
	private double yVelocity;

	private int windowX, windowY;

	private int worldsize;
	private int itemsize;

	private boolean interacted;

	private int handi;
	private int speed;

	private int questnum;

	private float t;
	private double timer;
	private double dayspeed;
	private boolean night;

	private boolean devopen;
	private boolean invopen;

	private int coins;
	private int coinValue;

	private boolean game;

	private boolean interacting;
	private boolean stillpressing;
	private boolean touchingSomething;

	private String displayMessage;

	public boolean cutscene;
	public ArrayList<String> cutsceneMessage;

	private Color grassColor;
	private Color dayshade;

	public Screen() {

		windowX = 1000;
		windowY = 800;

		muted = false;

		coins = 0;
		coinValue = 1;

		worldsize = 5000;

		// sets up the instance variables
		p1 = new Player((windowX - 10) / 2, (windowY - 20) / 2);
		t1 = new Tree(500, 150);
		spawn = new House(windowX / 2 - 15, windowY / 2 - 100);
		t2 = new Tree(1000, 550);
		xVelocity = 0.0;
		yVelocity = 0.0;

		xDiff = 0;
		yDiff = 0;

		attacking = false;
		stillClicking = false;

		cutscene = false;
		cutsceneMessage = new ArrayList<String>();
		cutsceneMessage.add("You live in a peaceful world.");
		cutsceneMessage.add("But unfortunately, an evil tyrant has invaded and oppresses the trees.");
		cutsceneMessage
				.add("Get into his castle and kill him. The Keys to the castle are at the corners of the world!");
		cutsceneMessage.add("Good Luck");
		cutsceneMessage.add("Press Space to continue");

		hasSword = false;

		handi = 0;

		startButton = new JButton("Start Game");
		startButton.setBounds(450, 370, 100, 60);
		startButton.addActionListener(this);
		add(startButton);

		game = false;

		items = new ArrayList<Item>();
		inventory = new ArrayList<Item>();
		invopen = true;
		devopen = false;
		itemsize = 100;

		trees = new ArrayList<Tree>();
		// treesize = 50;
		treesize = worldsize / 10;

		timer = 4.5;
		t = (float) (Math.sin(timer) * 0.2 + 0.2);
		dayspeed = 0.0001;
		night = (t > 0.3);

		interacting = false;
		stillpressing = false;
		interacted = false;
		touchingSomething = false;

		questnum = 1;

		displayMessage = "";
		env = new ArrayList<Entity>();

		for (int i = 0; i < treesize; i++) {
			int placex = (int) ((Math.random() * (worldsize + windowX)) - windowX / 2);
			int placey = (int) ((Math.random() * (worldsize + windowY)) - windowY / 2);

			// while(!(placex > 200 && placey < 450) && !(placey > 600 & placey < 1100)) {
			// placex = (int) ((Math.random() * (worldsize + windowX)) - windowX / 2);
			// placey = (int) ((Math.random() * (worldsize + windowY)) - windowY / 2);
			// }

			Tree temp = new Tree(placex, placey);
			trees.add(temp);
			env.add(temp);
		}

		for (int i = 0; i < itemsize; i++) {
			Coin temp = new Coin((int) (Math.random() * (worldsize)), (int) (Math.random() * (worldsize)));
			items.add(temp);
		}

		// for (int i = 0; i < weaponcount; i++) {
		// items.add(new Sword((int) (Math.random() * (worldsize)), (int) (Math.random()
		// * (worldsize))));
		// }

		Sword main_sword = new Sword(windowX / 2 + 30, windowY / 2 + 30);
		items.add(main_sword);

		ArrayList<String> bookc = new ArrayList<String>();

		bookc.add("Press E to interact");
		bookc.add("Use WASD or arrow keys to move");
		bookc.add("Press Q to drop held items");
		bookc.add("Press { & } to switch between held items");
		bookc.add("Press t to toggle dev menu");

		books = new ArrayList<Book>();
		Book main_book = new Book(windowX / 2 - 60, windowY / 2 + 30, "Instructions", bookc);
		items.add(main_book);
		books.add(main_book);

		speed = 1;

		dayshade = new Color(0, 0, 0, 0);
		grassColor = new Color(26, 54, 15);

		Switch temp = new Switch(500, 500, false);
		Door temp2 = new Door(450, 600, 10, temp);
		temp.setPtr(temp2);

		env.add(temp);
		env.add(temp);
		env.add(temp2);
		env.add(new Wall(200, 600, 250, 10));
		env.add(new Wall(200, 100, 10, 500));
		env.add(new Wall(200, 100, 450, 10));
		env.add(new Wall(550, 600, 100, 10));
		env.add(new Wall(650, 100, 10, 510));

		env.add(new Wall(2900, 3000, 100, 10));
		env.add(new Wall(3100, 3000, 100, 10));
		env.add(new Wall(2900, 3000, 10, 300));
		env.add(new Wall(3200, 3000, 10, 310));
		env.add(new Wall(2900, 3300, 300, 10));

		quest1 = new ArrayList<Switch>();

		Switch quest1s = new Switch(4800, 4800, false);
		quest1.add(quest1s);

		Switch quest2s = new Switch(4800, 840, false);
		quest1.add(quest2s);

		Switch quest3s = new Switch(200, 4000, false);
		quest1.add(quest3s);

		quest1doors = new ArrayList<Door>();

		door1 = new Door(3000, 3000, 10, quest1s);
		door2 = new Door(3000, 3000, 10, quest2s);
		door3 = new Door(3000, 3000, 10, quest3s);

		quest1doors.add(door1);
		quest1doors.add(door2);
		quest1doors.add(door3);

		for (int i = 0; i < quest1.size(); i++) {
			quest1.get(i).setPtr(quest1doors.get(i));
		}

		persons = new ArrayList<Person>();
		// Person test = new Person(3200, 3200, "Guard", Color.black, false);
		// persons.add(test);

		for (int i = 0; i < 10; i++) {
			persons.add(new Person((int) (Math.random() * 280 + 2910), (int) (Math.random() * 280 + 3010), "Guard",
					Color.black, true));
		}

		persons.add(new Person((int) (Math.random() * 280 + 2910), (int) (Math.random() * 280 + 3010), "Boss",
				Color.yellow, true, 100));

		// sets keylistener
		setFocusable(true);
		addMouseListener(this);
		addKeyListener(this);
		setLayout(null);
	}

	public Dimension getPreferredSize() {
		// Sets the size of the panel
		return new Dimension(windowX, windowY);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (cutscene) {
			g.setColor(Color.white);
			g.fillRect(0, 0, windowX, windowY);
			g.setFont(new Font("Arial", Font.PLAIN, 25));
			g.setColor(Color.black);
			int y = 50;
			for (int i = 0; i < cutsceneMessage.size(); i++) {
				g.drawString(cutsceneMessage.get(i), 10, y);
				y += 100;
			}
		}

		if (game) {

			// Graphics2D g2d = (Graphics2D) g;

			// g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			// RenderingHints.VALUE_ANTIALIAS_ON);

			// draws background
			// g.setColor(new Color(36, 64, 15));
			g.setColor(grassColor);
			g.fillRect(0, 0, windowX, windowY);

			g.setColor(new Color(50, 50, 50));
			g.fillRect(2900 + xDiff, 3000 + yDiff, 300, 300);

			// for(int i = 0; i < items.size(); i++) {
			// items.get(i).drawMe(g, xDiff, yDiff);
			// }

			p1.drawShadow(g);

			g.setColor(Color.black);
			// g.fillRect(xDiff, yDiff, 10, 10);
			// g.fillRect(xDiff + worldsize, yDiff + worldsize, 10, 10);
			// g.fillRect(xDiff+worldsize, yDiff, 10, 10);
			// g.fillRect(xDiff, yDiff + worldsize, 10, 10);
			g.drawRect(xDiff, yDiff, worldsize, worldsize);

			spawn.drawShadow(g, xDiff, yDiff);

			for (int i = 0; i < trees.size(); i++) {
				trees.get(i).drawShadow(g, xDiff, yDiff);
			}

			t1.drawShadow(g, xDiff, yDiff);
			t2.drawShadow(g, xDiff, yDiff);

			for (int i = 0; i < items.size(); i++) {
				items.get(i).drawShadow(g, xDiff, yDiff);
				items.get(i).drawMe(g, xDiff, yDiff);
			}

			for (int i = 0; i < env.size(); i++) {
				if (!(env.get(i).isTree())) {
					env.get(i).drawShadow(g, xDiff, yDiff);
				}
			}

			for (int i = 0; i < quest1.size(); i++) {
				quest1.get(i).drawShadow(g, xDiff, yDiff);
			}

			for (int i = 0; i < quest1.size(); i++) {
				quest1.get(i).drawMe(g, xDiff, yDiff);
			}

			door1.drawMe(g, xDiff, yDiff);
			door2.drawMe(g, xDiff, yDiff);
			door3.drawMe(g, xDiff, yDiff);

			for (int i = 0; i < env.size(); i++) {
				if (!(env.get(i).isTree())) {
					env.get(i).drawMe(g, xDiff, yDiff);
				}
			}

			p1.drawMe(g);

			for (int i = 0; i < persons.size(); i++) {
				persons.get(i).drawShadow(g, xDiff, yDiff);
			}

			for (int i = 0; i < persons.size(); i++) {
				persons.get(i).drawMe(g, xDiff, yDiff);
			}

			spawn.drawMain(g, xDiff, yDiff);

			for (int i = 0; i < trees.size(); i++) {
				trees.get(i).drawTrunk(g, xDiff, yDiff);
			}

			t1.drawTrunk(g, xDiff, yDiff);
			t2.drawTrunk(g, xDiff, yDiff);

			for (int i = 0; i < trees.size(); i++) {
				trees.get(i).drawLeaves(g, xDiff, yDiff);
			}

			t1.drawLeaves(g, xDiff, yDiff);
			t2.drawLeaves(g, xDiff, yDiff);

			g.setColor(dayshade);
			g.fillRect(0, 0, windowX, windowY);

			// Draw the game objects

			if (devopen) {
				String message = "X: " + xDiff + " Y: " + yDiff;
				g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
				g.fillRect(0, 0, message.length() * 10, 30);
				g.setColor(Color.white);
				g.drawString(message, 10, 20);
				message = "Time: " + t;
				g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
				g.fillRect(0, 30, 200, 30);
				g.setColor(Color.white);
				g.drawString(message, 10, 50);
				message = "Night?: " + night;
				g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
				g.fillRect(windowX - message.length() * 10, 200, message.length() * 10, 30);
				g.setColor(Color.white);
				g.drawString(message, windowX - message.length() * 10 + 10, 220);
				message = "Mute?: " + muted;
				g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
				g.fillRect(windowX - message.length() * 10, 230, message.length() * 10, 30);
				g.setColor(Color.white);
				g.drawString(message, windowX - message.length() * 10 + 10, 250);
			}

			if (invopen || devopen) {
				String coinmessage = "Coins: " + coins;
				g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
				g.fillRect(0, 60, coinmessage.length() * 10, 30);
				g.setColor(Color.white);
				g.drawString(coinmessage, 10, 80);
				int x = 0;
				int y = 100;
				for (int i = 0; i < inventory.size(); i++) {
					inventory.get(i).drawInventoryItem(g, x, y, i == handi);
					y += 51;
				}
			}

			g.setColor(Color.white);
			g.drawString(displayMessage, windowX / 2 - 50, windowY - 20);

			g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
			g.fillRect(windowX - 150, 0, 150, 30);
			g.setColor(Color.white);
			g.drawString("Current Quest: " + questnum, windowX - 140, 20);
			if (questnum == 1) {
				g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
				g.fillRect(windowX - 150, 30, 150, 60);
				g.setColor(Color.white);
				g.drawString("Switch 1: " + ((quest1.get(0).getState()) ? "on" : "off"), windowX - 130, 40);
				g.drawString("Switch 2: " + ((quest1.get(1).getState()) ? "on" : "off"), windowX - 130, 60);
				g.drawString("Switch 3: " + ((quest1.get(2).getState()) ? "on" : "off"), windowX - 130, 80);
			} else if (questnum == 2) {
				g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
				g.fillRect(windowX - 150, 30, 150, 40);
				g.setColor(Color.white);
				int num = persons.size();
				for (int i = 0; i < persons.size() - 1; i++) {
					if (!persons.get(i).isAlive()) {
						num--;
					}
				}
				g.drawString("Enemies left: " + num, windowX - 130, 40);
				try {
					g.drawString("Boss: " + persons.get(persons.size() - 1).isBoss(), windowX - 130, 60);
				} catch (Exception e) {
				}
			}
			g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.7f));
			g.fillRect(windowX - 120, windowY - 120, 150, 30);
			g.setColor(Color.white);
			g.drawString("Health: " + p1.getHealth(), windowX - 100, windowY - 100);

			for (int i = 0; i < books.size(); i++) {
				books.get(i).drawBook(g);
			}
		} else {
			if (!cutscene) {
				g.setColor(Color.black);
				g.setFont(new Font("Arial", Font.PLAIN, 100));
				g.drawString("Minecraft", 100, 200);
				ArrayList<String> bookc = new ArrayList<String>();

				int y = 500;
				g.setFont(new Font("Arial", Font.PLAIN, 20));
				bookc.add("Press E to interact");
				bookc.add("Use WASD or arrow keys to move");
				bookc.add("Press Q to drop held items");
				bookc.add("Press { & } to switch between held items");
				bookc.add("Press t to toggle dev menu");
				bookc.add("Press P to cheat");
				for(int i = 0; i < bookc.size(); i++) {
					g.drawString(bookc.get(i), 10, y);
					y+=20;
				}
			}
		}
	}

	// implement methods of the KeyListener
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == 39 || e.getKeyCode() == 68) {
			right = true;
		}

		if (e.getKeyCode() == 37 || e.getKeyCode() == 65) {
			left = true;
		}

		if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
			up = true;
		}

		if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
			down = true;
		}

		if (e.getKeyCode() == 91) { // {
			if (inventory.size() > 0) {
				handi--;
				if (handi < 0) {
					handi = inventory.size() - 1;
				}
			}
		}

		if (e.getKeyCode() == 93) { // }
			if (inventory.size() > 0) {
				handi++;
				if (handi > inventory.size() - 1) {
					handi = 0;
				}
			}
		}

		if (e.getKeyCode() == 84) {
			devopen = !devopen;
			invopen = true;
			if (!devopen) {
				invopen = false;
			}
		}

		if (e.getKeyCode() == 73) {
			invopen = !invopen;
		}

		if (e.getKeyCode() == 77) {
			muted = !muted;
		}

		if (e.getKeyCode() == 80) {
			advanceQuest();
		}

		if (e.getKeyCode() == 89) {
			try {
				if (inventory.get(handi).isBook()) {
					inventory.get(handi).toggle();
				}
			} catch (Exception exc) {
			}
		}

		if (e.getKeyCode() == 81) {
			try {
				inventory.get(handi).setX((windowX / 2) - xDiff);
				inventory.get(handi).setY((windowY / 2) - yDiff);

				items.add(inventory.get(handi));
				if (inventory.get(handi).isSword()) {
					hasSword = false;
				}
				inventory.remove(handi);
			} catch (IndexOutOfBoundsException z) {
			}
		}

		if (e.getKeyCode() == 69 && !stillpressing) {
			interacting = true;
			stillpressing = true;
		} else if (stillpressing) {
			interacting = false;
		}

		if (e.getKeyCode() == 32) {
			if (!game) {
				cutscene = false;
				game = true;
			}
		}

		repaint();
	}

	public void game() {
		while (true) {
			try {
				Thread.sleep(0);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			if (game) {
				if (right) {
					xVelocity -= speed;
				}

				if (left) {
					xVelocity += speed;
				}

				if (up) {
					yVelocity += speed;
				}

				if (down) {
					yVelocity -= speed;
				}

				timer += dayspeed;
				t = (float) (Math.sin(timer) * 0.2 + 0.2);
				dayshade = new Color(0, 0, 0, 0f + t);

				night = (t > 0.3);

				xDiff += (int) xVelocity;
				yDiff += (int) yVelocity;

				for (int i = 0; i < env.size(); i++) {
					if (env.get(i).isWall()) {
						if (env.get(i).isTouching(xDiff, yDiff)) {
							xDiff -= (int) xVelocity * speed;
							yDiff -= (int) yVelocity * speed;
						}
					}
				}

				for (int i = 0; i < quest1doors.size(); i++) {
					if (quest1doors.get(i).isWall()) {
						if (quest1doors.get(i).isTouching(xDiff, yDiff)) {
							xDiff -= (int) xVelocity;
							yDiff -= (int) yVelocity;
						}
					}
				}

				xVelocity *= 0.8;
				yVelocity *= 0.8;

				if (xDiff > windowX / 2) {
					xDiff = windowX / 2;
				}

				if (yDiff > windowY / 2) {
					yDiff = windowY / 2;
				}

				if (xDiff < -worldsize + windowX / 2) {
					xDiff = -worldsize + windowX / 2;
				}

				if (yDiff < -worldsize + windowY / 2) {
					yDiff = -worldsize + windowY / 2;
				}

				for (int i = 0; i < items.size(); i++) {
					if (p1.checkCollision(items.get(i), xDiff, yDiff)) {
						if (items.get(i).isCoin()) {
							coins += coinValue;
							items.remove(i);
							i--;
						} else {
							touchingSomething = true;
							if (interacting) {
								inventory.add(items.get(i));
								if (items.get(i).isSword()) {
									hasSword = true;
								}
								touchingSomething = false;
								items.remove(i);
								i--;
								if (!muted) {
									items.get(i).playSound();
								}
							}
							displayMessage = "Press E to pick up " + items.get(i).getName();
							break;
						}
					} else {
						touchingSomething = false;
					}
				}

				p1.setAttacking(attacking);

				for (int i = 0; i < persons.size(); i++) {
					if (persons.get(i).isEnemy()) {
						if (attacking && p1.checkCollision(persons.get(i), xDiff, yDiff)) {
							persons.get(i).loseLife();
							if (persons.get(i).died()) {
								persons.remove(i);
								i--;
							}
						}
					}
				}

				for (int i = 0; i < env.size(); i++) {
					if (env.get(i).isSwitch()) {

						if (p1.checkCollision(env.get(i), xDiff, yDiff)) {
							touchingSomething = true;
							if (interacting && !interacted) {
								env.get(i).interact();
								if (env.get(i).isSwitch() && !muted) {
									env.get(i).playSound();
								}
								touchingSomething = false;
								interacted = true;
							} else if (!interacting) {
								interacted = false;
							}
							displayMessage = env.get(i).getMessage();
						}
					}
					if (env.get(i).hasState()) {
						env.get(i).checkState();
					}
				}

				for (int i = 0; i < persons.size(); i++) {
					if (persons.get(i).isTouchingPlayer(p1, xDiff, yDiff)) {
						p1.changeHealth(-1);
					}
				}

				for (int i = 0; i < quest1.size(); i++) {
					if (quest1.get(i).isSwitch()) {

						if (p1.checkCollision(quest1.get(i), xDiff, yDiff)) {
							touchingSomething = true;
							if (interacting && !interacted) {
								quest1.get(i).interact();
								if (quest1.get(i).isSwitch() && !muted) {
									quest1.get(i).playSound();
								}
								touchingSomething = false;
								interacted = true;
							} else if (!interacting) {
								interacted = false;
							}
							displayMessage = quest1.get(i).getMessage();
						}
					}
					quest1doors.get(i).checkState();
				}

				// for(int i = 0; i < persons.size(); i++) {
				// if((persons.get(i).getX()+xDiff) < ((windowX - 10) / 2)) {
				// persons.get(i).changeX((int)xVelocity);
				// }
				// if((persons.get(i).getY()+xDiff) > ((windowX - 10) / 2)) {
				// persons.get(i).changeX(-(int)xVelocity);
				// }
				// if((persons.get(i).getY()+yDiff) < ((windowY - 20) / 2)) {
				// persons.get(i).changeY((int)yVelocity);
				// }
				// if((persons.get(i).getY()+yDiff) > ((windowY - 20) / 2)) {
				// persons.get(i).changeX(-(int)yVelocity);
				// }

				// System.out.println(persons.get(i).getX() + " | " + persons.get(i).getY());
				// }

				checkQuestState();

				// stilltouching = true;

				if (!touchingSomething) {
					displayMessage = "";
				}

				try {
					Thread.sleep(20);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}

				repaint();
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			// game = true;
			cutscene = true;
			startButton.setVisible(false);
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == 39 || e.getKeyCode() == 68) {
			right = false;
		}

		if (e.getKeyCode() == 37 || e.getKeyCode() == 65) {
			left = false;
		}

		if (e.getKeyCode() == 38 || e.getKeyCode() == 87) {
			up = false;
		}

		if (e.getKeyCode() == 40 || e.getKeyCode() == 83) {
			down = false;
		}

		if (e.getKeyCode() == 69) {
			interacting = false;
			stillpressing = false;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void checkQuestState() {
		if (questnum == 1) {
			int completed = 0;
			for (int i = 0; i < quest1.size(); i++) {
				if ((quest1.get(i).getState())) {
					completed++;
				}
			}

			if (completed == quest1.size()) {
				playSecretSound();
				questnum++;
			}
		} else if (questnum == 2) {
			int num = 0;
			for (int i = 0; i < persons.size(); i++) {
				if (persons.get(i).isAlive()) {
					num++;
				}
			}
			if (num == 0) {
				playSecretSound();
				endGame();
			}
		}
	}

	public void advanceQuest() {
		if (questnum == 1) {
			for (int i = 0; i < quest1.size(); i++) {
				quest1.get(i).setState(true);
			}
			questnum++;
			playSecretSound();
		} else if (questnum == 2) {
			for (int i = 0; i < persons.size(); i++) {
				persons.remove(i);
				i--;
			}
			playSecretSound();
		}
	}

	public void mousePressed(MouseEvent e) {
		if (game && !stillClicking && hasSword && inventory.get(handi).isSword()) {
			attacking = true;
			stillClicking = true;
		} else {
			attacking = false;
		}
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		stillClicking = false;
		attacking = false;
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void endGame() {
		game = false;
		cutsceneMessage.clear();
		cutsceneMessage.add("You defeated the Tyrant. The Trees are free");
		cutsceneMessage.add("The End");
		cutscene = true;
	}

	public void playSecretSound() {// plays pickup sound
		try {
			URL url = this.getClass().getClassLoader().getResource("sounds/secret.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(url));
			clip.start();
		} catch (Exception exc) {
			exc.printStackTrace(System.out);
		}
	}
}