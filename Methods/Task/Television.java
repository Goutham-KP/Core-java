class Television{
	
	static boolean isCondition;
	
	 public static void onOrOff(){
	 
	 System.out.println("The On or Off Started");
	 if(isCondition==false){
		isCondition=true;
		System.out.println("The Tv is on");
	}
	else if(isCondition==true){
		isCondition = false;
		System.out.println("The Tv is Off");
	}
	System.out.println("The On or Off Ended");
	return;
	}
	
	
	static int currentVolume=0;
	static int minVolume=0;
	static int maxVolume=30;
	
	public static int increaseVolume(){
		
		System.out.println("The Increase Volume Method Started");
		if(isCondition = true){
			if(currentVolume < maxVolume){
				
				currentVolume=currentVolume+1;
				System.out.println("The Volume of Tv icreased to: "+currentVolume);
		}
        else{
					System.out.println("The Tv is in Max Volume");
		}
	    }
		System.out.println("The Icrease Volume Method Ended");
		return currentVolume;
	}
	public static int decreaseVolume(){
		System.out.println("The Decrease Volume Method Started");
		if(currentVolume >minVolume){
			currentVolume=currentVolume-1;
			System.out.println("The Volume of Tv is Decreased: "+currentVolume);
		}
		else{
			System.out.println("The Tv is in Minimum Volume");
		}
		System.out.println("The Decrease Volume Method Ended");
		return currentVolume;
	}
		
     public static void getFeatures(){
		System.out.println("The Feature Started");
		String brand="Toshibha";
		double price=9500;
		System.out.println("The Brand Name is : "+brand);
		System.out.println("The Tv Price is: "+price);
		System.out.println("The Feature Ended");
	}
}
