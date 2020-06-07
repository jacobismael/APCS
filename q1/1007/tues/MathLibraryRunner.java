import java.util.Scanner;

public class MathLibraryRunner {
	public static void main(String[] args) {
		MathLibrary runner = new MathLibrary();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("input double a:: ");
		double a = kb.nextDouble();
		System.out.print("input double b:: ");
		double b = kb.nextDouble();
		System.out.print("input double c:: ");
		double c = kb.nextDouble();
		
		runner.solveQuadratic(a, b, c);
	}
}