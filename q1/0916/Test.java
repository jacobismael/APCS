import java.util.Scanner;

public class Test {
	private double pi = 0;
	private int radius = 0;
	Scanner kb = new Scanner(System.in);
	
	public void setVariables() {
		pi = 3.14;
		System.out.print("Input int for radius:: ");
		radius = kb.nextInt();
	}
	
	public void printCircumference() {
		double cir = 2 * pi * radius;
		System.out.println("Circumference is " + cir);
	}
}