public class Radius {
	private double pi = 3.14;
	
	public void printArea(double r) {
		double area = pi * Math.pow(r, 2);
		System.out.println("Area is " + area);
	}
	
	public void printCir(double r) {
		double cir = 2 * pi * r;
		System.out.println("Circumference is " + cir);
	}
	
	public void printConeVol(double r, double h) {
		double area = pi * Math.pow(r, 2);
		double volume = area * h;
		System.out.println("Volume is " + volume);
	}
}