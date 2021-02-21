package multithread;

public class Sleep_method extends Thread{
	
	
	public void run() {
		
		for(int i = 1 ; i <= 5 ; i++) {
			
			try {
				
				Thread.sleep(1000);
				System.out.println("child thread : "+i);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			 
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     for(int i = 1 ; i <= 5 ; i++) {
			
			try {
				
				Thread.sleep(1000);
				System.out.println("main thread : "+i);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			 
		}
		
		Sleep_method thread = new Sleep_method();
		
		thread.start();
	}

}
