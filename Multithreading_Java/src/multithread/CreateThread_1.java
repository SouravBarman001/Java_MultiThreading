package multithread;

public class CreateThread_1 extends Thread{
	
public void run() {
    	 
    	 System.out.println(Thread.currentThread().getName());
     }
	
   

	public static void main(String[] args) {
		//It's main thread.
		
		CreateThread_1 t = new CreateThread_1();
		
		System.out.println(Thread.currentThread().getName());
		
		//We have to call start() method to run the thread.
		
		t.start();
		
		
	}
	
	
}
