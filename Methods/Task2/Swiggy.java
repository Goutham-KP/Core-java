class Swiggy{
	
	public static double takeOrder(String foodName){
		double price =0.0;
		if(foodName=="Pizza"){
			price = 99.00;
			return price;
		}
		if(foodName=="Burger"){
			price = 120.00;
			return price;
		}
		if(foodName=="Pullav"){
			price = 60.00;
			return price;
		}
		if(foodName=="Biryani"){
			price = 140.00;
			return price;
		}
		if(foodName=="Lemon Rice"){
			price = 50.00;
		}
		if(foodName=="Puliogre"){
			price = 40.00;
		}
		if(foodName=="Idly"){
			price = 20.00;
			return price;
		}
		if(foodName=="Poori"){
			price = 35.00;
			return price;
		}
		if(foodName=="Masal Dose"){
			price = 90.00;
			return price;
		}
		if(foodName=="Roti Curry"){
			price = 250.00;
			return price;
		}
		if(foodName=="Noodels"){
			price = 125.00;
			return price;
		}
		if(foodName=="Fried Rice"){
			price = 70.00;
			return price;
		}
		if(foodName=="GobiManchurian"){
			price = 80.00;
			return price;
		}
		if(foodName=="Mushroom Biryani"){
			price = 130.00;
			return price;
		}
		if(foodName=="CurdRice"){
			price = 45.00;
			return price;
		}
		
		
		else{
		System.out.println("The Food is Currently Unavilable");
		}
	 return price;
	}
	
	
	public static double takeOrder(String foodName,int quantity){
		double price=0.0;
		if(foodName=="Pizza"){
			price= 99.00;
			return price*quantity;
		}
		if(foodName=="Burger"){
			price= 120.00;
			return price*quantity;
		}
		if(foodName=="Lemon Rice"){
			price= 50.00;
			return price*quantity;
		}
		if(foodName=="Puliogre"){
			price= 40.00;
			return price*quantity;
		}
		if(foodName=="Pullav"){
			price= 60.00;
			return price*quantity;
		}
		if(foodName=="Biryani"){
			price= 140.00;
			return price*quantity;
		}
		if(foodName=="Idly"){
			price= 20.00;
			return price*quantity;
		}
		if(foodName=="Poori"){
			price= 35.00;
			return price*quantity;
		}
		if(foodName=="Masal Dose"){
			price= 90.00;
			return price*quantity;
		}
		if(foodName=="Roti Curry"){
			price= 250.00;
			return price*quantity;
		}
		if(foodName=="Noodels"){
			price= 125.00;
			return price*quantity;
		}
		if(foodName=="Fried Rice"){
			price= 70.00;
			return price*quantity;
		}
		if(foodName=="GobiManchurian"){
			price= 80.00;
			return price*quantity;
		}
		if(foodName=="Mushroom Biryani"){
			price= 135.00;
			return price*quantity;
		}
		if(foodName=="CurdRice"){
			price= 40.00;
			return price*quantity;
		}
		else{
			System.out.println("Currently the food is unavailable");
		}
		
		return 0.0;
	}

	
	
}

	