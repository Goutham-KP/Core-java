class FiveStarChicken{

    public static double takeOrder(String foodName){
        if (foodName == "Chicken Burger") {
            return 100.00;
        }
        if (foodName == "Chicken Wings") {
            return 150.00;
        }
        if (foodName == "Chicken Popcorn") {
            return 120.00;
        }
        if (foodName == "Grilled Chicken") {
            return 180.00;
        }
        if (foodName == "Chicken Strips") {
            return 160.00;
        }
        if (foodName == "Chicken Lollipop") {
            return 130.00;
        }
        if (foodName == "Chicken Hot Dog") {
            return 110.00;
        }
        if (foodName == "Chicken Nuggets") {
            return 140.00;
        }
        if (foodName == "French Fries") {
            return 70.00;
        }
        if (foodName == "Garlic Bread") {
            return 60.00;
		}
		if(foodName.equals("Pepper Chicken")){
			return 199.00;
		}
		if(foodName.equals("Chicken 65")){
			return 179.00;
		}
		if(foodName.equals("Chicken Manchurian")){
			return 189.00;
		}
		if(foodName.equals("Chicken Burger")){
			return 129.00;
		}
		if(foodName.equals("Chicken Wrap")){
			return 159.00;
		}
        else{
			System.out.println("The Food is Unavailable");
		}
	return 00.00;
    }
}