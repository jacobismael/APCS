public class ModEx {
	private int number;
	
	public ModEx(int x) {
		number = x;
	}
	
	public void numCheck() {
		if (number % 5 == 0) {
			System.out.println("True, divisible by 5");
		} else {
			System.out.println("False, not divisible by 5");
		}
	}
}