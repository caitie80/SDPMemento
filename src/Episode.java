public class Episode implements Video{
    private String name;
    private String genre;
    private int season;
    private int episodeNo;
    private int runtimeInMinutes;

    public Episode() {
        name = null;
        genre = null;
        runtimeInMinutes = 0;
    }

    public String getName(){

        return this.name;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getRuntime(){
        return this.runtimeInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public String getEpisode(){
        return "Season " + this.season + ", Episode " + this.episodeNo;
    }

    public void setEpisode(int season, int episodeNo){
        this.season = season;
        this.episodeNo = episodeNo;
    }
}
