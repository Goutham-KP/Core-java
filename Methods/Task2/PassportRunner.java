class PassportRunner{

	
	public static void main(String[] passportApp){
		
		Passport.createPassport("PO",7,"Goutham Raj","Raj","03/02/2003","gouthamraj458@gmail.com",
			true,"gouthamraj458@gmail","Password@3","Password@3","What is Favorite Bike","Xpulse","3GYCK");
			
		Passport.getPassportDetails();
	}
}