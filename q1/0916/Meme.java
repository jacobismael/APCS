import java.util.Scanner;

public class Meme {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a one-word noun:: ");
		String noun = input.next();
		
		System.out.print("Input a verb:: ");
		String verb = input.next();
		
		System.out.println("The " + noun + " " + verb + "s");
	}
}