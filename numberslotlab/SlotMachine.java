import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class SlotMachine {
  private int num1;
  private int num2;
  private int num3;
  private int winnings;
  private int balance;
  private int bet;
  private int round;
  private Color black, red, yellow;
  private String errorMessage, winMessage;

  public SlotMachine() {
    num1 = 0;
    num2 = 0;
    num3 = 0;
    balance = 100;
    bet = 1;
    round = 1;
    red = new Color(255, 0, 0);
    black = new Color(0,0,0);
    yellow = new Color(255, 255, 0);
    errorMessage = "";
    winMessage = "";
  }

  public void drawMe(Graphics g) {
    g.setFont(new Font("Source Code Pro", Font.PLAIN, 50));
    g.setColor(black);
    g.drawString(num1+"", 325, 275);
    g.drawString(num2+"", 360, 275);
    g.drawString(num3+"", 395, 275);
    g.drawString("Balance: "+balance+"$", 15, 60);
    g.drawString("Winnings: "+winnings+"$", 15, 130);
    g.setColor(yellow);
    g.drawString(winMessage+"", 400, 130);
    g.setColor(red);
    g.setFont(new Font("Arial", Font.PLAIN, 30));
    g.drawString(errorMessage+"", 250, 400);
  }

  public void play(int b) {
    bet = b;
    if(balance > 0 && balance >= bet && balance - bet >= 0) {
      balance-=bet;
      num1 = (int)(Math.random() * 9+1);
      num2 = (int)(Math.random() * 9+1);
      num3 = (int)(Math.random() * 9+1);
      System.out.print("(Round " + round + ") bet: " + bet);
      if(num1 == 7 && num2 == 7 && num3 == 7) {
        winMessage = "Jackpot!";
        System.out.println(": Jackpot!");
        balance+= bet * 100;
        winnings = bet * 100;
      } else if(num1 == num2 && num1 == num3) {
        winMessage = "Lucky!";
        System.out.println(": Lucky!");
        balance+= bet * 5;
        winnings = bet * 5;
      } else if(num1 == num2 || num2 == num3 || num1 == num3) {
        winMessage = "Winner!";
        System.out.println(": Winner!");
        balance+= bet * 2;
        winnings = bet * 2;
      } else {
        winMessage = "";
        winnings = 0;
        System.out.println(": -- ");
      }
      round++;
    } else {
      errorMessage = "Error: You don\'t have enough balance";
    }
  }

  public int betReset() {
    return 1;
  }
}
