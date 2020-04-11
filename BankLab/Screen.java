import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
 
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
 
public class Screen extends JPanel implements ActionListener{
     
	private Bank c1;
	private Bank u;
	private Bank c2;
	private Bank c3;
	ArrayList<Bank> users; 
	private BufferedImage background;
	private JTextField pinInput;
	private JButton loginButton;
	
	private JTextField moneyInput;
	private JButton logoutButton;
	private JButton withdrawButton;
	private JButton depositButton;
	private JButton nameButton;
	
	private double balance;
	private boolean access;
	
	public Screen() {
		setLayout(null);
		 try {
            background = ImageIO.read(new File("images.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
		c1 = new Bank("John", 100.99, 1234);
		c2 = new Bank("Jen", 1000.01, 4321);
		c3 = new Bank("Jerry", 50.50, 1111);
		users = new ArrayList<Bank>();
		users.add(c1);
		users.add(c2);
		users.add(c3);
		
		pinInput = new JTextField();
		pinInput.setBounds(50,300,100,30);
		add(pinInput);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(50,340,100,30);
		loginButton.addActionListener(this);
		add(loginButton);
		
		logoutButton = new JButton("Log out");
		logoutButton.setBounds(0,375,200,30);
		logoutButton.addActionListener(this);
		add(logoutButton);
		
		depositButton = new JButton("Deposit");
		depositButton.setBounds(0,335,100,30);
		depositButton.addActionListener(this);
		add(depositButton);
		
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(100,335,100,30);
		withdrawButton.addActionListener(this);
		add(withdrawButton);

		nameButton = new JButton("Change Name");
		nameButton.setBounds(600,0,200,30);
		nameButton.addActionListener(this);
		add(nameButton);
		
		moneyInput = new JTextField();
		moneyInput.setBounds(50,300,100,30);
		add(moneyInput);
		
		setFocusable(true);
		checkVisibility();
	}
 
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(800,600);
    }
     
    @Override
    public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, 800, 600, null);
        
		if (access) {
			//get the name
			String name = u.getName();
			//draw it
			g.drawString(name+":",50,265);
			
			g.drawString("$"+balance+"",100,265);
		} else {
			g.drawString("Pin:",50,295);
		}
    }
	
	public void checkVisibility() {
		if (access) {
			//logged out
			loginButton.setVisible(false);
			pinInput.setVisible(false);
			
			//logged in
			logoutButton.setVisible(true);
			moneyInput.setVisible(true);
			depositButton.setVisible(true);
			withdrawButton.setVisible(true);
			nameButton.setVisible(true);

		} else {
			//logged out
			loginButton.setVisible(true);
			pinInput.setVisible(true);
			
			//logged in
			logoutButton.setVisible(false);
			moneyInput.setVisible(false);
			depositButton.setVisible(false);
			withdrawButton.setVisible(false);
			nameButton.setVisible(false);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {
			//get the text from the input
			String pinText = pinInput.getText();
			int pin = Integer.parseInt(pinText);
			
			for (int i = 0; i < users.size(); i++) {
				if (users.get(i).checkPin(pin)) {
					access = users.get(i).checkPin(pin);
					u = users.get(i);
					if (u.checkPin(pin)) {
						balance = u.getBalance();
					}
				}
			}

			pinInput.setText("");
		} else if(e.getSource() == logoutButton) {
			u.logout();
			access = false;
		} else if (e.getSource() == depositButton) {
			String moneyText = moneyInput.getText();
			double money = Double.parseDouble(moneyText);

			if (money >= 0) {
				balance += money;
				u.setBalance(balance);
			} else {
				System.out.println("Error: Cannot deposit negative amount");
			}

			
		} else if (e.getSource() == withdrawButton) {
			String moneyText = moneyInput.getText();
			double money = Double.parseDouble(moneyText);

			if (money <= balance) {
				if (money >= 0) {
					balance -= money;
					u.setBalance(balance);
				} else if (money < 0) {
					System.out.println("Error: Cannot withdraw negative amount");
				}
			} else {
				System.out.println("Error: Cannot withdraw more than actual balance");
			}
		} else if (e.getSource() == nameButton) {
			String nameText = moneyInput.getText();
			u.changeName(nameText);
		}
		
		moneyInput.setText("");
		repaint();
		checkVisibility();
	}
     
     
}