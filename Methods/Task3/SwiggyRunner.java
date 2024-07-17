class SwiggyRunner{

	public static void main(String[] uta){
		System.out.println("Main Started");
		
		boolean isAddFood=Swiggy.addFoodName("Masal Dose");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Rice Bath");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Idly");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Uppma");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Bise Bele Bath");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Onion Dose");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Chitrana");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Vada Sambhar");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Pullav");
		System.out.println("Is Add Food Name: "+isAddFood);
		isAddFood=Swiggy.addFoodName("Poori sagu");
		System.out.println("Is Add Food Name: "+isAddFood);
		
		Swiggy.getFoodNames();
		
		boolean isFound=Swiggy.findFoodName("Masal Dose");
		System.out.println("Is Food Found: "+isFound);
		
		
		boolean isUpdateFood=Swiggy.updateFoodName("Uppma","Biryani");
		System.out.println("Is Update Food: "+isUpdateFood);
		
		Swiggy.getFoodNames();
		
		
	}
	
}