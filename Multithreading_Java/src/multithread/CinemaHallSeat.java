package multithread;

public class CinemaHallSeat {
	
	int Total_seat = 10;
	
	//synchronized
	 void HallSeat(int seats) { // 7
		
		
		/*
		 
		 synchronized(this)
		 {
		 
		 
		 
		 
		 
		 
		 }
		 
		 */
		    // 10  >=  7
		    // 3   >= 6
		 
		 
		 synchronized(this)
		 {
		 
		 
		 
				if(Total_seat>=seats)
				{
					System.out.println("Seats are booked successfully");//Done
					Total_seat = Total_seat - seats; //10 - 7 = 3
					System.out.println("Seats available :"+Total_seat); //3
				}
				else {
					
					System.out.println("Seats can not be booked");
					System.out.println("Seats left:"+Total_seat); // 3
				}
		 
		 
		 }
		 

		
		
	}
	

}
