class MicrowaveRunner {

	public static void main(String oven[]) {
		System.out.println("Main method started");
		Microwave.getFeatures();
		Microwave.onOrOff();
		Microwave.increaseTimer();
		Microwave.decreaseTimer();
		Microwave.onOrOff();
		System.out.println("Main Method Ended");
	}
}