package p1;
class HiLoPri {
	public static void main(String args[]) {
	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	clicker hi = new clicker(Thread.NORM_PRIORITY + 3);
	clicker lo = new clicker(Thread.NORM_PRIORITY - 1);
	clicker low = new clicker(Thread.NORM_PRIORITY - 2);
	clicker loww = new clicker(Thread.NORM_PRIORITY - 3);
	clicker lowww = new clicker(Thread.NORM_PRIORITY - 4);
	hi.start();
	lo.start();
	low.start();
	lowww.start();
	loww.start();
	try {
		Thread.sleep(1000);
	}
	catch (InterruptedException e) {
		System.out.println("Main thread interrupted.");
	}
	lo.stop();
	low.stop();
	loww.stop();
	lowww.stop();
	hi.stop();
	// Wait for child threads to terminate.
	try {
		hi.t.join();
		lo.t.join();
		low.t.join();
		loww.t.join();
		lowww.t.join();
	} 
	catch (InterruptedException e) {
		System.out.println("InterruptedException caught");
	}
		System.out.println("High-priority thread: " + hi.click);
		System.out.println("Lo-priority thread: " + lo.click);
		System.out.println("Low-priority thread: " + low.click);
		System.out.println("Loww thread: " + loww.click);
		System.out.println("Lowww-priority thread: " + lowww.click);
	}
}
//Demonstrate thread priorities.
class clicker implements Runnable {
	long click = 0;
	Thread t;
	private volatile boolean running = true;
	public clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}
	public void run() {
		while (running) {
			click++;
			System.out.println(t.getName() + ": " + click);
		}
	}
	public void stop() {
		running = false;
	}
	public void start() {
		t.start();
	}
}

