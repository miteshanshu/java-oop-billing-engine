package discount;

// This interface shows abstraction because all discount types must follow this rule
public interface DiscountStrategy {

    // applies a discount on the amount and returns the updated value
    double applyDiscount(double amount);
}
