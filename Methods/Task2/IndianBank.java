class IndianBank{

	static String fName;
	static String mail;
	static String panNo;
	static long adhar;
	static long number;
	static String typeAccount;
	static String avatar;
	static String nominee;
	static int ag;
	
	public static boolean createAccount(String fullName,String email,String pan,long aadhar,long phoneNumber,String accountType,String gender,String nomine,int age){
	
		boolean isAccountCreated=false;
		
		if(fullname!=null){
			fName=fullName;
		}
		if(email!= null){
			mail=email;
		}
		if(pan!=null){
			panNo=pan);
		}
		if(aadhar!=null){
			adhar=aadhar);
		}
		if(phoneNumber >=0){
			number=phoneNumber);
		}
		if(accountType!=null){
			typeAccount=accountType;
		}
		if(gender!=null){
			avatar=gender;
		}
		if(nomine!=null){
			nominee=nomine;
		}
		if(age >0){
			ag=age;
		}
		
		isAccountCreated=true;
		
		else{
			System.out.println("please Provide correct details of....");
		}
		return isAccountCreated;
	}
	public static void getAccount(){
		
		System.out.println("Fetching Account Details..........");
		
		System.out.println("Full Name: "+fName);
		System.out.println("Email ID: "+mail);
		System.out.pritnln(
		
			