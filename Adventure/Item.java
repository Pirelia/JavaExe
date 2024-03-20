 public abstract class Item {    
    private String name;
    private String description;
    private int price;

    public Item (int price) {
        this.price = getPrice;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
