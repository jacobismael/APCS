import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Game game = new Game();

        int sum = 0;
        int num;

        while(true) {
            System.out.print("Do you want a number(y/n)?  ");
            char input = kb.next().charAt(0);
            if(input == 'y') {
                num = game.getNumber();
                System.out.println(num);
                System.out.println();
                sum+=num;
                System.out.println("Sum: " + sum);
                if(sum > 21) {
                    break;
                }
            } else if(input == 'n'){
                break;
            } else {
                System.out.println("Wut?");
            }
        }
        if(sum > 21) {
            System.out.println("You Lose");
        } else if(sum == 21) {
            System.out.println("You Win");
        } else if (sum > 16 && sum < 20) {
            System.out.println("You Win");
        } else if(sum < 16) {
            System.out.println("You Win");
        }
    }
}