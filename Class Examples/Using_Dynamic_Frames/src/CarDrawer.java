import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class CarDrawer 
{
	// Instance Variables
	private int xPos;
	private int yPos;
	
	// Constructor
	public CarDrawer(int x, int y)
	{
		super();
		xPos = x;
		yPos = y;
	}
	
	// Getters
	public int getxPos() {
		return xPos;
	}
	public int getyPos() {
		return yPos;
	}
	
	// Setters
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	// Instance Methods
	public void translate(int dX, int dY)
	{
		xPos += dX;
		yPos += dY;
	}
	public void draw(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		// Creating the 'parts' that compose the car drawing //
		Line2D.Double rearWindow = new Line2D.Double(xPos+10, yPos+10, xPos+20, yPos);
		Line2D.Double frontWindow = new Line2D.Double(xPos+40, yPos, xPos+50, yPos+10);
		Line2D.Double roof = new Line2D.Double(xPos+20, yPos, xPos+40, yPos+0);
		Rectangle body = new Rectangle(xPos, yPos+10, 60, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xPos+10, yPos+20, 10, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xPos+40, yPos+20, 10, 10);
		
		// Now we draw the different drawable components we created above //
		g2.draw(rearTire);
		g2.draw(frontTire);
		g2.draw(rearWindow);
		g2.draw(frontWindow);
		g2.draw(body);
		g2.draw(roof);
	}
	
	
}
