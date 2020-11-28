public class VideoPlayer {
    private Video video;
    private Status status;
    private int currentPlayTime;

    public VideoPlayer(Movie video) {
        this.video = video;
        status = Status.PLAYING;
        currentPlayTime = 0;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public int getCurrentPlayTime() {
        return currentPlayTime;
    }

    public void setCurrentPlayTime(int currentPlayTime) {
        this.currentPlayTime = currentPlayTime;
    }
}
