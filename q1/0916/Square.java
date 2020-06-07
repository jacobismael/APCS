public class Square {
	private int side = 7;
	
	public void changeSide() {
		side = 5;
	}
	public void printArea() {
		int area = side * side;
		System.out.println("area is " + area);
	}
}