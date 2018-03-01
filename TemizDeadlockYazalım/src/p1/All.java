package p1;

public class All {
	public static void main(String[] args) {
		Obje1 o1 = new Obje1();
		Obje2 o2 = new Obje2();
		MyThread1 t1 = new MyThread1(o1, o2);
		MyThread2 t2 = new MyThread2(o1, o2);

	}


private static class MyThread1 implements Runnable {
	Thread t1;
	Obje1 oT1;
	Obje2 oT2;

	MyThread1(Obje1 o1, Obje2 o2) {
		oT1 = o1;
		oT2 = o2;
		t1 = new Thread(this);
		t1.start();
	}

	public void run() {
		synchronized (oT1) {
			System.out.println(oT1.a);
			oT1.setA();
		}
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (oT2) {
			oT2.setA();
			System.out.println(oT1.a);
			System.out.println(oT2.a);
		}
	}
}

private static class MyThread2 implements Runnable {
	Thread t2;
	Obje1 oT1;
	Obje2 oT2;

	MyThread2(Obje1 o1, Obje2 o2) {
		oT1 = o1;
		oT2 = o2;
		t2 = new Thread(this);
		t2.start();
	}

	public void run() {
		synchronized (oT2) {
			System.out.println(oT2.a);
			oT2.setA();
		}
		try {
			t2.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (oT1) {
			oT1.setA();
			System.out.println(oT1.a);
			System.out.println(oT2.a);
		}
	}
}

private static class Obje1 {
	public int a = 0;

	public  void setA() {
		a++;
	}

	Obje1() {

	}
}

private static class Obje2 {
	public int a = 0;

	public  void setA() {
		a++;
	}

	Obje2() {

	}
}}