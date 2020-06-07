import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input int number to count to:: ");
		int choice = kb.nextInt();
		
		System.out.println();
		
		int i = 1;
		while (i <= choice) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= choice);
	}
}