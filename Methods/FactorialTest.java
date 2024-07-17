class FactorialTest{
	
	public static void main(String[] f){
		System.out.println("The Main Method Started");
		int n=9;
		int r=7;
		int result=Factorial.toGetFact(n)/Factorial.toGetFact(n-r);
		
		System.out.println("nPr="+result);
		int result2=Factorial.toGetFact(n)/(Factorial.toGetFact(n-r)*Factorial.toGetFact(r));
		System.out.println("nCr="+result2);
		System.out.println("The Main Method Ended");
	}
}