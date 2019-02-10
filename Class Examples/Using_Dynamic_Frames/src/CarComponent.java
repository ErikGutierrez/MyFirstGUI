import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;

public class CarComponent extends JComponent 
{
	// Instance Variables //
	private Random gen;
	private CarDrawer topLeftCar;
	private CarDrawer bottomLeftCar;
	
	private int x = 5;
	private int y = 7;
	private int xd = 1;
	private int yd = 1;
	private CarDrawer randomCar;
	
	
	// Constructor //
	public CarComponent()
	{
		gen = new Random();
		topLeftCar = new CarDrawer(0, 0);
		bottomLeftCar = new CarDrawer(this.getWidth()-60, this.getHeight()-30);
		
		//randomCar = new CarDrawer(gen.nextInt(this.getWidth()-60), gen.nextInt(this.getHeight()-30));
		
	}
	
	
	// Instance Variables //
	
	public boolean reachedRightEdge(CarDrawer c)
	{
		if (c.getxPos() + 60 >= this.getWidth())
			return true;
		else
			return false;
	}
	
	public boolean reachedLeftEdge(CarDrawer c)
	{
		if (c.getxPos() < 0)
			return true;
		else
			return false;
	}
	
	public boolean reachedTopEdge(CarDrawer c)
	{
		if (c.getyPos() < 0)
			return true;
		else
			return false;
	}
	
	public boolean reachedBottomEdge(CarDrawer c)
	{
		if (c.getyPos() >= this.getHeight() - 30)
			return true;
		else 
			return false;
	}
	public void paintComponent (Graphics g)
	{
		x = gen.nextInt(25);
		y = x;
		if (reachedRightEdge(topLeftCar) || reachedLeftEdge(topLeftCar))
		{
			xd *= -1;
			if (reachedLeftEdge(topLeftCar))
				topLeftCar.setxPos(0);
			if (reachedRightEdge(topLeftCar))
				topLeftCar.setxPos(this.getWidth() - 60);
		}
		if (reachedTopEdge(topLeftCar) || reachedBottomEdge(topLeftCar))
		{
			yd *= -1;
			if (reachedTopEdge(topLeftCar))
				topLeftCar.setyPos(0);
			if (reachedBottomEdge(topLeftCar))
				topLeftCar.setyPos(this.getHeight()-30);
		}
		topLeftCar.translate(x*xd, y*yd);
		
		randomCar = new CarDrawer(gen.nextInt(this.getWidth()-60), gen.nextInt(this.getHeight()-30));
		
		topLeftCar.draw(g);
		bottomLeftCar.draw(g);
		//randomCar.draw(g);
		

	}

}