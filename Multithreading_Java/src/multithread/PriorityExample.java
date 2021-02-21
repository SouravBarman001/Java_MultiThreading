package multithread;

public class PriorityExample extends Thread{

	
	
	public void run() {
		
		System.out.println("Child Thread :"+Thread.currentThread().getPriority()); //5 change to 10
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Old Main Thread Priority :"+Thread.currentThread().getPriority()); // 5
		
		Thread.currentThread().setPriority(3);
		
		System.out.println("Updated Main Thread Priority :"+Thread.currentThread().getPriority()); // 3
		
		PriorityExample t = new PriorityExample();
		t.setPriority(9);
		t.start();
		
		
	}

}
