package codes.drkfrtz.movieinfoservice.models;

public class Movie {
    private int movieId;
    private String title;
    private String description;

    public Movie(int movieId, String title, String description) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
