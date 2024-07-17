class WeighingScale{
	static String display="LED";
	static boolean isBatteries=false;
	static int weighing=100;
	public static void main(String[] scale){
	    String type="Weighing Machine";
		String builder="METIS";
		
		System.out.println("The product type is : "+type);
		System.out.println("The Weighing Machine Manufacturer is : "+builder);
		System.out.println("The Machine Display  is of : "+display);
		System.out.println("Does Batteries needed for the Machine"+isBatteries);
		System.out.println("the Weighing Limit of this Machine is : "+weighing);
	}
}