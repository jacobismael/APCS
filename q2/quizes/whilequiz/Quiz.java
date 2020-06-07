public class Quiz {
	private int grade1;
	private int grade2;
	
	public Quiz(int one, int two) {
		grade1 = one;
		grade2 = two;
	}
	
	public void countUpBy2(int x) {
		int runner = 0;
		while(runner<=x) {
			System.out.println(runner);
			runner+=2;
		}
	}
	
	public int getSummation(int x) {
		int runner = 0;
		int total = 0;
		while(runner<=x) {
			total+=runner;
			runner++;
		}
		return total;
	}
	
	public String getGrade1() {
		if(grade1 >= 95 && grade2 >= 95) {
			return "A";
		} else if(grade1 >= 90 || grade2 >= 90) {
			return "B";
		} else {
			return "F";
		}
	}
	
	public String getGrade2() {
		String result;
		switch(grade2) {
			case 95:
				result =  "A";
				break;
			case 85:
				result = "B";
				break;
			case 75:
				result = "C";
				break;
			default:
				result = "F";
				break;
		}
		return result;
	}
}