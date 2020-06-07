import java.util.Scanner;
import java.util.Random;
import java.util.Math;

public class TriviaLab {
	public static void main(String[] args) {
		System.out.println("IMPORTANT: enter all answers in one-word, lowercase strings or as an integer unless told otherwise.");
		System.out.println();
    Scanner input = new Scanner(System.in);
    System.out.print("Math or Geometry(geo/math):: ");
    String answer = input.next();

    if(answer.equals("geo")) {
        System.out.println("__________Geography__________");
      int score = 0;
      
      System.out.println("Question 1: What is el capital of Spain?");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("madrid")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("No");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 2: What is el capital of France?");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("paris")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("No");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 3: What IS el capital of the Soviet Union");
      System.out.print("Answer:: ");
      answer = input.next();

      if (answer.equals("moscow")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("No");
      }
      
      System.out.println();
      
      System.out.println("Question 4: What is el capital of Syria?");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("damascus")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("no");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 5: What is el capital of el Peoples Republic of China?");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("beijing")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("no");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 6: Does Australia exist?(y/n)");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("no")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("no, bruh australia doesn\'t exist");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 7: What is el capital of canada");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("ottawa")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("no");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 8: what continent is Japan in?");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("asia")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("no");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 9: what is el capital of belgium?");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("brussels")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("no");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      System.out.println("Question 10: what is el capital of romania?");
      System.out.print("Answer:: ");
      answer = input.next();
      
      if (answer.equals("bucharest")) {
        System.out.println("GG m8");
        score++;
        System.out.println("Score = " + score);
      } else {
        System.out.println("no");
        System.out.println("Score = " + score);
      }
      
      System.out.println();
      
      if (score == 10) {
        System.out.println("GG m8 you got all of them 10 out of 10 right");
      } else {
        System.out.println("You got " + score + " out of 10");
        
      }
      	System.out.println();
		    System.out.println();
		    System.out.println();
    } else if(answer.equals("math")) {
		    System.out.println("__________Math__________");
			double rand = Math.random();
			double answer2 = rand * 100;
			double roundedanswer1 = Math.round(answer2 * 100.0) / 100.0;
			int roundedanswer = (int)roundedanswer1;
			System.out.println();

			System.out.println("Question 1: area of a square:");
			length = roundedanswer
			int correct = Math.pow(length, 2);
			System.out.println("Length is " + length);
			if (answer == correct) {
				score++;
			}
			
			
			
    } else {
      System.out.println("Sorry, program couldn\'t understand that.");
    }
	}
}