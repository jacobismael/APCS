import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("What\'s your first name:: ");
		String name = kb.next();
		
		System.out.println("Hello " + name);
		
		System.out.println();
		
		System.out.println("Triangle");
		
		System.out.print("Enter a base of a triangle:: ");
		int base = kb.nextInt();
		
		System.out.print("Enter a height of a triangle:: ");		
		int height = kb.nextInt();
		
		double area = 0.5 * base * height;
		
		System.out.println("Area is = " + area);
		
		System.out.println();
		
		System.out.println("Circle");
	
		System.out.print("Input a radius:: ");
		int radius = kb.nextInt();
		
		double pi = 3.14;
		
		area = radius * radius * pi;
		
		System.out.println("Area is " + area);
	}
}