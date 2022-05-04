
public class CirclePart2 {

	private static final 
	double pi = 3.14;
	private double radius;
	 
	
	public CirclePart2(double r)
	{
		radius = r;
	}
	
	public void 
	setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public double area ()
	{
		double circleArea;
		circleArea = pi* radius * radius;
		return (circleArea);
	}
	
	public double getRadius() 
	{
		return (radius);
	}
	
	public double circumference()
	{
		double circumference; 
		circumference = pi * radius * 2;
		
		return (circumference);
	}
	
	public boolean equals (Object c)
	{
		CirclePart2 testObj = (CirclePart2)c;
		
		if
		
		(testObj.getRadius() == radius)
		{
			return (true);
		}
		else 
		{
			return(false);
			}
		}
		
		public String toString()
		{
			String circleString;
			circleString = "circle has radius" + radius;
			return (circleString);
		}
		
		public static void displayareaFormula()
		{
			System.out.println("the formula for the area of a circle is 2 * pi * radius");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

