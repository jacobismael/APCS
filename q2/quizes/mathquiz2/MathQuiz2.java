public class MathQuiz2 {
	private double pi;
	private double radius;
	
	public MathQuiz2(double radius) {
		this.radius = radius;
		pi = 3.14;
	}
	
	public double getArea() {
		double area = pi * Math.pow(radius, 2);
		return area;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}