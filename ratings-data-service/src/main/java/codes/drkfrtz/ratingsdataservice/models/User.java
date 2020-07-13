package codes.drkfrtz.ratingsdataservice.models;

public class User {
    private int userId;
    private String name;
    private UserRating userRating;

    public User() { }

    public User(int userId, String name, UserRating userRating) {
        this.userId = userId;
        this.name = name;
        this.userRating = userRating;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public UserRating getUserRating() {
        return userRating;
    }
}
