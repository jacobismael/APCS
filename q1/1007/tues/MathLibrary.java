public class MathLibrary {
	// Method
	public void solveQuadratic(double a, double b, double c) {
		double discriminint = Math.pow(b, 2) - (4 * a * c);
		if (discriminint <= 0) {
			System.out.println("No solution");
		} else {
			double area1 = (-b + Math.sqrt(discriminint)) / (2 * a);
			double area2 = (-b - Math.sqrt(discriminint)) / (2 * a);
			System.out.println("X-intercepts are " + area1 + " and " + area2);
		}
	}
	
	public void soh(int degree, int hyp) {
		
	}
}