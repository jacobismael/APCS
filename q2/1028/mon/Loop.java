public class Loop {
	private int max;
	private int min;
	
	public Loop(int x, int y) {
		min = x;
		max = y;
	}
	
	public void countWhile() {
		int count = min;
		while(count <= max) {
			System.out.println(count);
			count+=2;
		}
	}
	
	public int getSum() {
		int count = min;
		int total = 0;
		do {
			total += count;
			count++;
		} while(count<=max);
		return total;
	}
}