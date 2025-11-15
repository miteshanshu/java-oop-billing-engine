package discount;

// This class uses inheritance because it follows the DiscountStrategy interface
// It gives a percentage-based discount on the total amount
public class PercentageDiscount implements DiscountStrategy {

    // stores the discount percentage
    private double percent;

    // sets the discount percentage when the object is created
    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    // calculates the discount using the percentage and returns the final amount
    @Override
    public double applyDiscount(double amount) {
        double discountValue = (amount * percent) / 100;
        return amount - discountValue;
    }
}
