public class Runner {
	public static void main(String[] args) {
		Exam2 runner = new Exam2();
		
		String str = runner.getScore(5, 7);
		System.out.println(str);
		
		System.out.println();
		
		int[] numArray = new int[5];
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = (int)(Math.random() * 5 + 1);
		}
		runner.printArray(numArray);
		
		System.out.println();
		int x = runner.sumArray(numArray);
		System.out.println(x);
	}
}