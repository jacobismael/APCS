import java.util.Scanner;

public class Career {
	// Instance Variable(s)
	private String name;
	private int age;
	private String subject;
	private String hobby;
	private String food;
	
	// Contsructor(s)
	public Career(String n, int a, String s, String h, String f) {
		name = n;
		age = a;
		subject = s;
		hobby = h;
		food = f;
	}
	
	// Method(s)
	public void printInfo() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Subject is " + subject);
		System.out.println("Hobby is " + hobby);
		System.out.println("Food is " + food);
		printCareer();
	}
	
	private void printCareer() {
			if (subject.equals("math") && hobby.equals("movies") && food.equals("pizza")) {
					System.out.println("Your future career is a programmer");
			}
			if (subject.equals("math") && hobby.equals("movies") && food.equals("hamburger")) {
					System.out.println("Your future career is a Olympic Athlete");
			}
			if (subject.equals("math") && hobby.equals("gaming") && food.equals("pizza")) {
					System.out.println("Your future career is a Criminal Justice Lawyer");
			}
			if (subject.equals("math") && hobby.equals("gaming") && food.equals("hamburger")) {
					System.out.println("Your future career is a Thief");
			}
			
			if (subject.equals("science") && hobby.equals("movies") && food.equals("pizza")) {
				System.out.println("Your future career is a astrophysicist");
			}
			if (subject.equals("science") && hobby.equals("movies") && food.equals("hamburger")) {
				System.out.println("Your future career is a Biologist");
			}
			if (subject.equals("science") && hobby.equals("gaming") && food.equals("pizza")) {
				System.out.println("Your future career is a Chemist");
			}
			if (subject.equals("science") && hobby.equals("gaming") && food.equals("hamburger")) {
				System.out.println("Your future career is a Marine Biologist");
			}

			if (subject.equals("english") && hobby.equals("movies") && food.equals("pizza")) {
				System.out.println("Your future career is a English Proffesor");
			}
			if (subject.equals("english") && hobby.equals("movies") && food.equals("hamburger")) {
				System.out.println("Your future career is a English Tutor");
			}
			if (subject.equals("english") && hobby.equals("gaming") && food.equals("pizza")) {
				System.out.println("Your future career is a Writer");
			}
			if (subject.equals("english") && hobby.equals("gaming") && food.equals("hamburger")) {
				System.out.println("Your future career is a Publisher");
			}
		}

	
	public void updateProfile(String n, int a, String s, String h, String f) {
		name = n;
		age = a;
		subject = s;
		hobby = h;
		food = f;
	}
}