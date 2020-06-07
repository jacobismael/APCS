public class ModEx {
	public void checkOddorEven(int x) {
		if (x % 2 == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
	}
	
	public void checkPrime(int n) {
		boolean checker = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				checker = false;
			}
		}
		
		if (checker) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is composite");
		}
		
		
	}
}