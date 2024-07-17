class Booking {

    static String bookingId;
    static String customerName;
    static String email;
    static long phone;
    static String travelDate;
    static String travelDestination;
    static String bookingStatus;
    static double totalPrice;

    public static boolean createBookingDetails(String id, String name, String emailId, long phoneNumber,
             String date, String destination, String status, double price) {
		boolean isBookingDone=false;	 
		
		if(id!=null){
			bookingId=id;
		}
		
		if(name!=null){
			customerName=name;
		}
		
		else{
			System.out.println("Please Check your Name");
		}
		
		if(emailId!=null){
			email=emailId;
		}
		else{
			System.out.println("check email Id once");
		}
		
		if(phoneNumber!=0){
			phone=phoneNumber;
		}
		else{
			System.out.println("Provide proper Number");
		}
		if(date!=null){
			travelDate=date;
		}
		if(destination!=null){
			travelDestination=destination;
		}
		else{
			System.out.println("Please provide Destination Address");
		}
			
		bookingStatus = status;
        totalPrice = price;
		
		
        //bookingId = id;
        //customerName = name;
        //email = emailId;
        //phone = phoneNumber;
        //travelDate = date;
        //destination = destination;
        
	    return isBookingDone;
    }

    public static void getBookingDetails() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Destination: " + travelDestination);
        System.out.println("Booking Status: " + bookingStatus);
        System.out.println("Total Price: " + totalPrice);
    }

   
}