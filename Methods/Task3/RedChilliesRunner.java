class RedChilliesRunner {

    public static void main(String[] args) {
        boolean isActorAdded = RedChilliesEntertainment.addMovieActors("Shah Rukh Khan");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Kajol");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Deepika Padukone");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Anushka Sharma");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Varun Dhawan");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Alia Bhatt");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Nawazuddin Siddiqui");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Sidharth Malhotra");
        System.out.println("Actor Added: " + isActorAdded);
        isActorAdded = RedChilliesEntertainment.addMovieActors("Katrina Kaif");
        System.out.println("Actor Added: " + isActorAdded);

        RedChilliesEntertainment.getMovieActors();
    }
}