public class Final2 {
	private String myName;
	
	public Final2() {
		this.myName = "World";
	}
	
	public Final2(String name) {
		this.myName = name;
	}
	
	public void printHello() {
		System.out.println("Hello " + myName);
	}
	
	public double getC(int a, int b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	public boolean checkAll(int x, int y, int z) {
		if((x % 2 != 0 && y % 2 != 0) || (x % 2 != 0 && z % 2 != 0) || (y % 2 != 0 && z % 2 != 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getRandomInt(int min, int max){
		return (int)(Math.random() * ((max - min) +  1) + min);
	}
	
	public int getIfElse(int x, int y) {
		if(x == y) {
			return 10;
		} else if(x == 3 || y == 3) {
			return 5;
		} else {
			return 0;
		}
	}
	
	public void printSwitch(int x) {
		switch(x) {
			case 1:
				System.out.println("car");
				break;
			case 2:
				System.out.println("door");
				break;
			case 3:
				System.out.println("rm522");
				break;
			default:
				System.out.println("java");
		}
	}
	
	public void countWhile(int num1, int num2) {
		while(num1 <= num2) {
			System.out.println(num1);
			num1++;
		}
	}
	
	public int getFactorial(int x) {
		int total = 1;
		for(int i = x; i > 0; i--) {
			total *= i;
		}
		return total;
	}
	
	public int getSummation(int x) {
		int total = 0;
		for(int i = 0; i <= x; i++) {
			total += i;
		}
		return total;
	}
	
	public int getProduct(int[] arr) {
		int total = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 13) {
				total *= arr[i];
			}
		}
		return total;
	}
	
	public boolean check12(int[] arr) {
		boolean no1 = true;
		boolean no2 = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				no1 = false;
			} else if(arr[i] == 2) {
				no2 = false;
			}
		}
		if(no1 && no2) {
			return true;
		} else {
			return false;
		}
	}
}