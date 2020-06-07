import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input int menu item:: ");
		String result = menu.selectMenu1(kb.nextInt());
		System.out.println(result);
		
		System.out.print("Input int menu item:: ");
		result = menu.selectMenu2(kb.nextInt());
		System.out.println(result);
	}
}