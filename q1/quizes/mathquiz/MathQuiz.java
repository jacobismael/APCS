public class MathQuiz {
	private int num;
	
	public MathQuiz(int x) {
		num = x;
	}
	
	public void isOdd() {
		if (num % 2 == 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
	
	public void findC(int a, int b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("C: " + c);
	}
}