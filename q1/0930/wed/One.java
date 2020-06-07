public class One {
	// Instance Variable(s)
	private int length;
	private int width;
	
	// Constructor(s)
	public One (){
		length = 0;
		width = 0;
	}
	
	public One(int x, int y) {
		length = x;
		width = y;
	}
	
	// Method(s)
	public void printArea() {
		int area = length * width;
		System.out.println("Area is " + area);
	}
	
	public void printArea(int length, int width) {
		this.length = length;
		this.width = width;
		int area = length * width;
		System.out.println("Area of inputted is " + area);
	}
}