package discount;

// This class uses inheritance because it follows the DiscountStrategy interface
// It gives a fixed amount discount on the total
public class FixedAmountDiscount implements DiscountStrategy {

    // stores the amount to subtract
    private double discountAmount;

    // sets the discount amount when the object is created
    public FixedAmountDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    // subtracts the fixed discount from the total, final amount can't go below 0
    @Override
    public double applyDiscount(double total) {
        double finalAmount = total - discountAmount;
        return finalAmount < 0 ? 0 : finalAmount;
    }
}
