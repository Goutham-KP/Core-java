class SwiggyRunner{
	public static void main(String[] delivery){
		
		
		double food=Swiggy.takeOrder("Pizza");
		System.out.println("Pizza : "+food);
		double food1=Swiggy.takeOrder("Burger");
		System.out.println("Burger: "+food1);
		double food2=Swiggy.takeOrder("Lemon Rice");
		System.out.println("Lemon Rice: "+food2);
		double food5=Swiggy.takeOrder("Puliogre");
		System.out.println("Puliogre: "+food5);
		double food3=Swiggy.takeOrder("Pullav");
		System.out.println("Pullav: "+food3);
		double food4=Swiggy.takeOrder("Biryani");
		System.out.println("Biryani: "+food4);
		double food6=Swiggy.takeOrder("Idly");
		System.out.println("Idly:"+food6);
		double food7=Swiggy.takeOrder("Poori");
		System.out.println("Poori: "+food7);
		double food8=Swiggy.takeOrder("Masal Dose");
		System.out.println("Masal Dose: "+food8);
		double food9=Swiggy.takeOrder("Roti Curry");
		System.out.println("Roti Curry: "+food9);
		double food10=Swiggy.takeOrder("Noodels");
		System.out.println("Noodels: "+food10);
		double food11=Swiggy.takeOrder("Fried Rice");
		System.out.println("Fried Rice: "+food11);
		double food12=Swiggy.takeOrder("GobiManchurian");
		System.out.println("GobiManchurian: "+food12);
		double food13=Swiggy.takeOrder("Mushroom Biryani");
		System.out.println("Mushroom Biryani: "+food13);
		double food14=Swiggy.takeOrder("CurdRice");
		System.out.println("Curd Rice: "+food14);
		
		
		
		double foodPrice=Swiggy.takeOrder("Pizza",2);
		System.out.println("price for 2 pizza is: "+foodPrice);
		double foodPrice1=Swiggy.takeOrder("Burger",3);
		System.out.println("price for 3 Burger is: "+foodPrice1);
		double foodPrice2=Swiggy.takeOrder("Lemon Rice",3);
		System.out.println("price for 3 LemonRice is: "+foodPrice2);
		double foodPrice3=Swiggy.takeOrder("Puliogre",4);
		System.out.println("price for 4 plate Puliogre is: "+foodPrice3);
		double foodPrice4=Swiggy.takeOrder("Pullav",4);
		System.out.println("price for 4 platte pullav is: "+foodPrice4);
		double foodPrice5=Swiggy.takeOrder("Biryani",2);
		System.out.println("price for 2 Biryani is: "+foodPrice5);
		double foodPrice6=Swiggy.takeOrder("Idly",5);
		System.out.println("price for 5 Idly is: "+foodPrice6);
		double foodPrice7=Swiggy.takeOrder("Poori",2);
		System.out.println("price for 2 poori is: "+foodPrice7);
		double foodPrice8=Swiggy.takeOrder("Masal Dose",3);
		System.out.println("price for 3 MasalDoese is: "+foodPrice8);
		double foodPrice9=Swiggy.takeOrder("Roti Curry",4);
		System.out.println("price for 4 Roti Curry is: "+foodPrice9);
		double foodPrice10=Swiggy.takeOrder("Noodels",2);
		System.out.println("price for 2 Noodels is: "+foodPrice10);
		double foodPrice11=Swiggy.takeOrder("Fried Rice",3);
		System.out.println("price for ice FriedRc is: "+foodPrice11);
		double foodPrice12=Swiggy.takeOrder("GobiManchurian",6);
		System.out.println("price for 6 GobiManchuri is: "+foodPrice12);
		double foodPrice13=Swiggy.takeOrder("Mushroom Biryani",4);
		System.out.println("price for 4 MushroomBiryani is: "+foodPrice13);
		double foodPrice14=Swiggy.takeOrder("CurdRice",2);
		System.out.println("price for 2 Curd Rice is: "+foodPrice14);
		
	}
}