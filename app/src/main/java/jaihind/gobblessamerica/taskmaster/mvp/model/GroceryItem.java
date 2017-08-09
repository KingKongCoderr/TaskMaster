package jaihind.gobblessamerica.taskmaster.mvp.model;

/**
 * Created by ntankasala on 8/9/17.
 */


public class GroceryItem {
    private boolean available;
    private String name, description;
    private int quantity;

    public GroceryItem(boolean available, String name, String description, int quantity) {
        this.available = available;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
