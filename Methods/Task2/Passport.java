class Passport{
		
		static String cpvLoc;
		static int dcdrLoc;
		static String name;
		static String nickName;
		static String birthDate;
		static String mailId;
		static boolean isLoginEmailSame;
		static String id;
		static String pwd;
		static String cpwd;
		static String ques;
		static String ans;
		static String captchaa;
		
		
	public static boolean createPassport(String cpvLocation,int dcdrLocation,String givenName,
		String surName,String dob,String email,boolean isEmailLoginIdSame,String loginId,String password,String confirmPassword,
		String question,String hintAns,String captcha){
		boolean isPassportDataCreated = false;
		
		if(cpvLocation!=null && dcdrLocation >=0 && givenName!=null && email!=null &&surName!=null && 
		     dob!=null && isEmailLoginIdSame!=false && loginId!=null && password!= null && confirmPassword!=null && question!=null && hintAns!= null && captcha!=null){
				 
			System.out.println("The Passport Creation Started");
		
		      cpvLoc=cpvLocation;
			  dcdrLoc=dcdrLocation;
			  name=givenName;
	          nickName=surName;		  
		      birthDate=dob;
			  mailId=email;
			  isLoginEmailSame=isEmailLoginIdSame;
			  id=loginId;
			  pwd=password;
			  cpwd=confirmPassword;
			  ques=question;
			  ans=hintAns;
			  captchaa=captcha;
			  
			  isPassportDataCreated=true;
			  
			System.out.println("The Passport Creation Ended"); 
			  
		}
		else{
			System.out.println("Provide Correct Details");
		}
		
		return isPassportDataCreated;	
	}
	
	public static void getPassportDetails(){
		
		System.out.println("The Fectching the Passport Details");
		
		System.out.println("Cpv Location: "+cpvLoc);
		System.out.println("Dcdr Location: "+dcdrLoc);
		System.out.println("Given Name: "+name);
		System.out.println("SurName: "+nickName);
		System.out.println("DOB: "+birthDate);
		System.out.println("Email id: "+mailId);
		System.out.println("Email and Login Id Same: "+isLoginEmailSame);
		System.out.println("Login id: "+id);
		System.out.println("Password: "+pwd);
		System.out.println("Confirm Password: "+cpwd);
		System.out.println("Hint Question: "+ques);
		System.out.println("Hint Answer: "+ans);
		System.out.println("Captcha: "+captchaa);
		
		System.out.println("Passport Creation Done");
		
	}
}
	
	
	