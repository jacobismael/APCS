public class Runner {
	public static void main(String[] args) {
		Exam2 e1 = new Exam2();
		
		e1.printCir();
		e1.printVolCone(20);
		
		Exam2 e2 = new Exam2(10);
		
		e2.printCir();
		e2.printVolCone(5);
	}
}