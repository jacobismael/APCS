import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Animal runner = new Animal();
		runner.printInfo();
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Input string type:: ");
		String type = kb.next();
		System.out.print("Input int age:: ");
		int age = kb.nextInt();
		Animal runner2 = new Animal(type, age);
		runner2.printInfo();
	}
}