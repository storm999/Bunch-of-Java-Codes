package p1;

public class Main {
	public static void main(String args[]) {
		Caller c1 = new Caller("am");
		Caller c2 = new Caller("amcýk");
		Caller c3 = new Caller("yarak");

		Thread t1 = new Thread(c1);
		t1.start();
		Thread t2 = new Thread(c2);
		t2.start();
		Thread t3 = new Thread(c3);
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} 
		catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

class Caller implements Runnable{
	String msg;
	//Thread t;
	
	public Caller (String s) {
		Thread t = new Thread(this);
		t.start();
		msg = s;	
	}

	synchronized void call(String msg) {
		System.out.print("[");
		System.out.print("(");
		System.out.print(msg);
		System.out.print(")");
		System.out.println("]");
	}

	public void run() {
		call(msg);
	}
}