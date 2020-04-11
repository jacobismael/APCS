import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Screen extends JPanel implements MouseListener, ActionListener, MouseMotionListener {
	
	private Square[][] grid;
	private int row, col;
	private int r, g, b;
	private JButton clearButton;
	private JButton eraseButton;
	private JButton gridButton;
	private JButton saveButton;
	private JButton fillButton;
	private boolean erasing;
	private boolean gridBool;

	private int height, width;

	private int pixels, pixelsize;

	private Square[] colors;

	public Screen() {

		pixels = 64;

		pixelsize = 10;

		height = 110;
		width = 186;

		this.grid = new Square[height][width];

		int size = 60;

		this.r = 0;
		this.g = 0;
		this.b = 0;

		colors = new Square[] {new Square(size, 255, 0, 0), new Square(size, 0, 255, 0), new Square(size, 0, 0, 255), new Square(size, 255, 255, 0), new Square(size, 0, 255, 255), new Square(size, 255, 0, 255), new Square(size, 255, 127, 0), new Square(size, 0, 0, 0), new Square(size, 255, 255, 255)};
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(0, height*10, 160, 60);
		clearButton.addActionListener(this);
		add(clearButton);

		eraseButton = new JButton("Erase");
		eraseButton.setBounds(160, height*10, 160, 60);
		eraseButton.addActionListener(this);
		add( eraseButton );

		gridButton = new JButton("Toggle Grid");
		gridButton.setBounds(320, height*10, 160, 60);
		gridButton.addActionListener(this);
		add( gridButton );

		saveButton = new JButton("Save");
		saveButton.setBounds(480, height*10, 160, 60);
		saveButton.addActionListener(this);
		add( saveButton );

		fillButton = new JButton("Fill");
		fillButton.setBounds(640, height*10, 160, 60);
		fillButton.addActionListener(this);
		add( fillButton  );
		
		erasing = false;
		gridBool = false; 



		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = new Square(pixelsize);
			}
		}

		addMouseListener(this);
		addMouseMotionListener(this);
		setLayout(null);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(2560, 1600);

	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(new Color(23, 25, 28));
		g.fillRect(0, 0, 2560, 1600);

		int x = 0;
		int y = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j].drawMe(g, x, y, gridBool);
				x+=grid[0][0].getSize();
			}
			x = 0;
			y+= grid[0][0].getSize();
		}

		x = pixelsize * width;
		y = 0;

		for (int i = 0; i < colors.length; i++) {
			colors[i].drawMe(g, x, y, false);
			y += colors[0].getSize();
		}

		if(erasing) {
			g.setColor(Color.black);
			g.drawString("Erasing", 290, 600);
		}

		new Square(60, this.r, this.g, this.b).drawMe(g, x, 1110 - grid[0][0].getSize(), false);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearButton) {
			erasing = false;
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					grid[i][j].setColor(255, 255, 255);
				}
			}
		} else if(e.getSource() == eraseButton) {
			erasing = !erasing;
		} else if(e.getSource() == gridButton) {
			erasing = false;
			gridBool = !gridBool;
		} else if(e.getSource() == saveButton) {
			erasing = false;
			writeImage(((int)(Math.random() * 10000)));
		} else if(e.getSource() == fillButton) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
					grid[i][j].setColor(r, g, b);
				}
			}
		}
		repaint();
	}

	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		col = (int)(x / grid[0][0].getSize());
		row = (int)(y / grid[0][0].getSize());

		if(col < width && row < height && col >= 0 && row >= 0) {
			if(erasing) {
				grid[row][col].setColor(255, 255, 255);
			} else {
				grid[row][col].setColor(r, g, b);
			}
		}

		// if(x > pixels * grid[0][0].getSize() && x < pixels * grid[0][0].getSize() + pixels * grid[0][0].getSize()) {
		// 	if(y <= colors.length * colors[0].getSize() && y >= 0) {
		// 		erasing = false;
		// 		int colorCol = (int)(y / colors[0].getSize());
		// 		this.r = colors[colorCol].getR();
		// 		this.g = colors[colorCol].getG();
		// 		this.b = colors[colorCol].getB();
		// 	}
		// }
		
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		col = (int)(x / grid[0][0].getSize());
		row = (int)(y / grid[0][0].getSize());

		if(col < 184 && row < 100 && col >= 0 && row >= 0) {

			if(erasing) {
				grid[row][col].setColor(255, 255, 255);
			} else {
				grid[row][col].setColor(r, g, b);
			}
		}

		if(x > width * grid[0][0].getSize() && x < pixels * grid[0][0].getSize() + width * grid[0][0].getSize()) {
			if(y <= colors.length * colors[0].getSize() && y >= 0) {
				erasing = false;
				int colorCol = (int)(y / colors[0].getSize());
				this.r = colors[colorCol].getR();
				this.g = colors[colorCol].getG();
				this.b = colors[colorCol].getB();
			}
		}

		repaint();
    }

	public void mouseReleased(MouseEvent e) {}
 
    public void mouseEntered(MouseEvent e) {}
 
    public void mouseExited(MouseEvent e) {}
 
	public void mouseClicked(MouseEvent e) {}
	


	public void writeImage(int Name) {
		
		BufferedImage myImage = (BufferedImage)(createImage(width, height));

		Graphics gImage = myImage.createGraphics();



		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				gImage.setColor(new Color( grid[j][i].getR(), grid[j][i].getG(), grid[j][i].getB()));
				gImage.fillRect(i*pixelsize, j*pixelsize, pixelsize, pixelsize);
			}
		}
	
		File ImageFile = new File("saved/" + Name + ".png");
		try {
			ImageIO.write(myImage, "png", ImageFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
