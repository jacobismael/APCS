public class Animal {
	private String animalType;
	private int age;
	
	public Animal() {
		animalType = "blank";
		age = 0;
	}
	public Animal(String x, int y) {
		animalType = x;
		age = y;
	}
	
	public void printInfo() {
		System.out.println("Type is " + animalType);
		System.out.println("Age is " + age);
	}
}