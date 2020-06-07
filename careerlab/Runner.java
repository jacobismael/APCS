import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Career p1 = new Career("Jacob", 14, "math", "movies", "pizza");
		Career p2 = new Career("John", 21, "science", "gaming", "hamburger");
		Career p3 = new Career("Jane", 32, "english", "movies", "hamburger");

		p1.printInfo();
		System.out.println();
		p2.printInfo();
		System.out.println();
		p3.printInfo();

		System.out.println();
		System.out.println("change profile 3: ");

		System.out.print("input String(1 word) name:: ");
		String name = kb.next();

		System.out.print("input int age:: ");
		int age = kb.nextInt();
		
		System.out.print("input String subject(math, science, or english):: ");
		String subject = kb.next();
		
		System.out.print("input String hobby(movies, gaming):: ");
		String hobby = kb.next();

		System.out.print("input String food(pizza, hamburger):: ");
		String food = kb.next();

		p3.updateProfile(name, age, subject, hobby, food);

		System.out.println();
		
		p3.printInfo();
		System.out.println();

		System.out.println("-------------------");
		System.out.println();

		p1.printInfo();
		System.out.println();
		p2.printInfo();
		System.out.println();
		p3.printInfo();
		System.out.println();

		System.out.println("1: change profile 1");
		System.out.println("2: change profile 2");
		System.out.println("3: change profile 3");
		System.out.println("-------------------");
		System.out.println("0: quit program");
		System.out.println("-------------------");

		System.out.print("input int option:: ");
		double choice = kb.nextInt();
		System.out.println("-------------------");

		while (choice != 0) {
			
			if (choice == 1) {
				System.out.println("1: change profile 1");
				System.out.println();
				System.out.print("input String(1 word) name:: ");
				name = kb.next();
		
				System.out.print("input int age:: ");
				age = kb.nextInt();
				
				System.out.print("input String subject(math, science, or english):: ");
				subject = kb.next();
				
				System.out.print("input String hobby(movies, gaming):: ");
				hobby = kb.next();
		
				System.out.print("input String food(pizza, hamburger):: ");
				food = kb.next();
				System.out.println("-------------------");
				p1.updateProfile(name, age, subject, hobby, food);
				System.out.println("-------------------");
				p1.printInfo();

			} else if (choice == 2) {
				System.out.println("2: change profile 2");
				System.out.println();
				System.out.print("input String(1 word) name:: ");
				name = kb.next();
		
				System.out.print("input int age:: ");
				age = kb.nextInt();
				
				System.out.print("input String subject(math, science, or english):: ");
				subject = kb.next();
				
				System.out.print("input String hobby(movies, gaming):: ");
				hobby = kb.next();
		
				System.out.print("input String food(pizza, hamburger):: ");
				food = kb.next();
				System.out.println("-------------------");
				p2.updateProfile(name, age, subject, hobby, food);
				System.out.println("-------------------");
				p2.printInfo();

			} else if (choice == 3) {
				System.out.println("3: change profile 3");
				System.out.println();
				System.out.print("input String(1 word) name:: ");
				name = kb.next();
		
				System.out.print("input int age:: ");
				age = kb.nextInt();
				
				System.out.print("input String subject(math, science, or english):: ");
				subject = kb.next();
				
				System.out.print("input String hobby(movies, gaming):: ");
				hobby = kb.next();
		
				System.out.print("input String food(pizza, hamburger):: ");
				food = kb.next();
				System.out.println("-------------------");
				p3.updateProfile(name, age, subject, hobby, food);
				System.out.println("-------------------");
				p3.printInfo();
			}

			p1.printInfo();
			System.out.println();
			p2.printInfo();
			System.out.println();
			p3.printInfo();
			System.out.println();

			System.out.println("1: change profile 1");
			System.out.println("2: change profile 2");
			System.out.println("3: change profile 3");
			System.out.println("-------------------");
			System.out.println("0: quit program");
			System.out.println("-------------------");

			System.out.print("input int option:: ");
			choice = kb.nextInt();
			System.out.println("-------------------");
		}

		System.out.println("0: quit program");
	}
}