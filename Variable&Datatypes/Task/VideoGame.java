class VideoGame{
	static String title = "Cricket19";
    static String genre = "Sports";
    static String platform = "PlayStation 4";
    public static void main(String[] game) {
        String developer="Big Ant Studios";
		int size=25;
        boolean isMultiPlayer = true;

        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Platform: " + platform);
		System.out.println("The Game Developer: "+developer);
		System.out.println("The Game is of Size: "+size+"GB");
        System.out.println("MultiPlayer: " + (isMultiPlayer ? "Yes" : "No"));
    }
}