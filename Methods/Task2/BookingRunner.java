class BookingRunner{

	 public static void main(String[] args) {
	 
        Booking.createBookingDetails("B123456", "Bhuvan", "Bhuvan@gmail.com", 9876543210l,
                "2024-08-15", "Goa", "Confirmed", 1500.75);
       Booking.getBookingDetails();
    }
}