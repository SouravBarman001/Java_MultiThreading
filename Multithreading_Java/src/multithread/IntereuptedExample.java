package multithread;

public class IntereuptedExample extends Thread{
	
	public void run() {
		
	System.out.println(Thread.currentThread().isInterrupted()); 
		
		 try{
			
			 for(int i = 1 ; i <= 5 ; i++){
				
				Thread.sleep(1000);
				System.out.println(i);
			}
			
			
			 
		} catch(Exception e)
			{
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntereuptedExample t = new IntereuptedExample();
		t.start();
	//	t.interrupt();
		
	}

}
