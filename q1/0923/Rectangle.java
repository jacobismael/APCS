public class Rectangle {
	private int length, width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(int x, int y) {
		length = x;
		width = y;
	}
	
	public void printArea() {
		int area = length * width;
		System.out.println("The area " + area);
	}
}