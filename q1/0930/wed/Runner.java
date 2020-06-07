public class Runner {
	public static void main(String[] args) {
		One obj1 = new One();
		One obj2 = new One(5, 2);
		obj1.printArea();
		obj2.printArea();
		obj2.printArea(6, 2);
	}
}