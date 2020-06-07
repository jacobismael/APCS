import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;



public class Screen extends JPanel {
	
  private int planetX = 0;

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

    //background
    g.setColor(Color.BLACK);
    g.fillRect(0,0,800,600);


    //sun 
    g.setColor(Color.YELLOW);
    g.fillOval(350,250,100,100);

    //planet
    g.setColor(Color.BLUE);
    g.fillOval(planetX,275,50,50);
    
    

    
	}

  public void animate(){
    while(true){

      planetX++;

      try{
        Thread.sleep(50);//milliseconds
      } catch (InterruptedException ex){
        Thread.currentThread().interrupt();
      }
      
      //redraw the screen
      repaint();
    }
		

  }
  

}


