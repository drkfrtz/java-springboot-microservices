package codes.drkfrtz.moviecatalogservice.models;

public class Rating {
    private int movieId;
    private int score;

    public Rating() {
    }

    public Rating(int movieId, int score) {
        this.movieId = movieId;
        this.score = score;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getScore() {
        return score;
    }
}
