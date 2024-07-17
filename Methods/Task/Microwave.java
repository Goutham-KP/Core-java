class Microwave{

	static boolean isConnected=false;
	static int timer=0;
	static int maxTimer=15;
	static int minTimer=0;

	public static void onOrOff(){
		System.out.println("onOrOff method started");
		if (isConnected ==false){
			isConnected=true;
			System.out.println("Microwave is turned on");
		} 
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Microwave is turned off");
		}
		System.out.println("onOrOff method ended");
		return;
	}

	
	public static void increaseTimer() {
		System.out.println("Increase Timer method started");
		if (isConnected==true){
			if(timer< maxTimer){
				timer=timer+1;
				System.out.println("The Timer is increased to "+timer);
			}
			else{
					System.out.println("The Timer is at maximum");
			}
		System.out.println("Increase Timer method ended");
		return;
		}
	}
	public static void decreaseTimer(){
		System.out.println("Decrease Started");
		if(isConnected==true){
			if(timer>minTimer){
				timer=timer-1;
				System.out.println("The Timer is: "+timer);
			}
			else{
				System.out.println("The Timer is Decreased");
			}
		}
		
		else{
			System.out.println("FIrst Check is it Connected");	
		}
		System.out.println("Decrease Ended");
		return;
	}
	public static void getFeatures(){
		System.out.println("getFeatures method started");
		String name="Microwave";
		String brand="ElectroLux";
		System.out.println("Name :"+name);
		System.out.println("Brand name:" +brand);
		System.out.println("getFeatures method ended");
		return;

	}
}