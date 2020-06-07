public class Circle {
	private double pi;
	private double radius;
	
	public Circle() {
		radius = 0;
		pi = 3.14;
	}
	
	public Circle(double x) {
		radius = x;
		pi = 3.14;
	}
	
	public void printCylinderVol(double x) {
		double height = x;
		double volume = Math.pow(radius, 2) * pi * height;
		System.out.println("Volume of Cylinder with radius " + radius + " and height " + height + " is " + volume);
	}
}