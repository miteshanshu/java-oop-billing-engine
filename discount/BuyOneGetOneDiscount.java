package discount;

// This class uses inheritance because it follows the DiscountStrategy interface
// It gives a buy-one-get-one type discount by making the amount half
public class BuyOneGetOneDiscount implements DiscountStrategy {

    // applies 50% discount on the given amount
    @Override
    public double applyDiscount(double amount) {
        return amount / 2;
    }
}
