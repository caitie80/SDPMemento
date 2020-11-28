public class Client {
    public static void main(String[] args) {
        Movie tpb = new Movie();
        tpb.setName("The Princess Bride");
        tpb.setGenre("Fantasy");
        tpb.setRuntimeInMinutes(98);

        VideoPlayer vp = new VideoPlayer(tpb);
        vp.setCurrentPlayTime(35);
        vp.setStatus(Status.PLAYING);

        System.out.println("Current video: " + vp.getVideo().getName());
        System.out.println("Current play time: " + vp.getCurrentPlayTime() + " minutes");
        System.out.println("Current status: " + vp.getStatus());

        System.out.println("\nChanging video, saving...\n");
        VideoPlayerMemento memento = vp.getCurrentState();

        Episode theCrown = new Episode();
        theCrown.setName("The Crown");
        theCrown.setGenre("Historical drama");
        theCrown.setEpisode(2,1);
        theCrown.setRuntimeInMinutes(45);

        vp.setVideo(theCrown);
        vp.setStatus(Status.PAUSED);
        vp.setCurrentPlayTime(20);
        System.out.println("Current video: " + vp.getVideo().getName());
        System.out.println("Current play time: " + vp.getCurrentPlayTime() + " minutes");
        System.out.println("Current status: " + vp.getStatus());

        System.out.println("\nChanging video...\n");
        vp.restoreState(memento);
        System.out.println("Current video: " + vp.getVideo().getName());
        System.out.println("Current play time: " + vp.getCurrentPlayTime() + " minutes");
        System.out.println("Current status: " + vp.getStatus());
    }
}
