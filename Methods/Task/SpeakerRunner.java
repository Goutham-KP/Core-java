class SpeakerRunner {

	public static void main(String sound[]) {
		System.out.println("Main method started");
		Speaker.getFeatures();
		Speaker.onOrOff();
		Speaker.increaseVolume();
		System.out.println("Main Method Ended");
	}
}