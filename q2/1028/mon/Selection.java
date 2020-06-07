public class Selection {
	public String zipCode1(int code) {
		if(code == 94040) {
			return "Mountain View";
		} else if(code == 94115) {
			return "San Francisco";
		} else if(code == 95051) {
			return "Santa Clara";
		} else {
			return "Not Valid";
		}
	}
	
	public String zipCode2(int code) {
		String city;
		switch(code) {
			case 95129:
				city = "San Jose";
				break;
			case 94607:
				city = "Oakland";
				break;
			case 95035:
				city = "Milpitas";
				break;
			default:
				city = "Not Valid";
		}
		
		return city;
	}
	
	public String zipCode3(int code) {
		if(code == 94301) {
			return "Palo Alto";
		}
		if(code == 94086) {
			return "Sunnyvale";
		}
		if(code == 95037) {
			return "Morgan Hill";
		}
		
		return "Not Valid";
	}
}