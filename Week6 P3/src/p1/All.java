package p1;

public class All {
	public static void main(String[] args) {
		A a = new A();
		a.p(1);
		a.p(10.0);
	}
}

class B {
	public void p(double i) {
		System.out.println(i * 2);
	}
}
	
class A extends B {
	// This method the method in B
	public void p(double i) {
	System.out.println(i);
	}
}