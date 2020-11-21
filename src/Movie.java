public class Movie {

    private String name;
    private String genre;
    private int runtimeInMinutes;

    public Movie() {
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
}
