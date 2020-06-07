public class LoopQuiz {
	private int min;
	private int max;
	
	public LoopQuiz(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public void countUp() {
		for(int i = 1; i<=min; i++) {
			System.out.println(i);
		}
	}
	
	public void countDown() {
		for(int i = max; i>=min; i-=3) {
			System.out.println(i);
		}
	}
	
	public int getSum() {
		int total = 0;
		for(int i = min; i<=max; i++) {
			total += i;
		}
		return total;
	}
	
	public void printTable(int rows, int cols) {
		for(int i  = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}