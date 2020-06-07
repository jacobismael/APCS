import java.util.Scanner;
public class Binary {
	public static void main(String[] args) {
		System.out.print("Enter a decimal number:  ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		
		if (x >= 128) {
			System.out.print("1");
		}
		if (x >= 64) {
			System.out.print("1");
		}
		if (x >= 32) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
		if (x >= 16) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
		if (x >= 8) {
			System.out.print("1");
		} else {
			System.out.print("0");
			x = x - 8;
		}
		if (x >= 4) {
			System.out.print("1");
			x = x - 4;
		} else {
			System.out.print("0");
		}
		if (x >= 2) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		if (x >= 1) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
		
		System.out.println();
		
		
	}
}