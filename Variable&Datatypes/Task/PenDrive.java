class PenDrive{
	static String material = "Silver Metal";
    static boolean isInStock = true;
    static float rating = 3.8f;
    public static void main(String[] storage){
        String productName = "HP 818w";
        int cost= 483;
		int storgae=32;
		float usbPort=3.2f;
        
        System.out.println("Material :"+material);
        System.out.println("Product is Available in Stock : "+isInStock);
		System.out.println("pen rating is:"+rating);
        System.out.println("PenDrive Name:"+productName);
        System.out.println("Price:"+cost);
		System.out.println("Product contains a USB Port: "+usbPort);
	}
}
