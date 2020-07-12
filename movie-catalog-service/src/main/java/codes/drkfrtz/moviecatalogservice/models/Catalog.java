package codes.drkfrtz.moviecatalogservice.models;

import java.util.List;

public class Catalog {

    private List<CatalogItem> catalogItems;

    public Catalog() {
    }

    public Catalog(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }
}
