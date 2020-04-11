import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JPanel implements ActionListener {

    private SlotMachine machine;
    private JButton spinButton;
    private JButton bet10, bet5, bet2;
    private Color black;
    private int bet;

    public Screen() {
      setLayout(null);
      machine = new SlotMachine();
      black = new Color(0,0,0);
      bet = 1;

      bet10 = new JButton("Bet 10");
      bet10.setBounds(100, 315, 100, 30);
      add(bet10);
      bet10.addActionListener(this);

      bet5 = new JButton("Bet 5");
      bet5.setBounds(100, 355, 100, 30);
      add(bet5);
      bet5.addActionListener(this);

      bet2 = new JButton("Bet 2");
      bet2.setBounds(100, 395, 100, 30);
      add(bet2);
      bet2.addActionListener(this);

      spinButton = new JButton("SPIN");
      spinButton.setBounds(300, 500, 200, 60);
      add(spinButton);
      spinButton.addActionListener(this);

      setFocusable(true);
    }

    public Dimension getPreferredSize(){
        return new Dimension(800,600);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(black);
        g.drawRect(10, 10, 355, 130);
        g.setColor(black);
        g.drawRect(320, 225, 36, 60);
        g.drawRect(356, 225, 36, 60);
        g.drawRect(392, 225, 36, 60);
        machine.drawMe(g);
    }

    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == spinButton) {
        machine.play(bet);
        bet = machine.betReset();
      } else if(e.getSource() == bet10) {
        bet = 10;
        System.out.println("Bet "+bet);
      } else if(e.getSource() == bet5) {
        bet = 5;
        System.out.println("Bet "+bet);
      } else if(e.getSource() == bet2) {
        bet = 2;
        System.out.println("Bet "+bet);
      }

      repaint();
    }

   public void resetBet() {
     bet = 1;
   }

}
