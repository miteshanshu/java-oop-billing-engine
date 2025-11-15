import discount.DiscountStrategy;

// This class handles applying discounts and printing the final bill
public class BillingEngine {

    // uses polymorphism because it can work with any discount type
    public double getFinalAmount(double baseAmount, DiscountStrategy strategy) {
        return strategy.applyDiscount(baseAmount);
    }

    // prints the billing details like base amount, discount, and final amount
    public void printBillingSummary(double baseAmount, double finalAmount) {
        double discountAmount = baseAmount - finalAmount;
        double discountPercent = (discountAmount / baseAmount) * 100;

        System.out.println("\n--- Billing Summary ---");
        System.out.println("Base Amount: Rs " + String.format("%.2f", baseAmount));
        System.out.println("Discount Amount: Rs " + String.format("%.2f", discountAmount));
        System.out.println("Discount Percentage: " + String.format("%.2f", discountPercent) + "%");
        System.out.println("Final Amount: Rs " + String.format("%.2f", finalAmount));
    }
}
