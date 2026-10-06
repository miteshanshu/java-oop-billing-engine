package discount;

import cart.Item;
import java.util.List;

// This class uses inheritance because it follows the DiscountStrategy interface
// It gives a buy-one-get-one discount on each item: for every 2 units, 1 is free
public class BuyOneGetOneDiscount implements DiscountStrategy {

    // a plain amount has no item details, so no BOGO can be applied here
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }

    // for each item, half of its units (rounded down) are free
    @Override
    public double applyDiscount(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            int freeUnits = item.getQuantity() / 2;
            int paidUnits = item.getQuantity() - freeUnits;
            total += item.getPrice() * paidUnits;
        }
        return total;
    }
}
