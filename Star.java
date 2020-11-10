
public class Star 
{
	//Instance Variables
	private String name;
	private double xCoOrdinate;
	private double yCoOrdinate;
	private String description;
	
	//Constructors
	public Star()
	{
		name = " ";
		xCoOrdinate = 0.0;
		yCoOrdinate = 0.0;
		description = " ";
	}
	
	public Star(String name, double xCoOrdinate, double yCoOrdinate, String description)
	{
		this.name = name;
		this.xCoOrdinate = xCoOrdinate;
		this.yCoOrdinate = yCoOrdinate;
		this.description = description;
	}
	
	
	//Getters/Setters
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getxCoOrdinate() 
	{
		return xCoOrdinate;
	}

	public void setxCoOrdinate(double xCoOrdinate) 
	{
		this.xCoOrdinate = xCoOrdinate;
	}

	public double getyCoOrdinate() 
	{
		return yCoOrdinate;
	}

	public void setyCoOrdinate(double yCoOrdinate) 
	{
		this.yCoOrdinate = yCoOrdinate;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	//ToString
	public String toString()
	{
		return ("Name: " + name + ", X Co-ordinate: " + xCoOrdinate + ", Y Co-ordinate: " + yCoOrdinate + ", Description: " + description);
	}
	
	
	
	
	

}
