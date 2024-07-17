class JuiceRunner{

	public static void main(String[] args){
		
		
		
		double result=Juice.takeOrder("MangoJuice","FrenchFries");
		System.out.println("MangoJuice and french fries price: "+result);
		double result1=Juice.takeOrder("Watermelon","VadaPav");
		System.out.println("WaterMelon and Vadapav price: "+result1);

		//double result2=Juice.takeOrder("OreoShake","Bread Pakoda");
		//System.out.println(result2);
		double result3=Juice.takeOrder("Bannana juice","Gobi");
		System.out.println("Bannana Juice and Gobi price: "+result3);
		//double result4=Juice.takeOrder("Apple juice","panipuri");
		//System.out.println("Applejuice: "+result4+" "+"PaniPuri: "+result4);
		
		//double result5=Juice.takeOrder("Orange juice");
		//System.out.println("Orange Juice: "+result5);
	}
}
		