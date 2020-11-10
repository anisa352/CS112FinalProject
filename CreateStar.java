import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateStar 
{
	//Instance Variables
	private ArrayList<Star> stars;
	
	//Constructor
	public CreateStar(String fileName)
	{
	  stars = new ArrayList<Star>(10);
	  try
	  {
		Scanner inputStream = new Scanner (new FileInputStream (fileName) );
	    
	    while(inputStream.hasNextLine())
	    {
	    	String[] parts = inputStream.nextLine().split("\\|");
	    	if(parts.length == 4)
	    	{
	        stars.add(new Star(parts[0],Double.parseDouble(parts[1]),Double.parseDouble(parts[2]), parts[3]));
	    	}
	    }
	    inputStream.close();
	    
	  }
	
	  catch(IOException e)
	  {
		  System.out.println("Error reading from file");

	  }
	  for(int i = 0; i< stars.size();i++ )
	  {
		  System.out.println(stars.get(i));
	  }
	}
	
	//Getter
	public ArrayList<Star> getStars()
	{
		return stars;
	}
}
