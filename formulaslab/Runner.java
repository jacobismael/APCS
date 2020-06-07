import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Formulas formula = new Formulas();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("--------------Formulas--------------");
		System.out.println("Math Formulas:");
		System.out.println("1: Area of a triangle");
		System.out.println("2: Area of a cirlce");
		System.out.println("3: Volume of a cylinder");
		System.out.println("4: Volume of a cone");
		System.out.println("5: Area of a square");
		System.out.println("6: Volume of a cuboid");
		System.out.println("7: Quadratic formula");
		System.out.println("8: Area of a Hexagon");
		System.out.println("9: Pythagreon theorum");
		System.out.println("10: Circumference of a circle");
		System.out.println();
		System.out.println("Physics Formulas:");
		System.out.println("11: Force equation");
		System.out.println("12: Equation for potential energy");
		System.out.println("13: Equation for ");
		System.out.println("14: Equation for weight of an object");
		System.out.println("15: Equation of velocity");
		System.out.println("------------------------------------");
		System.out.println("0: Quit program");
		System.out.println("------------------------------------");
		System.out.print("Input option:: ");
		int choice = kb.nextInt();
		System.out.println("------------------------------------");
		
		while(choice != 0) {
			if(choice == 1) {
				formula.areaTriangle();
			} else if(choice == 2) {
				formula.areaCircle();
			} else if(choice == 3) {
				formula.volumeCylinder();
			} else if(choice == 4) {
				formula.volumeCone();
			} else if(choice == 5) {
				formula.areaSquare();
			} else if(choice == 6) {
				formula.volumeCuboid();
			} else if (choice == 7) {
				formula.quadraticFormula();
			} else if (choice == 8) {
				formula.areaHexagon();
			} else if ( choice == 9) {
				formula.pythagreonTheorum();
			} else if (choice == 10) {
				formula.circumferenceCircle();
			} else if (choice == 11) {
				formula.forceequation();
			} else if (choice == 12) {
				formula.equationpe();
			} else if (choice == 13) {
				formula.densityEquation();
			} else if (choice == 14) {
				formula.equationWeight();
			} else if (choice == 15) {
				formula.equationVelocity();
			} else {
				System.out.println("Error: Unrecognized or incorrect syntax for input");
			}
			System.out.println();
			System.out.println("--------------Formulas--------------");
			System.out.println("Math Formulas:");
			System.out.println("1: Area of a Triangle");
			System.out.println("2: Area of a Cirlce");
			System.out.println("3: Volume of a Cylinder");
			System.out.println("4: Volume of a Cone");
			System.out.println("5: Area of a Square");
			System.out.println("6: Volume of a Cuboid");
			System.out.println("7: Quadratic Formula");
			System.out.println("8: Area of a Hexagon");
			System.out.println("9: Pythagreon Theorum");
			System.out.println("10: Circumference of a Circle");
			System.out.println();
			System.out.println("Physics Formulas:");
			System.out.println("11: Equation for Force");
			System.out.println("12: Equation for Potential Energy");
			System.out.println("13: Equation for Density");
			System.out.println("14: Equation for Weight of an Object");
			System.out.println("15: Equation of Velocity");
			System.out.println("------------------------------------");
			System.out.println("0: Quit program");
			System.out.println("------------------------------------");
			System.out.print("Input option:: ");
			choice = kb.nextInt();
			System.out.println("------------------------------------");
		}
		
		System.out.println("0: Quit Program");
	}
}