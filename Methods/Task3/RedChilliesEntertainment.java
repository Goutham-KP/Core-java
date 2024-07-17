class RedChilliesEntertainment {

    static String companyName = "Red Chillies Entertainment";
    static String movieActors[] = {null, null, null, null, null, null, null, null, null};
    static int index;

    public static boolean addMovieActors(String actor) {
        System.out.println("Adding Movie Actor");
        boolean isMovieActorAdded = false;
        if (movieActors!=null) {
            movieActors[index] = actor;
            index++;
            isMovieActorAdded = true;
        } else {
            System.out.println("No actors name Start with Null");
        }
        return isMovieActorAdded;
    }

    public static void getMovieActors() {
        System.out.println("The Movie Actors Added are: ");
        for (String actor : movieActors) {
                System.out.println(actor);
            
        }
    }
}
