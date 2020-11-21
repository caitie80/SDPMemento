public class MoviePlayer {
    private Movie movie;
    private Status status;
    private int currentPlayTime;

    public MoviePlayer(Movie movie) {
        this.movie = movie;
        status = Status.PAUSED;
        currentPlayTime = 0;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
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
