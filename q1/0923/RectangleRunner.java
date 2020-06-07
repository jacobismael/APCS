import java.util.Scanner;

public class RectangleRunner {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		Scanner kb = new Scanner(System.in);
		
		r1.printArea();
		
		System.out.print("Input int length:: ");
		int x = kb.nextInt();
		
		System.out.print("Input int width:: ");
		int y = kb.nextInt();
		
		Rectangle r2 = new Rectangle(x, y);
		
		r2.printArea();
	}
}