import java.awt.Dimension;
import javax.swing.JFrame;


public class Main 
{
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;

	public static void main(String[] args) 
	{
		CreateStar s = new CreateStar("stars.txt");
		
		JFrame frame = new JFrame("Ursa Major");
		frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new Drawing(s.getStars(), WIDTH, HEIGHT));
		frame.setVisible(true);
		

	}

}
