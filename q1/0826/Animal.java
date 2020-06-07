import java.util.Scanner;

public class Animal {
	public static void main(String[] args) {
		System.out.println("______");
		System.out.println();
		System.out.print("What is this::  ");
		Scanner input = new Scanner(System.in);
		String answer = input.next();
		
		if (answer.equals("worm") || answer.equals("snake")) {
			System.out.println("GG m8");
		} else {
			System.out.println("No");
		}
	}
}