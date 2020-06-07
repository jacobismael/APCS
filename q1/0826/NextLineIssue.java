import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class NextLineIssue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         
        System.out.print("Enter an integer :: ");
        int num = keyboard.nextInt();
        System.out.print("Enter a sentence :: ");
		keyboard.nextLine(); // clear whitespace from previous input
        String sentence = keyboard.nextLine();
        System.out.println(sentence);
		String input = JOptionPane.showInputDialog("Enter number one :: ");
		int one = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Number One :: " + one);
        //What is the problem when running this code?
		// It doesn't ask for an input for the string
    }
}