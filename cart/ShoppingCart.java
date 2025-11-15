package cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Composition - Cart has-a List of Items.
 */
public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    /**
     * Adds an item to the cart.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Calculates total price of all items.
     */
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotal();
        }
        return total;
    }

    /**
     * Returns number of items in cart.
     */
    public int getItemCount() {
        return items.size();
    }

    /**
     * Displays all items in the cart.
     */
    public void displayItems() {
        System.out.println("\n--- Shopping Cart Items ---");
        for (Item item : items) {
            System.out.println(item.getName() + " x " + item.getQuantity() + 
                             " @ Rs " + item.getPrice() + " = Rs " + item.getTotal());
        }
    }
}
