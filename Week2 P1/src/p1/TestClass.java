package p1;

public class TestClass {

	
	public static void main(String[] args) {
		Circle1 circlea = new Circle1();
		System.out.println("The area of the circle of radius "
		+ circlea.radius + " is " + circlea.getArea() );
		Circle1 circleb = new Circle1(25);
		System.out.println("The area of the circle of radius "
		+ circleb.radius + " is " + circleb.getArea());
		Circle1 circlec = new Circle1(125);
		System.out.println("The area of the circle of radius "
		+ circlec.radius + " is " + circlec.getArea());
		circleb.radius = 100;
		System.out.println("The area of the circle of radius "
		+ circleb.radius + " is " + circleb.getArea() ); 

	}

}
