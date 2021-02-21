package multithread;

public class DaemonThread extends Thread{
	
 public void run() {
	 
	 if(Thread.currentThread().isDaemon()) {
		 
		 System.out.println("Daemon thread");
	 }
	 else {
		 System.out.println("Not a daemon thread");
	 }
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName()); // It's main thread
		
		// 1. Daemon thread in java is a service provider thread that provides services to the user thread.
		// 2. It has 2 methods (a) setDaemon(Boolean) (b) public Boolean isDaemon() .
		// 3. It's life depends on main thread.
		// 4. We can't call setDaemon() method after calling start() method.
		// 5. Daemon thread is able to inherite properties from "main thread".
		// 6.the thread which is create under the daemon thread is also a daemon thread.
		// 7.JVM does not depends on daemon thread.
		
		DaemonThread thread = new DaemonThread();
		
		thread.setDaemon(true);
		thread.setDaemon(true);
		thread.start();
		
 		
	}

}
