package p1;

public class Main 
{
	public static void main(String[] args) 
	{
	        Circle aCircle;  // creating reference
	        aCircle = new Circle(); // creating object
	        aCircle.x = 10;  // assigning value to data field
	      //  aCircle.y = 20;
	       // aCircle.r = 5;
	       // double area = aCircle.area(); // invoking method
	       // double circumf = aCircle.circumference();
	      //  System.out.println("Radius="+aCircle.r+" Area="+area);
	      //  System.out.println("Radius="+aCircle.r+" Circumference ="+circumf);
	        
	        new Main().a(aCircle);
	        System.out.println(aCircle.x);
	}
	
	public void a(Circle c)
	{
		c.x=999;
	}
}


