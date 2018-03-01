package p1;
public class Alll {
	   public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String args[]) {
		   ThreadDemo1 d1 = new ThreadDemo1();
		   ThreadDemo2 d2 = new ThreadDemo2();   
	   }
	   
	   private static class ThreadDemo1 implements Runnable {
		//  Thread T1;
		   ThreadDemo1()
		   {
			   Thread  T1 = new Thread(this);
			   T1.start();
		   }
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 1: Holding lock 1...");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 1: Holding lock 1 & 2...");
	            }
	         }
	      }
	   }	   
	   private static class ThreadDemo2 implements Runnable {
		 // Thread T2;
		   ThreadDemo2()
		   {
			   Thread  T2 = new Thread(this);
			   T2.start();
		   }
	      public void run() {
	         synchronized (Lock2) {
	            System.out.println("Thread 2: Holding lock 2...");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 1...");
	            
	            synchronized (Lock1) {
	               System.out.println("Thread 2: Holding lock 1 & 2...");
	            }
	         }
	      }
	   } 
	}