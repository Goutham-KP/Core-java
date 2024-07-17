class AxisBankRunner{

	public static void main(String[] bank){
	
		System.out.println("main Started");
		AxisBank.credit(000000);
		double totalBalance=AxisBank.getBalance();
		System.out.println(totalBalance);
		AxisBank.debit(500000);
		double balance=AxisBank.getBalance();
		System.out.println(balance);
		
		
		
		
		System.out.println("main Ended");
		
	}
}