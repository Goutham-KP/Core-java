class BabyCare {
	static String name = "Baby Soap";
    static String brand = "Johnson's";
    static  String ageGroup = "0-12 months";
    public static void main(String[] args) {
        String deliveryDate="18-jun-2024";
		String orderedDate="16-jun-2024";
        boolean isParaben= false;

        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Age Group: " + ageGroup);
		System.out.println("when will be  product Delivered: "+deliveryDate);
		System.out.println("when was Product Odered: "+orderedDate);
        System.out.println("Paraben: " + (isParaben ? "Yes" : "No"));
    }
}