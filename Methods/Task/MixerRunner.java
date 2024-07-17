class MixerRunner {

	public static void main(String grind[]) {
		System.out.println("Main method started");
		Mixer.getFeatures();
		Mixer.onOrOff();
		Mixer.increaseLevel();
		System.out.println("Main Method Ended");
	}
}