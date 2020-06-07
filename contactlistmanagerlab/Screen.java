import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;


public class Screen extends JPanel implements ActionListener{

	private ArrayList<Contact> contactList;

	private JTextPane allContactsPane;

	private JTextField searchInput;
	private int buttonW, buttonH;
	private JButton searchFirstNameButton;
	private JButton searchLastNameButton;
	private JButton searchUsernameButton;
	private JButton searchDomainButton;
	private JButton searchDomainExtensionButton;
	private JTextPane resultsPane;

	private JButton sortFirstName;
	private JButton sortLastName;
	private JButton sortUsername;

	private JButton addContact;
	private JButton removeContact;
	
	public Screen(){
		setLayout(null);

		contactList = new ArrayList<Contact>();

		contactList.add(new Contact("Mark", "Zuckerberg", "zucc@russia.net"));
		contactList.add(new Contact("O", "Bama", "obama.barack@com.gmail"));
		contactList.add(new Contact("Nigeria", "Nigeria", "nigeria@obama.com"));

		String str = "";
		for(int i = 0; i < contactList.size(); i++) {
			str += contactList.get(i).toString();
			str += "\n";
		}


		buttonW = 150;
		buttonH = 50;
		
		searchInput = new JTextField();
		searchInput.setBounds(10, 10, buttonW * 5 + 10 * 4, 50);
		add( searchInput );

		searchFirstNameButton = new JButton("First Name");
		searchFirstNameButton.setBounds(10, 65, buttonW, buttonH);
		searchFirstNameButton.addActionListener(this);
		add( searchFirstNameButton );

		searchLastNameButton = new JButton("Last Name");
		searchLastNameButton.setBounds(buttonW + 10 * 2, 65, buttonW, buttonH);
		searchLastNameButton.addActionListener(this);
		add( searchLastNameButton );

		searchUsernameButton = new JButton("Username");
		searchUsernameButton.setBounds(buttonW * 2 + 10 * 3, 65, buttonW, buttonH);
		searchUsernameButton.addActionListener(this);
		add( searchUsernameButton );

		searchDomainButton = new JButton("Domain");
		searchDomainButton.setBounds(buttonW * 3 + 10 * 4, 65, buttonW, buttonH);
		searchDomainButton.addActionListener(this);
		add( searchDomainButton );

		int domainSize = buttonW * 4 + 10 * 5;

		searchDomainExtensionButton = new JButton("Domain Ext");
		searchDomainExtensionButton.setBounds(domainSize, 65, buttonW, buttonH);
		searchDomainExtensionButton.addActionListener(this);
		add( searchDomainExtensionButton );

		allContactsPane = new JTextPane();
		allContactsPane.setBounds(10, 120, 300, 400);
		add( allContactsPane );
		allContactsPane.setEditable(false);

		allContactsPane.setText(str);

		resultsPane = new JTextPane();
		resultsPane.setBounds(500, 120, 300, 400);
		add( resultsPane ); 
		resultsPane.setEditable(false);

		sortFirstName = new JButton("First Name");
		sortFirstName.setBounds(320, 120, 170, 50);
		sortFirstName.addActionListener(this);
		add( sortFirstName );

		sortLastName = new JButton("Last Name");
		sortLastName.setBounds(320, 180, 170, 50);
		sortLastName.addActionListener(this);
		add( sortLastName );

		sortUsername = new JButton("Username");
		sortUsername.setBounds(320, 240, 170, 50);
		sortUsername.addActionListener(this);
		add( sortUsername );

		addContact = new JButton("+");
		addContact.setBounds(10, 530, 390, 50);
		addContact.addActionListener(this);
		add( addContact );

		removeContact = new JButton("-");
		removeContact.setBounds(410, 530, 390, 50);
		removeContact.addActionListener(this);
		add( removeContact );
		
		setFocusable(true);	
	}
	
