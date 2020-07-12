package codes.drkfrtz.moviecatalogservice.models;

public class CatalogItem {

    private String title;
    private String description;
    private int rating;

    public CatalogItem() {
    }

    public CatalogItem(String title, String description, int rating) {
        this.title = title;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }
}
