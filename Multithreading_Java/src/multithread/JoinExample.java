package multithread;


public class JoinExample extends Thread{
	
	static Thread mainthread;
	
	public void run()
	{
	
		try {
			mainthread.join();
			
				for(int i = 1 ; i <= 5 ; i++) {
					
			 Thread.sleep(1000);
	System.out.println("child thread : "+i);
		
			 
		}
	}
			
		 catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mainthread = new Thread();

		JoinExample thread = new JoinExample();
		thread.start();
		
		 try{
				
			 for(int i = 1 ; i <= 5 ; i++){
				
				Thread.sleep(1000);
				System.out.println("Main Thread"+i);
			}
			
			
			 
		} catch(Exception e)
			{
			System.out.println(e);
		}
		
	}

}
