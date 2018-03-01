package p1;

public class Test {

	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(2);
		
		swap1(c1,c2);
		System.out.println(" after swap1 c1: " + c1.radius + "  c2: " + c2.radius);
		swap2(c1,c2);
		System.out.println(" after swap2 c1: " + c1.radius + "  c2: " + c2.radius);
		
	}
	
	public static void swap1(Circle x, Circle y)
	{
		Circle temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println(temp.radius + " " + y.radius + " " + x.radius);
	}
	
	public static void swap2(Circle x, Circle y)
	{
		double temp;
		temp=x.radius;
		x.radius=y.radius;
		y.radius=temp;
	}

}
