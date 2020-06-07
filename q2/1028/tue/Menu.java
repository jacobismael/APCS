public class Menu {
	public String selectMenu1(int x) {
		if(x == 1) {
			return "A";
		} else if(x == 2) {
			return "B";
		} else if(x == 3) {
			return "C";
		} else {
			return "not valid";
		}
	}
	
	public String selectMenu2(int x) {
		String result;
		switch(x) {
			case 1:
				result = "X";
				break;
			case 2:
				result = "Y";
				break;
			case 3:
				result = "Z";
				break;
			default:
				result =  "not valid";
		}
		
		return result;
	}
}