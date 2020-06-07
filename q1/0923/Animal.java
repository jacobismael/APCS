public class Animal {
	private String animaltype;
	private int age;
	
	public void setVariables() {
		animaltype = "dog";
		age = 5;
	}
	
	public void printinfo() {
		System.out.println("Type is " + animaltype);
		System.out.println("Age is " + age);
	}
}