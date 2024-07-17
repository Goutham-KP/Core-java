class BankAccountRunner{

	public static void main(String[] args) {
	
        BankAccount.createBankAccountDetails("Virat Kholi", "viratindia@gmail.com",
                9876543210l, "Savings", 10000.50, "Main Branch",true);
        BankAccount.getBankAccountDetails();
    }
}