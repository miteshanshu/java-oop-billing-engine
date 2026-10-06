package discount;

import cart.Item;
import java.util.List;

// This interface shows abstraction because all discount types must follow this rule
public interface DiscountStrategy {

    // applies a discount on the amount and returns the updated value
    double applyDiscount(double amount);

    // applies a discount on the cart items, by default it uses the total of all items
    default double applyDiscount(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getTotal();
        }
        return applyDiscount(total);
    }
}
