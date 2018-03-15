import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;


/*
 * Create new class and change it's 'super class' to JComponent
 * This creates a new 'object type' so you can summon it in a different place.
 */

public class MyComponent extends JComponent
{
	private int count = 0;
	private Vector3D[] vectorList;
	
	public MyComponent(Vector3D[] vectors)
	{
		vectorList = vectors;
	}
	
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g; // el escribir una typo de variable entre (...) antes de una variable le 'ajusta' el tipo a esa variable
		
		for (Vector3D v : vectorList)
		{
			Line2D.Double nextLine = new Line2D.Double(0, 0, v.getX(), v.getY());
			g2.draw(nextLine);
		}
		
		
		count++;
		System.out.println("PainComponent has been called " + count + " times");
		g.drawString("Hellow World", 400, 400); //Creates a the specified string in the coordinates (400,400) in the window
	}
}
