class TelevisionRunner{
	
	public static void main(String[] power){
		System.out.println("The Main Started");
		TelevisionSet.getFeatures();
		TelevisionSet.onOrOff();
		TelevisionSet.increaseVolume();
		TelevisionSet.decreaseVolume();
		System.out.println("The Main Ended");
	}
}
