package codes.drkfrtz.movieinfoservice.models;

public class Movie {
    private String movieId;
    private String title;
    private String description;

    public Movie(String movieId, String title, String description) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
