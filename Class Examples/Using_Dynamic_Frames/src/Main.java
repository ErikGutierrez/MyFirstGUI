import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		JFrame mainFrame = new JFrame();
		
		mainFrame.setSize(800, 600);
		
		mainFrame.setTitle("My First GUI!!!");
		
		mainFrame.setVisible(true);
		
		CarComponent car = new CarComponent();
		
		mainFrame.add(car);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// "Refreshes" the screen so the objects that have been moved get repainted	//
		// 	in their new positions													//
		while(true)
		{
			mainFrame.repaint();
			
			Thread.sleep(50);
		}
		
		

	}

}