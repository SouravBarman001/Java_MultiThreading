package multithread;

public class SeatBookingApp extends Thread{
	
	static CinemaHallSeat seat;
	int quantity; // 7
	
	public void run() {
		
		seat.HallSeat(quantity); // 6
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		seat = new CinemaHallSeat();
		
		SeatBookingApp cusmtomer1 = new SeatBookingApp();
		cusmtomer1.quantity = 5;
		cusmtomer1.start();
		
		SeatBookingApp cusmtomer2 = new SeatBookingApp();
		cusmtomer2.quantity = 6;
		cusmtomer2.start();
	}

}
