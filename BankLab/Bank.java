public class Bank {
	//Instance Variables
	private String name;
	private double balance;
	private int pin;
	private boolean access;
	
	//Constructors
	public Bank(String name, double balance, int pin) {
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.access = false;
	}
	
	//Methods
	public String getName() {
		if (access) {
			return name;
		} else {
			return "";
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void logout() {
		access = false;
	}

	public void changeName(String x) {
		name = x;
	}
	
	public boolean checkPin(int pinInput) {
		if (pinInput == pin) {
			access = true;
			return true;
		} else {
			access = false;
			return false;
		}
	}
}