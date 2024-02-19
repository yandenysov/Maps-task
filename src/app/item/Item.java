package app.item;

public class Item {
    private final String name;
    private final String amount;
    private final String price;

    public Item (String name, String amount, String price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String toString() {
        return "Item: " + name + ", Amount: " + amount + " pcs." + ", Price: " + price + " USD";
    }
}
