public class Profile {
	private String name;
	private int age;
	
	public Profile() {
		name = "John";
		age = 15;
	}
	
	public Profile(String x, int y) {
		name = x;
		age = y;
	}
	
	public void printInfo() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}
	
	public void printInfo(int x) {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("ID: " + x);
	}
}