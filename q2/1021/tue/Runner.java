import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input double number of times to run:: ");
		int runner = kb.nextInt();
		
		int i = 0;
		while (i < runner) {
			System.out.println("******");
			i++;
		}
	}
}