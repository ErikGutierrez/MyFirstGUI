import javax.swing.JFrame;


public class GraphicalRepresentation 
{
	public static void main(String[] args)
	{
		JFrame mainFrame = new JFrame();
		
		mainFrame.setSize(800, 800); //(sizex, sizey)
		
		mainFrame.setTitle("My First GUI"); //Title seen at the top of the window
		
		mainFrame.setVisible(true);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Stops the window from running in the background after it was closed
		
		
		
		Vector3D v1 = new Vector3D(100, 1000, 10);
		Vector3D v2 = new Vector3D(2000, 200, 100);
		Vector3D v3 = new Vector3D(500, 500, 500);
		
		Vector3D[] List = { v1, v2, v3 };
		
		MyComponent words = new MyComponent(List);
		
		mainFrame.add(words);
	}
}
