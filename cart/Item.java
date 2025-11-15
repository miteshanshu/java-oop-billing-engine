package cart;

/**
 * Encapsulation - Private fields with public getter methods.
 */
public class Item {
    private String name;
    private double price;
    private int quantity;

    /**
     * Constructor to create an item.
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Returns total cost (price × quantity).
     */
    public double getTotal() {
        return price * quantity;
    }

    /**
     * Returns product name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns price per unit.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns quantity.
     */
    public int getQuantity() {
        return quantity;
    }
}
