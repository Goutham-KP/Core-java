class Github {


    static String userName;
    static String email;
    static String password;
    static String fullName;
    static String bio;

	static boolean isGitAccountCreated=false;
    public static boolean createGithubDetails(String usrName, String emailId, String pwd,
          String fulName, String biography) {
			  
			boolean isAccountCreated=false;
			
			boolean isGivenUserNameValid = false;
			boolean isGivenEmailValid = false;
			boolean isGivenPasswordValid = false;
			boolean isGivenFullNameValid = false;
			
        
			if(usrName!=null){
				userName=usrName;
				isGivenUserNameValid=true;
			}
			else{
				System.out.println("Please provide proper username");
			}
			
			if(emailId!=null){
				email=emailId;
				isGivenEmailValid=true;
			}
			else{
				System.out.println("Please check email once");
			}
			
			if(pwd!=null){
				password=pwd;
				isGivenPasswordValid=true;
			}
			else{
				System.out.println("check password");
			}
			
			if(fulName!=null){
				fullName=fulName;
				isGivenFullNameValid=true;
			}
			else{
				System.out.println("Please provide proper name");
			}
			
			if(biography!=null){
				bio=biography;
			}
			
			if (isGivenUserNameValid && isGivenEmailValid &&  isGivenPasswordValid && isGivenFullNameValid   ) {
            isGitAccountCreated = true;
        }
			  
		  
        //username = usrname;
        //email = emailId;
        //password = pwd;
        //fulName = fullName;
        //bio = biography;
        //location = loc;
       
		
			return isAccountCreated;
    }

    public static void getGitHubDetails() {
		if(isGitAccountCreated){
			System.out.println("Username: " + userName);
			System.out.println("Email: " + email);
			System.out.println("Password: " + password);
			System.out.println("Full Name: " + fullName);
			System.out.println("Bio: " + bio);
		}
		else{
			System.out.println("Create a Account");
		}
        
    }
}