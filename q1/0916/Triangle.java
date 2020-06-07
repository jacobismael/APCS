import java.util.Scanner;

public class Triangle {
	public void printArea() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a base:: ");
		double base = input.nextDouble();
		System.out.print("Input a height:: ");
		double height = input.nextDouble();
		
		double area = 0.5 * height * base;
		
		System.out.println("Area = " + area);
	}
}