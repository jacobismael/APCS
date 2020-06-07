public class Exam2 {
	// Instance Variables
	private double pi;
	private double radius;
	
	// Constructors
	public Exam2() {
		pi = 3.14;
		radius = 10;
	}
	
	public Exam2(double radius) {
		pi = 3.14;
		this.radius = radius;
	}
	
	// Methods
	public void printCir() {
		double x = pi * radius * 2;
		System.out.println("Area is  " + x);
	}
	
	public void printVolCone(double height) {
		double v = (1.0/3.0) * pi * radius * radius * height;
		System.out.println("Volume is " + v);
	}
}