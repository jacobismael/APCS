import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a height for the cylinder:: ");
		double height = input.nextDouble();
		System.out.print("Input a radius for the cylinder:: ");
		double radius = input.nextDouble();
		double pi = 3.14;
		
		double volume = (Math.pow(radius, 2) * pi) * height;
		
		System.out.println("Volume = " + volume + " units cubed");
	}
}