class VideoGame{
    public static void main(String[] game) {
        String title = "Cricket19";
        String genre = "Sports";
        String platform = "Steam";
        boolean isMultiplayer = true;

        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Platform: " + platform);
        System.out.println("Multiplayer: " + (isMultiplayer ? "Yes" : "No"));
    }
}