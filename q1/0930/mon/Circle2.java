public class Circle2 {
	private double pi;
	private double radius;
	
	public Circle2() {
		pi = 3.14;
		radius = 1;
	}
	
	public Circle2(double x) {
		pi = 3.14;
		radius = x;
	}
	
	public void printArea() {
		double area = Math.pow(radius, 2) * pi;
		System.out.println("Area of cirlce with radius " + radius + " is " + area);
	}
	
	public void printArea(double x) {
		radius = x;
		double area = Math.pow(radius, 2) * pi;
		System.out.println("Area of cirlce with radius " + radius + " is " + area);
	} 
	
	public void printVol(double) {
		radius = x;
		double vol = Math.pow(radius, 3) * pi * 4/3;
		System.out.println("Volume of a sphere with radius " + radius + " is " + vol);
	}
	
	public void printVol(double x, double y) {
		radius = x;
		double height = y;
		double vol = Math.pow(radius, 2) * pi * height;
		System.out.println("Volume of a cylinder with radius " + radius + " is " + vol);
	}
}