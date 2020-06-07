public class Circle {
	private double pi;
	private double radius;
	
	public Circle() {
		pi = 3.14;
		radius = 0;
	}
	
	public Circle(double r) {
		pi = 3.14;
		radius = r;
	}
	
	public void printArea() {
		double area = pi * Math.pow(radius, 2);
		System.out.println("Area of circle with radius " + radius + " is " + area);
	}
}