public class VariableTest {
	public static void main(String[] args) {
		// Part 1
		System.out.println("Part 1");
		byte one = 5;
		System.out.println("one is a byte and has the value of " + one + ".");
		
		short two = 30;
		System.out.println("two is a short and has the value of " + two + ".");
		
		int three = 100;
		System.out.println("three is an int and has the value of " + three + ".");
		
		long four = 500;
		System.out.println("four is a long and has the value of " + four + ".");
		
		float five = 10.5f;
		System.out.println("five is a float and has the value of " + five + ".");
		
		double six = 300.45;
		System.out.println("six is a double and has the value of " + six + ".");
		
		char seven = 'a';
		System.out.println("seven is a char and has the value of " + seven + ".");
		
		boolean eight = true;
		System.out.println("eight is a boolean and has the value of " + eight + ".");
		
		System.out.println();
		
		// Part 2
		System.out.println("Part 2");
		char h = 104;
		char e = 101;
		char l = 108;
		char o = 111;
		char w = 119; 
		char r = 114;
		char d = 100;
		
		System.out.println("" + h+e+l+l+o + " " + w+o+r+l+d);
		
		System.out.println();
		
		// Part 3
		System.out.println("Part 3");
		int length = 4;
		int width = 8;
		int area = length * width;
		int m = 5;
		int b = 10;
		int x = 9;
		int y = x*m + b;
		int f = 60;
		float c = 5*(f -32)/9;
		int distance = 20;
		int time = 4;
		float v = distance/time;
		int mass = 5;
		int accl = 10;
		int force = mass*accl;
		
		System.out.println("Area of rectangle");
		System.out.println("area = length * width");
		System.out.println("length = " + length + ", width = " + width);
		System.out.println("area = " + area);
		
		System.out.println("Equation of a line");
		System.out.println("y = slope * x + y-intercept");
		System.out.println("x = " + x + ", slope = " + m + ", y-intercept = " + b);
		System.out.println("y = " + y);
		
		System.out.println("Farenheit - Celsius conversion");
		System.out.println("C = 5(F - 32)/9");
		System.out.println("F = " + f);
		System.out.println("C = " + c);
		
		System.out.println("Equation of velocity");
		System.out.println("V = Distance/Time");
		System.out.println("Distance = " + distance + ", Time = " + time);
		System.out.println("V = " + v);
		
		System.out.println("Equation of force");
		System.out.println("Force = mass * acceleration");
		System.out.println("mass = " + mass + ", acceleration = " + accl);
		System.out.println("Force = " + force + " newtons");
		
		System.out.println();
		
		// Part 4
		System.out.println("Part 4");
		
		double vel = 5;
		double time2 = 10;
		double distance2 = vel * time;
		double aTwo = 5;
		double bTwo = 6;
		double cTwo = Math.sqrt(Math.pow(aTwo, 2) + Math.pow(bTwo, 2));
		double x1 = 2; 
		double y1 = 3; 
		double x2 = 5; 
		double y2 = 7;
		double xDistance = x2 - x1;
		double yDistance = y2 - y1;
		double distance3 = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
		
		int radius = 5;
		double areaCircle = Math.pow(radius, 2) * 3.14;

		
		System.out.println("Equation of Distance");
		System.out.println("Distance = Velocity * Time");
		System.out.println("Velocity = " + vel + "mph, Time = " + time2);
		System.out.println("Distance = " + distance2 + " miles");
		
		System.out.println("Pythagrean Theorum");
		System.out.println("a^2 + b^2 = c^2");
		System.out.println("a = " + aTwo + ", b = " + bTwo);
		System.out.println("c = " + cTwo );
		
		System.out.println("Equation of force");
		System.out.println("Force = mass * acceleration");
		System.out.println("mass = " + mass + ", acceleration = " + accl);
		System.out.println("Force = " + force + " newtons");
		
		System.out.println("Distance Formula");
		System.out.print("The distance between (" + x1 + ", " + y1 + ") ");
		System.out.println("and (" + x2 + ", " + y2 + ") is " + distance3);
		
		// Challenge Question
		System.out.println("Area of a Circle");
		System.out.println("Area = radius^2 * pi");
		System.out.println("Radius = " + radius);
		System.out.println("Area = " + areaCircle);

		
	}
}