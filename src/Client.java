public class Client {
    public static void main(String[] args) {
        Movie tpb = new Movie();
        tpb.setName("The Princess Bride");
        tpb.setGenre("Fantasy");
        tpb.setRuntimeInMinutes(98);

        MoviePlayer mp = new MoviePlayer(tpb);
        mp.setCurrentPlayTime(35);
        mp.setStatus(Status.PLAYING);

        System.out.println("Current movie: " + mp.getMovie().getName());
        System.out.println("Current play time: " + mp.getCurrentPlayTime() + " minutes");
        System.out.println("Current status: " + mp.getStatus());
    }
}