	public Dimension getPreferredSize(){
		//Sets the size of the panel
		return new Dimension(810,590);
	}
 
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);

	
	}

	public void actionPerformed(ActionEvent e) {
		String str = "";
		if(e.getSource() == searchFirstNameButton) {
			//grab search text
			String userInput = searchInput.getText();
			// loop through contact List
			for(int i = 0; i < contactList.size(); i++) {
				if(userInput.equals(contactList.get(i).getFirstName())) {
					str += contactList.get(i);
					str += "\n";
				}
			}
			if(str.equals("")) {
				str = "Nothing to see here...";
			}
		} else if(e.getSource() == searchLastNameButton) {
			//grab search text
			String userInput = searchInput.getText();
			// loop through contact List
			for(int i = 0; i < contactList.size(); i++) {
				if(userInput.equals(contactList.get(i).getLastName())) {
					str += contactList.get(i);
					str += "\n";
				}
			}
			if(str.equals("")) {
				str = "Nothing to see here...";
			}
		} else if(e.getSource() == searchUsernameButton) {
			//grab search text
			String userInput = searchInput.getText();
			// loop through contact List
			for(int i = 0; i < contactList.size(); i++) {
				if(userInput.equals(contactList.get(i).getUsername())) {
					str += contactList.get(i);
					str += "\n";
				}
			}
			if(str.equals("")) {
				str = "Nothing to see here...";
			}
		} else if(e.getSource() == searchDomainButton) {
			//grab search text
			String userInput = searchInput.getText();
			// loop through contact List
			for(int i = 0; i < contactList.size(); i++) {
				if(userInput.equals(contactList.get(i).getDomain())) {
					str += contactList.get(i);
					str += "\n";
				}
			}
			if(str.equals("")) {
				str = "Nothing to see here...";
			}
		} else if(e.getSource() == searchDomainExtensionButton) {
			//grab search text
			String userInput = searchInput.getText();
			// loop through contact List
			for(int i = 0; i < contactList.size(); i++) {
				if(userInput.equals(contactList.get(i).getDomainExtension())) {
					str += contactList.get(i);
					str += "\n";
				}
			}
			if(str.equals("")) {
				str = "Nothing to see here...";
			}
		} else if(e.getSource() == addContact) {
			if(contactList.size() < 10) {

				//grab search text
				String userInput = searchInput.getText();
				System.out.println(userInput == null);
				int st1 = userInput.indexOf(' ');
				int st2 = userInput.lastIndexOf(' ');
				String name = userInput.substring(0, st1);
				String lname = userInput.substring(st1+1, st2);
				String email = userInput.substring(st2+1);
				contactList.add(new Contact(name, lname, email));

				for(int i = 0; i < contactList.size(); i++) {
					str += contactList.get(i).toString();
					str += "\n";
				}

				allContactsPane.setText(str);
				searchInput.setText("");
				str = "";
			} else {
				System.out.println("Cannot add more than 10 contacts");
			} 
		} else if(e.getSource() == removeContact) {
			if(contactList.size() > 0) {
				contactList.remove(contactList.size() - 1);

				for(int i = 0; i < contactList.size(); i++) {
					str += contactList.get(i).toString();
					str += "\n";
				}

				allContactsPane.setText(str);
				str = "";
			}
		} else if(e.getSource() == sortFirstName) {
			String[] temparr = new String[contactList.size()];
			for(int i = 0; i < temparr.length; i++) {
				temparr[i] = contactList.get(i).getFirstName().toLowerCase();
			}

			Arrays.sort(temparr);

			ArrayList<Contact> tempcontactList = contactList;

			for(int i = 0; i < temparr.length; i++) {
				for(int j = 0; j < contactList.size(); j++) {
					if(temparr[i].equals(contactList.get(j).getFirstName().toLowerCase())) {
						Contact temp = contactList.get(i);
						contactList.set(i, contactList.get(j));
						contactList.set(j, temp); 
					}
				}
			}

			for(int i = 0; i < contactList.size(); i++) {
				str += contactList.get(i).toString();
				str += "\n";
			}

			allContactsPane.setText(str);
			str = "";
		} else if(e.getSource() == sortLastName) {
			String[] temparr = new String[contactList.size()];
			for(int i = 0; i < temparr.length; i++) {
				temparr[i] = contactList.get(i).getLastName().toLowerCase();
			}

			Arrays.sort(temparr);

			ArrayList<Contact> tempcontactList = contactList;

			for(int i = 0; i < temparr.length; i++) {
				for(int j = 0; j < contactList.size(); j++) {
					if(temparr[i].equals(contactList.get(j).getLastName().toLowerCase())) {
						Contact temp = contactList.get(i);
						contactList.set(i, contactList.get(j));
						contactList.set(j, temp); 
					}
				}
			}

			for(int i = 0; i < contactList.size(); i++) {
				str += contactList.get(i).toString();
				str += "\n";
			}

			allContactsPane.setText(str);
			str = "";
		} else if(e.getSource() == sortUsername) {
			String[] temparr = new String[contactList.size()];
			for(int i = 0; i < temparr.length; i++) {
				temparr[i] = contactList.get(i).getUsername().toLowerCase();
			}

			Arrays.sort(temparr);

			ArrayList<Contact> tempcontactList = contactList;

			for(int i = 0; i < temparr.length; i++) {
				for(int j = 0; j < contactList.size(); j++) {
					if(temparr[i].equals(contactList.get(j).getUsername().toLowerCase())) {
						Contact temp = contactList.get(i);
						contactList.set(i, contactList.get(j));
						contactList.set(j, temp); 
					}
				}
			}

			for(int i = 0; i < contactList.size(); i++) {
				str += contactList.get(i).toString();
				str += "\n";
			}

			allContactsPane.setText(str);
			str = "";
		}
		
		resultsPane.setText(str);
	}

}
