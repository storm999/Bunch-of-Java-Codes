package p1;

class ThreadDemo 
{
	public static void main(String args[]) 
	{
		new NewThread(); // create a new thread
		try 
		{
			for(int i = 5; i > 0; i--) 
			{
				System.out.println("Main Thread: " + i);
				Thread.sleep(10);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}

class NewThread implements Runnable {
	Thread t;
	NewThread() 
	{
		t = new Thread(this, "Demo Thread"); 		// Create a new, second thread
		System.out.println("Child thread: " + t);
		t.start(); 									// Start the thread
	}
	
	public void run() 				// This is the entry point for the second thread.
	{
		try 
		{
			for(int i = 5; i > 0; i--) 
			{
				System.out.println("Child Thread: " + i);
				Thread.sleep(5);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}

}