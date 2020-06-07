import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
 
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
 
public class FormulasGraphics extends JPanel implements ActionListener {
     
    private JTextField radiusInput;
	private JButton runButton;
	private Color black;
	private double areaCircle;
	private Color green = new Color(7,112,23);
	private Color brown = new Color(48, 29, 2);
	private Color white = new Color(255,255,255);
	private Font font = new Font("Arial", Font.PLAIN, 18);
	
	public FormulasGraphics() {
		setLayout(null); // not using a layout
		
		areaCircle = 0;
		
		black = new Color(0,0,0);
		
		runButton = new JButton("Run");
		runButton.setBounds(255,300,200,30);
		add(runButton);
		runButton.addActionListener(this);
		
		radiusInput = new JTextField();
		radiusInput.setBounds(50,300,200,30); // x and y location, then width and height
		add(radiusInput);
		
		setFocusable(true);
	}
 
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(800,600);
    }
     
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
		g.setColor(brown);
		g.fillRect(0,0,800,600);
		g.setColor(green);
		g.fillRect(20,20,760,560);
		
		g.setColor(white);
		g.setFont(font);
		g.drawString("Area of a Circle",25,25); // text, x and y location
        g.drawString("Enter double radius:: ",25, 35); // string, x and y location
		
		g.drawString(areaCircle+"",,30);
		// g.fillOval(100, 100,radius,radius);
    }
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == runButton) {
			//get the data from the textfield
			String radiusText = radiusInput.getText();
			double radius = Double.parseDouble(radiusText);
			
			//calculate the area of a cirlce
			areaCircle = 3.14 * Math.pow(radius,2);
			System.out.println("Area: " + areaCircle);
			
			//display it
			repaint();
		}
	}
    
}