class HotelReservation {

    static String reservationId;
    static String guestName;
    static String email;
    static long phone;
    static String checkInDate;
    static String checkOutDate;
    static String roomType;
    static double totalAmount;

    public static boolean createReservationDetails(String resId, String guest, String emailId, long phoneNumber,
             String checkIn, String checkOut, String room, double amount) {
				
		boolean isHotelReservationDone=false;
	
		if(resId!=null){			
			reservationId = resId;
		}
		if(guest!=null){
			guestName = guest;
        }
		else{
			System.out.println("Please Provide Guest Name:");
		}
		if(emailId!=null){
			email = emailId;
        }
		else{
			System.out.println("Check your Email Id");
		}
		if(phoneNumber!=0){
			phone = phoneNumber;
        }
		else{
			System.out.println("Please provide Phone Number");
		}
		if(checkIn!=null){
			checkInDate = checkIn;
        }
		else{
			System.out.println("please Enter Check In");
		}
		if(checkOut!=null){
			checkOutDate = checkOut;
        }
		else{
			System.out.println("Please Enter Check Out date");
		}
		if(room!=null){
			roomType = room;
        }
		else{
			System.out.println("Please Select Room Type");
		}
		if(amount!=0.0){
			totalAmount = amount;
		}
		
		
		return isHotelReservationDone;
    }

    public static void getReservationDetails() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Check-In Date: " + checkInDate);
        System.out.println("Check-Out Date: " + checkOutDate);
        System.out.println("Room Type: " + roomType);
        System.out.println("Total Amount: " + totalAmount);
    }

}