import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		System.out.print("Input length as an integer:  ");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		
		System.out.print("Input width as a double:  ");
		Scanner keyboard = new Scanner(System.in);
		double width = keyboard.nextDouble();
		
		double area = length * width;
		
		
		System.out.println("Area is " + area);
	}
}