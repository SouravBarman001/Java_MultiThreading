package multithread;

public class SetName_GetName_isAlive extends Thread{
	
	public void run()
	{
		System.out.println("Child thread");
		
		Thread.currentThread().setName("MyChildThread");
		
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread_1 = Thread.currentThread(); // currentThread() is a static method so that we can call it direct.
		
		String thread_name = thread_1.getName();
		
		System.out.println("Thread Name is : "+thread_name); // Which is main thread
		
		// Now change the name of the main thread
		
		thread_1.setName("MyMainThread");
		
		System.out.println("Thread Name is : "+thread_1.getName()); // MyMainThread
		
		
		 
		SetName_GetName_isAlive thread = new SetName_GetName_isAlive();
		
		System.out.println("isAlive: "+Thread.currentThread().isAlive());
		
		thread.start();
		System.out.println("Child Thread isAlive: "+Thread.currentThread().isAlive());
		
		
		

	}

}