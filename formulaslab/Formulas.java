import java.util.Scanner;

public class Formulas {
	private Scanner kb = new Scanner(System.in);
	private double pi = 3.14;
	private double gravity = 9.8;
	
	public void areaTriangle() {
		System.out.println("1: Area of a Triangle");
		System.out.println();
		System.out.print("Input double base:: ");
		double base = kb.nextDouble();
		System.out.print("Input double height:: ");
		double height = kb.nextDouble();
		double area = 0.5 * height * base;
		System.out.println("Area of triangle with base " + base + " and height " + height + " is " + area);
	}
	
	public void areaCircle() {
		System.out.println("2: Area of a Circle");
		System.out.println();
		System.out.print("Input double radius:: ");
		double radius = kb.nextDouble();
		double area = pi * Math.pow(radius, 2);
		System.out.println("Area of circle with radius " + radius + " is " + area);
	}
	// 3: Volume of a Cylinder
	public void volumeCylinder() {
		System.out.println("3: Volume of a Cylinder");
		System.out.println();
		System.out.print("Input double radius:: ");
		double radius = kb.nextDouble();
		double area = pi * Math.pow(radius, 2);
		System.out.print("Input double height:: ");
		double height = kb.nextDouble();
		double volume = area * height;
		System.out.println("Volume of Cylinder with radius " + radius + " and height " + height + " is " + volume);
	}
	// 4: Volume of a Cone
	public void volumeCone() {
		System.out.println("4: Volume of a Cone");
		System.out.println();
		System.out.print("Input double radius:: ");
		double radius = kb.nextDouble();
		double area = pi * Math.pow(radius, 2);
		System.out.print("Input double height:: ");
		double height = kb.nextDouble();
		double volume = area * height / 3;
		System.out.println("Volume of Cylinder with radius " + radius + " and height " + height + " is " + volume);
	}
	// 5: Area of a Square
	public void areaSquare() {
		System.out.println("5: Area of a Square");
		System.out.println();
		System.out.print("Input double side length:: ");
		double sl = kb.nextDouble();
		double area = Math.pow(sl, 2);
		System.out.println("Area of a Square with side length " + sl + " is " + area);
	}
	// 6: Volume of a Cuboid
	public void volumeCuboid() {
		System.out.println("6: Volume of a Cuboid");
		System.out.println();
		System.out.print("Input double side length 1:: ");
		double sl1 = kb.nextDouble();
		System.out.print("Input double side length 3:: ");
		double sl2 = kb.nextDouble();
		System.out.print("Input double side length 3:: ");
		double sl3 = kb.nextDouble();
		double volume = sl1 * sl2 * sl3;
		System.out.println("Volume of a cuboid with side length 1 " + sl1 + ", side length 2 " + sl2 + ", and side length " + sl3 + " is " + volume);
	}

	// 7: Quadratic Formula
	public void quadraticFormula() {
		System.out.println("7: Quadratic Formula");
		System.out.println();
		System.out.print("Input double a:: ");
		double a = kb.nextDouble();
		System.out.print("Input double b:: ");
		double b = kb.nextDouble();
		System.out.print("Input double c:: ");
		double c = kb.nextDouble();
		double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

		double result1 = (discriminant - b) / (2 * a);
		double result2 = ((-1 * discriminant) - b) / (2 * a);

		System.out.println("The intercepts of the equation " + a + "x^2 + " + b +"x + " + c + " are " + result1 + " and " + result2);
	}

	// 8: Area of a Hexagon
	public void areaHexagon() {
		System.out.println("8: Area of a Hexagon");
		System.out.println();
		System.out.print("Input double side length:: ");
		double sl = kb.nextDouble();

		double area = 3 * (Math.sqrt(3) / 2) * Math.pow(sl, 2);
		System.out.println("Area of a Hexagon with side length " + sl + " is " + area);
	}

	// 9: Pythagreon Theorum
	public void pythagreonTheorum() {
		System.out.println("9: Pythagreon Theorum");
		System.out.println();
		System.out.print("Input double a:: ");
		double a = kb.nextDouble();	
		System.out.print("Input double b:: ");
		double b = kb.nextDouble();	
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Length of hypotenuse of triangle with side a " + a + " and side b " + b + " is " + c);
	}

	// 10: Circumference of a Circle
	public void circumferenceCircle() {
		System.out.println("10: Circumference of a Circle");
		System.out.println();
		System.out.print("Input double radius:: ");
		double r = kb.nextDouble();
		double cir = 2 * pi * r;
		System.out.println("Circumference of a circle with radius " + r + " is " + cir);
	}

	// 11: Force Equations
	public void forceequation() {
		System.out.println("11: Equation of Force");
		System.out.println();
		System.out.print("Input double mass in kg:: ");
		double m = kb.nextDouble();
		System.out.print("Input double acceleration:: ");
		double a = kb.nextDouble();
		double f = m * a;
	System.out.println("The force of an object with the mass of " + m + " kg and acceleration " + a + " m/s is " + f + " newtons");
	}

	// 12: Equation for Potential Energy
	public void equationpe() {
		System.out.println("12: Equation of Potential Energy");
		System.out.println();
		System.out.print("Input double mass in kg:: ");
		double m = kb.nextDouble();
		System.out.println("Default gravity is Earth\'s gravitational field constant of " + gravity + " m/s");
		System.out.print("Input double height:: ");
		double h = kb.nextDouble();
		double pe = m * gravity * h;
		System.out.println("Potential Energy of an object with mass " + m + " grams and height from surface " + h + " with default gravitational constant is " + pe + " joules");
	}

	// 13: Equation for Density
	public void densityEquation() {
		System.out.println("13: Equation of Density");
		System.out.println();
		System.out.print("Input double mass in kg:: ");
		double m = kb.nextDouble();
		System.out.print("Input double volume:: ");
		double v = kb.nextDouble();
		double d = m / v;
		System.out.println("Density of an object with the mass of " + m + " kilograms in a volume of " + v + " is " + d + " kg/m^3");
	}

	// 14: Weight Equation
	public void equationWeight() {
		System.out.println("13: Equation of Weight on Earth\'s Gravitational Constant'");
		System.out.println();
		System.out.print("Input double mass in kg:: ");
		double m = kb.nextDouble();
		System.out.println("Default gravity is Earth\'s gravitational field constant of " + gravity + " m/s");
		double w = m * gravity;
		System.out.println("The weight of an object with mass of " + m + " kg is " + w + " newtons");
	}

	// 15: Equation of velocity
	public void equationVelocity() {
		System.out.println("15: Equation of Velocity");
		System.out.println();
		System.out.print("Input double distance:: ");
		double d = kb.nextDouble();
		System.out.print("Input double time in seconds:: ");
		double t = kb.nextDouble();
		double v = d / t;
		System.out.println("Velocity of an object that traveled " + d + " in " + t + " seconds is " + v + " m/s");
	}
}