import javax.swing.JFrame;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JFrame fr = new JFrame("My Scenery");
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("1: night background");
		System.out.println("2: day background");
		System.out.println("--------------------------");
		System.out.print("Input int option:: ");
		int bgChoice = kb.nextInt();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("1: clouds");
		System.out.println("2: no clouds");
		System.out.println("--------------------------");
		System.out.print("Input int option:: ");
		int cdChoice = kb.nextInt();
		
		Scenery sc = new Scenery(bgChoice, cdChoice);

		fr.add(sc);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.pack();
		fr.setVisible(true);
	}
}