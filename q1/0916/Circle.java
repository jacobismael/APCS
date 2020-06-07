import java.util.Scanner;

public class Circle {
	private double pi = 3.14;
	private double r = 0;
	private double area;
	
	Scanner kb = new Scanner(System.in);
	
	public void printArea() {
		area = pi * r * r;
		System.out.println("Area is " + area);
	}
	
	public void setRadius() {
		System.out.print("Input a radius:: ");
		r = kb.nextDouble();
	}
}