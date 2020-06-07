public class Runner {
	public static void main(String[] args) {
		Quiz q1 = new Quiz(96, 95);
		Quiz q2 = new Quiz(90, 75);
		
		String gdg1 = q1.getGrade1();
		System.out.println(gdg1);
		
		String gdg1_2 = q1.getGrade2();
		System.out.println(gdg1_2);
		
		String gdg2 = q2.getGrade1();
		System.out.println(gdg2);
		
		String gdg2_2 = q2.getGrade2();
		System.out.println(gdg2_2);
		
		q1.countUpBy2(10);
		int ig1 = q1.getSummation(15);
		System.out.println(ig1);
	}
}