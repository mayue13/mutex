package MallApp1;


public class Item {
    private String name;
    private double price;
    private int quantity;
    private Category category;

    Item(String name, double price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    Item() {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
        }
        this.price = price;
    }

    public double getTax() {
        return price * quantity * category.getGstRate() / 100;
    }
}