import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = 1;
		
		while(i < 13) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		i = 5;
		while (i < 32) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		i = 39;
		while(i > 20) {
			System.out.println(i);
			i--;
		}
		
		System.out.println();
		
		i = 2;
		while(i < 21) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println();
		
		i = 15;
		while(i > -11) {
			System.out.println(i);
			i-=5;
		}
		
		System.out.println();
		
		System.out.print("Input int number greater than 20:: ");
		int choice = kb.nextInt();
		System.out.print("Input int number to count by:: ");
		int runner = kb.nextInt();
		
		i = 1;
		while(i < choice + 1) {
			System.out.println(i);
			i+=runner;
		}
		
	}
}