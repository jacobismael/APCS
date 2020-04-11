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
     
	private JTextField baseInput;
	private JTextField heightInput;
	private JButton runButton;
	private Color black;
	private double areaTriangle;
	private Color green = new Color(7,112,23);
	private Color brown = new Color(48, 29, 2);
	private Color white = new Color(255,255,255);
	
	
	public FormulasGraphics() {
		setLayout(null); // not using a layout
		
		areaTriangle = 0;
		
		black = new Color(0,0,0);
		
		baseInput = new JTextField();
		baseInput.setBounds(50,300,200,30); // x and y location, then width and height
		add(baseInput);

		heightInput = new JTextField();
		heightInput.setBounds(50,350,200,30); // x and y location, then width and height
		add(heightInput);

		runButton = new JButton("Run");
		runButton.setBounds(50,385,200,30);
		add(runButton);
		runButton.addActionListener(this);
		
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
		g.drawString("Area of a Triangle",50,200); // text, x and y location
		g.drawString("Enter double base:: ",50,298); // string, x and y location
		g.drawString("Enter double height:: ",50, 345);
		
		g.drawString(areaTriangle+"",50,450);
		// g.fillOval(100, 100,radius,radius);
    }
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == runButton) {
			//get the data from the textfield
			String baseText = baseInput.getText();
			double base = Double.parseDouble(baseText);
			String heightText = heightInput.getText();
			double height = Double.parseDouble(heightText);
			
			//calculate the area of a cirlce
			areaTriangle = base * height * 0.5;
			System.out.println("Area: " + areaTriangle);
			
			//display it
			repaint();
		}
	}
    
}