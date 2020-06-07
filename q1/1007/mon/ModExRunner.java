import java.util.Scanner;

public class ModExRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ModEx runner = new ModEx();
		
		System.out.print("Input int number:: ");
		int number = kb.nextInt();
		
		runner.checkOddorEven(number);
		
		runner.checkPrime(8);
		runner.checkPrime(17);
		runner.checkPrime(587);
	} 
}