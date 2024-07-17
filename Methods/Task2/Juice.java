class Juice{
	
  static double mangoJuice=45;
  static double frenchFries=30;
  static double watermelonPrice=45;
  static double vadaPavPrice=20;
  static double bannanaJuice=34;
  static double gobi=50;
	public static double takeOrder(String juiceName,String snacks){
		
		if(juiceName=="MangoJuice"){
			if(snacks=="FrenchFries"){
				return mangoJuice+frenchFries;
			}
			return mangoJuice;	
		}
		
		if(juiceName=="Watermelon"){
			if(snacks=="VadaPav"){
				return watermelonPrice+vadaPavPrice;
			}
			return watermelonPrice;
		}
		
		//if(juiceName=="OreoShake"){
			//if(snacks=="Bread Pakoda"){
			//	return 55.00;
			
			//return 50.00;
		
		
		if(juiceName=="Bannana juice"){
			if(snacks=="Gobi"){
				return bannanaJuice+gobi;
			}
			System.out.println("With Ice or Without Ice");
			return bannanaJuice;
			
		}
		
		if(juiceName=="Apple juice"){
			if(snacks=="panipuri"){
				return 35.00;
			}
			return 60.00;
		}
		else{
			System.out.println("The Juice is Unavailable");
		}
	return 00.00;
	}
}