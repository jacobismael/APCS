import java.util.Scanner;
public class Classwork {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = 8;
		while(i <= 30) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println();
		
		i = 8;
		do {
			System.out.println(i);
			i+=2;
		} while(i <= 30);
		
		System.out.println();
		
		i = 2;
		int total = 0;
		while(i<=19) {
			total +=i;
			i++;
		}
		System.out.println(total);
		
		System.out.println();
		
		i = 2;
		total = 0;
		do {
			total+=i;
			i++;
		} while(i<=19);
		System.out.println(total);
		
		System.out.println();
		
		System.out.print("Input int number:: ");
		int choice = kb.nextInt();
		
		if (choice > 0) {
			i = 1;
			do {
				System.out.println(i);
				i++;
			} while(i<=choice);
		} else if(choice < 0) {
			i = -1;
			do {
				System.out.println(i);
				i--;
			} while(i>=choice);
		} else {
			System.out.println("Number is 0");
		}
	}
}