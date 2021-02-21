package multithread;

public class YieldExample extends Thread{
	
	public void run()
	{
		Thread.yield();
		
	for(int i = 1 ; i <= 5 ; i++) {
			
	System.out.println("child thread : "+i);
		
			 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		YieldExample t = new YieldExample();
		t.start();
		
	//	Thread.yield();
		
	for(int i = 1 ; i <= 5 ; i++) {
			
				System.out.println("Main thread : "+i);
 
		}
		
		
	}

}
