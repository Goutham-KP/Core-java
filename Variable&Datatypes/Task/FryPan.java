class FryPan{
	static String type="Pan";
	static String material="Aluminium";
	static int quantity=1;
	public static void main(String[] cooking){
		String capacity="2 liters";
		boolean isNonSticky=true;
		String brand="Hawkins";
		
		System.out.println("The Cooking material is :"+type);
		System.out.println("The Pan is of "+material+"Material");
		System.out.println("The Quantity of item in box is: "+quantity);
		System.out.println("The Capacity of the pan is : "+capacity);
		System.out.println(" Non Sticky Coating: "+(isNonSticky ? "Yes": "No"));
		System.out.println("The Pan Brand is : "+brand);
	}
}