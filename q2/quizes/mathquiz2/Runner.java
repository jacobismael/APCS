public class Runner {
	public static void main(String[] args) {
		MathQuiz2 runner = new MathQuiz2(15);
		
		double x = runner.getArea();
		System.out.println(x);
		
		runner.setRadius(10);
		double y = runner.getArea();
		System.out.println(y);
	}
}