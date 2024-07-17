class BankAccount {

    static String accountHolderName;
    static String email;
    static long
	phone;
    static String accountType;
    static double balance;
    static String branch;
	static boolean isNominePresent;

    public static boolean createBankAccountDetails( String holderName, String emailId,
         long phoneNumber, String accType, double accBalance,String branchName,boolean isNomineAvailable) {
		 boolean isAccountCreated=false;
		 
		 
        
        accountHolderName = holderName;
        email = emailId;
        phone = phoneNumber;
        accountType = accType;
        balance = accBalance;
        branch = branchName;
		isNomineAvailable=isNominePresent;
		
		return isAccountCreated;
		
    }

    public static void getBankAccountDetails() {
      
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Branch: " + branch);
		System.out.println("Nomine Available: "+isNominePresent);
		
    }
}