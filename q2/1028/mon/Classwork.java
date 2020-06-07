import java.util.Scanner;
public class Classwork {
	public static void main(String[] args) {
		Selection runner = new Selection();
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input int zipcode:: ");
		System.out.println(runner.zipCode1(kb.nextInt()));
		
		System.out.print("Input int zipcode:: ");
		System.out.println(runner.zipCode2(kb.nextInt()));
		
		System.out.print("Input int zipcode:: ");
		System.out.println(runner.zipCode3(kb.nextInt()));
	}
}