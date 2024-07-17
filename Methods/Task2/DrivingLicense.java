class DrivingLicense{
	
	
	static String name;
	static String birthDate;
	static String avatar;
	static boolean isVerified;
	static String govId;
      
	static boolean isDrivingLicenseCreated=false;
	public static boolean getDrivingLicense(String fullName,String dob,String gender,boolean isMajor,String panNumber){
	
		boolean isDrivingLicenseApplied=false;
		
		boolean isGivenNameValid = false;
		boolean isGivenDateofBirth= false;
        boolean isGivenPanNo = false;
		
		if(fullName!=null){
			name=fullName;
			isGivenNameValid=true;
		}
		else{
			System.out.println("Provide proper name");
		}
		if(dob!=null){
			birthDate=dob;
			isGivenDateofBirth=true;
		}
		else{
			System.out.println("Enter Proper date of birth");
		}
		if(gender!=null){
			avatar=gender;
		}
		else{
			System.out.println("please choose proper gender");
		}
		
		if(isMajor!=false){
			isVerified=isMajor;
		}
		else{
			System.out.println("You are under 18");
		}
		if(panNumber!=null){
			govId=panNumber;
			isGivenPanNo=true;
		}
		else{
			System.out.println("please enter the proper pan Number");
		}
		if ( isGivenNameValid && isGivenDateofBirth && isGivenPanNo){
			isDrivingLicenseCreated=true;
		}
		
		
		//name=fullName;
		//birthDate=dob;
		//avatar=gender;
		//isVerified=isMajor;
		//govId=panNumber;
		
		
		return isDrivingLicenseApplied;
	}
	
	
	public static void getDriverDetails(){
		if(isDrivingLicenseCreated){
			System.out.println("your Full NAme: "+name);
			System.out.println("Date of Birth: "+birthDate);
			System.out.println("Gender: "+avatar);
			System.out.println("Are you 18+ : "+isVerified);
			System.out.println("proivde your Government Id: "+govId);
		}
		else{
			System.out.println("Apply for Driving License");
		}
	}
}
	