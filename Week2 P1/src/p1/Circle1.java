package p1;

public class Circle1 {

	double radius = 1.0;
	Circle1(){
		
	}
	
	Circle1(double newRadius){
		radius = newRadius;
		
	}
	double getArea(){
		return radius * radius * Math.PI;
	}
	

}
