import java.util.Scanner;

public class Trivia {
	public static void main(String[] args) {
		System.out.print("What color is the sun :: ");
		Scanner input = new Scanner(System.in);
		String answer = input.next();
		if (answer.equals("yellow") ) {
			System.out.println("GG m8");
		} else {
			System.out.println("No");
		}
		
		System.out.print("What starts with f and ends with uck :: ");
		Scanner input2 = new Scanner(System.in);
		String answer2 = input2.nextLine();
		if (answer2.equals("fire truck")) {
			System.out.println("GG m8");
		} else {
			System.out.println("No");
		}
	}
}