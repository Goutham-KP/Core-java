class PgCet{
	
	static boolean isStudyinKarnataka;
	static long sslcNumber;
	static String name;
	static boolean isUgDone;
	static String pwd;
	static String capcha;
	
	static boolean isApplicationCompleted=false;
	public static boolean newUserRegistration(boolean isStudiedinKarnataka,long sslcRegistrationNumber,String fullName,boolean isUnderGraduationDone,String password,String captcha){
		
		boolean isUserRegisterd=false;
		
		
		boolean isGivenSslcNumber = false;
		boolean isGivenNameValid = false;
		boolean isGivenGarduationDone= false;
		boolean isGivenPasswordValid=false;
        boolean isGivenCaptchaValid = false;
		
		
		if(isStudiedinKarnataka!=false){
			isStudyinKarnataka=isStudiedinKarnataka;
			
		}
		else{
			System.out.println("you have not studied in Karnataka");
		}
		if(sslcRegistrationNumber!=0){
			sslcNumber=sslcRegistrationNumber;
			isGivenSslcNumber = true;
		}
		else{
			System.out.println("please provide proper SSLC number");
		}
		if(fullName!=null){
			name=fullName;
			isGivenNameValid = true;
		}
		else{
			System.out.println("Provide proper name");
		}
		if(isUnderGraduationDone!=false){
			isUgDone=isUnderGraduationDone;
			isGivenGarduationDone = true;
		}
		else{
			System.out.println("You have not done Under Graduation");
		}
		if(password!=null){
			pwd=password;
			isGivenPasswordValid=true;
		}
		else{
			System.out.println("please enter the passowrd");
		}
		
		if(captcha!=null){
			capcha=captcha;
			isGivenCaptchaValid = true;
		}
		else{
			System.out.println("Please enter proper Captcha");
		}
		if ( isGivenSslcNumber && isGivenNameValid &&isGivenGarduationDone&& isGivenPasswordValid && isGivenCaptchaValid  ) {
            isApplicationCompleted = true;
        }
	
		return isUserRegisterd;
	}
	public static void getUserDetails(){
		if(isApplicationCompleted){
			
			System.out.println("Have You Studied in Karnataka: "+isStudyinKarnataka);
			System.out.println("Your SSLC Registration Number: "+sslcNumber);
			System.out.println("Your Full Name as per SSLC : "+name);
			System.out.println("UnderGraduation Completed: "+isUgDone);
			System.out.println("Please Enter your Password: "+pwd);
			System.out.println("Enter the Captcha: "+capcha);
		}
		else {
            System.out.println("No application details available. Please apply first.");
        }
	}
}



//isStudyinKarnataka=isStudiedinKarnataka;
		//sslcNumber=sslcRegistrationNumber;
		//name=fullName;
		//isUgDone=isUnderGraduationDone;
		//pwd=password;
		//capcha=captcha;
		