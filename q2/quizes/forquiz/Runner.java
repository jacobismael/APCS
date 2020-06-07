public class Runner {
	public static void main(String[] args) {
		LoopQuiz runner = new LoopQuiz(3, 12);
		
		runner.countUp();
		System.out.println();
		runner.countDown();
		System.out.println();
		int x = runner.getSum();
		System.out.println(x);
		System.out.println();
		runner.printTable(2, 3);
	}
}