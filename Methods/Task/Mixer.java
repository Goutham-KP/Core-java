class Mixer{

	static boolean isConnected=false;
	static int currentLevel=0;
	static int maxLevel=5;

	public static void onOrOff(){
		System.out.println("onOrOff method started");
			if (isConnected ==false){
				isConnected=true;
				System.out.println("Mixer is turned on");
			} 
			else if(isConnected==true){
				isConnected=false;
				System.out.println("Mixer is turned off");
			}
		System.out.println("onOrOff method ended");
		return;
	}

	public static void increaseLevel() {
		System.out.println("increaseVolume method started");
		if (isConnected==true){
			if(currentLevel < maxLevel){
				currentLevel=currentLevel+1;
				System.out.println("The volume is increased to "+currentLevel);
			}
			else{
				System.out.println("The volume is at maximum");
			}
		}
		System.out.println("increaseVolume method ended");
	}
	
	public static void getFeatures(){
		System.out.println("Get Features method started");
			String name="Mixer";
			String brand="Orient";
			System.out.println("Name :"+name);
			System.out.println("Brand name:" +brand);
			System.out.println("Get Features method ended");
	}
}