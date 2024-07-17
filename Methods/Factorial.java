class Factorial{
	
	public static int toGetFact(int factorialNumber){
		int fact=1;
		for(int num=1;num<=factorialNumber;num++){
			fact= num*fact;
		}
		System.out.println("The Factorial of Number: "+factorialNumber+" is "+fact);
		return fact;
	}
}