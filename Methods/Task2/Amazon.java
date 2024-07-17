class Amazon{
	
	static String mail;
	static long phoneNumber;
	static String pwd;
	static String cpwd;
	static String user;
	
	static boolean isAmazonAccountCreated=false;
	
	public static boolean createAccount(String emailId,long mobileNumber,String password,String confirmPassword,String userName){
		boolean isAccountCreated=false;
		
		boolean isGivenEmailValid = false;
		boolean isGivenMobileValid = false;
		boolean isGivenPasswordValid = false;
        boolean isGivenConfirmPasswordValid = false;
        boolean isGivenUserNameValid = false;
        
        
		
		
		if(emailId!=null){
			mail=emailId;
			isGivenEmailValid = true;
		}
		else{
			System.out.println("please provide correct email id");
		}
		if(mobileNumber!=0){
			phoneNumber=mobileNumber;
			 isGivenMobileValid = true;
		}
		else {
			System.out.println("please provide correct Phone Number");
		}
		if(password!=null){
			if(password==confirmPassword){
				pwd=password;
				isGivenPasswordValid = true;
			}
		}
		else{
			System.out.println("check the Password");
		}
		if(confirmPassword==password){
			cpwd=confirmPassword;
			isGivenConfirmPasswordValid = true;
		}
		if(userName!=null){
			user=userName;
			isGivenUserNameValid = true;
		}
		else{
			System.out.println("please check user name");
		}
		if (isGivenEmailValid && isGivenMobileValid && isGivenPasswordValid && isGivenConfirmPasswordValid && isGivenUserNameValid  ) {
            isAmazonAccountCreated = true;
        }
		
		return isAccountCreated;
	}
	public static void getAccountDetails(){
		if(isAmazonAccountCreated){
			
			System.out.println("Email id: "+mail);
			System.out.println("Mobile Number: "+phoneNumber);
			System.out.println("Password: "+pwd);
			System.out.println("Confirm Password: "+cpwd);
			System.out.println("User Name: "+user);
		}
		else {
            System.out.println("No account details available. Please create an account first.");
        }
	}
}
