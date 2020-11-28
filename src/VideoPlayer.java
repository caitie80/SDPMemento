public class VideoPlayer {
    private Video video;
    private Status status;
    private int currentPlayTime;

    public VideoPlayer(Video video) {
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

    public VideoPlayerMemento getCurrentState(){
        VideoPlayerMemento memento = new VideoPlayerMemento();
        VideoPlayer vp = new VideoPlayer(this.video);
        vp.setCurrentPlayTime(this.currentPlayTime);
        vp.setStatus(this.status);
        memento.setVideoPlayer(vp);

        return memento;
    }

    public void restoreState(VideoPlayerMemento memento){
        this.status = memento.getVideoPlayer().getStatus();
        this.video = memento.getVideoPlayer().getVideo();
        this.currentPlayTime = memento.getVideoPlayer().getCurrentPlayTime();
    }
}
