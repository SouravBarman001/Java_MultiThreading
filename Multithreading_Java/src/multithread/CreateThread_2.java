package multithread;

public class CreateThread_2 implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateThread_2 thread = new CreateThread_2();
		
		System.out.println(Thread.currentThread().getName());
		
		Thread thread_1 = new Thread(thread);
		
		thread_1.start();
		

	}

}
