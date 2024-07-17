class CarCover {
	static String brand="Frap";
	static String model="WagonR";
	static int year=2024;
	public static void main(String car[]){
		
		Float rating=4.3f;
		boolean isInstock=true;
		String material="Polyester";

		System.out.println("Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturer Year: " + year);
		System.out.println("Ratings of this Product: "+rating);
		System.out.println("The Product available: "+(isInstock ? "yes":"No"));
		System.out.println("The Product Material is of : "+material);
	}
}