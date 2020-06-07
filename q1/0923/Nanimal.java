public class Nanimal {
	private int age;
	private String animalType;
	
	public void setVariable(String x, int y) {
		age = y;
		animalType = x;
	}
	
	public void printInfo() {
		System.out.println("Age is " + age);
		System.out.println("Type is "+ animalType);
	}
}