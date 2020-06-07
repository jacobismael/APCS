public class Exam2 {
	
	public String getScore(int x, int y) {
		if(x % 2 != 0 && y % 2 != 0) {
			return "A";
		} else if(x % 2 != 0 || y % 2 != 0) {
			return "B";
		} else {
			return "C";
		}
	}
	
	public void count(int x, int y) {
		int min = x;
		int max = y;
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}
	
	public void printArray(int[] arr) {
		for(int x : arr) {
			System.out.println(x);
		}
	}
	
	public int sumArray(int[] arr) {
		int total = 0;
		for(int i = 0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
}