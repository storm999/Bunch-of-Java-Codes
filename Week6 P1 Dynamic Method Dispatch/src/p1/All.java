package p1;

public class All {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C(); //
		
		A r; // obtain a reference of type A
		r = a; // r refers to an A object
		r.callme(); // calls A's version of call me
		r = b; // r refers to a B object
		r.callme(); // calls B's version of call me
		r = c; // r refers to a C object
		r.callme(); // calls C's version of call me } 
	}

}



	
	class A 
	{ 
		void callme() 
		{ 
			System.out.println("Inside A's callme method");
		} 
	}
	
	class B extends A 
	{
		void callme() 
		{ 
			System.out.println("Inside B's callme method"); 
		} 
	}
	
	class C extends A 
	{
		void callme()
		{ 
			System.out.println("Inside C's callme method"); 
		} 
	}
