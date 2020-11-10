import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Drawing extends JPanel
{
	//Instance Variables
	private ArrayList<Star> stars;
	private int width;
	private int height;
	
	//Constructor
	public Drawing(ArrayList<Star> stars, int width, int height)
	{
		this.stars = stars;
		this.width = width;
		this.height = height;
		
		setLayout(null);
		for(int i = 0; i<stars.size(); i++)
    	{   
    		final Star star = stars.get(i);
    		int x = (int)star.getxCoOrdinate()*(width/100);
    		int y = (int)star.getyCoOrdinate()*(height/100);
    		JButton button = new JButton(star.getName());
    		button.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent e) 
    			{
    		        JFrame frame = new JFrame(star.getName());
    				frame.setPreferredSize(new Dimension(600,400));
    				frame.setMinimumSize(new Dimension(600,400));
    				frame.setMaximumSize(new Dimension(600,400));
    				frame.setResizable(false);
    				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    				frame.setLocationRelativeTo(null);
    				frame.setVisible(true);
    				JTextArea area = new JTextArea(star.getDescription());
    				frame.add(area);
    				area.setEditable(false);
    				area.setLineWrap(true);
    				area.setFont(new Font("Arial",Font.PLAIN,22));
    				
    			}
    		});
    		add(button);
    		button.setBounds(x, y, 120, 30);
    		
    		
    	
    	}
	}
    public void paintComponent(Graphics g)
    {
    	
    	super.paintComponent(g);
    	setBackground(Color.BLACK);
    	g.setColor(Color.WHITE);
    
    	for(int i = 0; i<stars.size(); i++)
    	{   
    		final Star star = stars.get(i);
    		int x = (int)star.getxCoOrdinate()*(width/100);
    		int y = (int)star.getyCoOrdinate()*(height/100);
    		
    		
    	g.fillOval(x,y,10,10);
    	if(i > 0)
    	{
    		g.drawLine(x+5, y+5, (int)stars.get(i-1).getxCoOrdinate()*(width/100)+5, (int)stars.get(i-1).getyCoOrdinate()*(height/100)+5);
    	}
    	}
    }
}
