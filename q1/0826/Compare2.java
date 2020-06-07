import java.util.Scanner;
 
public class Compare2{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
         
        System.out.println("Enter in a number: ");
        int number = kb.nextInt();
        if( number == 9 ){
            System.out.println("The number is 9");
        }
         
        //It is recommended that you use .equals when comparing strings
        //as it is meant to compare the text between two strings.
        //This will work for older versions of Java.
        System.out.println("Enter in a word: ");
        String text = kb.next();
        if( text.equals("Hello") ){
            System.out.println("The text is Hello");
        }
         
        //1) What is the difference in the if-statement when you compare numbers and String?
			// the way you check if the answer is equal to the desired output
         
        //2) What happens if you try to compare a number with the following code? why?
        /*
        if( number = 99 ){
            System.out.println("The number is 99");
        }
        */
			// it will not work because it is not comparing numbers, its setting the variable to 99
         
        //3) What happens if you try to compare a number with the following code? why?
        /*
        if( number == 8 );{
            System.out.println("The number is 8");
        }
        */
			// it will not work because there is a random semicolon out of place next to the attribute
    }
}