class Speaker{

	static boolean isConnected=false;
	static int currentVolume=0;
	static int maxVolume=30;

	public static void onOrOff(){
		System.out.println("onOrOff method started");
		if (isConnected ==false){
			isConnected=true;
			System.out.println("Speaker is turned on");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Speaker is turned off");
		}
		System.out.println("onOrOff method ended");
		return;
	}


	public static void increaseVolume() {
		System.out.println("increaseVolume method started");
		if (isConnected==true){
			if(currentVolume < maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The volume is increased to"+currentVolume);
			}
			else{
				System.out.println("The volume is at maximum");
			}
		}
		System.out.println("increaseVolume method ended");
		return;
	}
	
	public static void getFeatures(){
		System.out.println("getFeatures method started");
		String name="Speaker";
		String brand="Ptron";
		System.out.println("Name :"+name);
		System.out.println("Brand name:" +brand);
		System.out.println("getFeatures method ended");
	}
}