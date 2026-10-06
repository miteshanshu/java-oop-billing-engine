import cart.Item;
import cart.ShoppingCart;
import discount.BuyOneGetOneDiscount;
import discount.DiscountStrategy;
import discount.FixedAmountDiscount;
import discount.PercentageDiscount;

// This class runs the whole demo and shows how different discount types work
public class App {
    public static void main(String[] args) {

        // prints the program title
        System.out.println("========================================");
        System.out.println("  Smart Billing & Discount Engine");
        System.out.println("========================================");

        // creating a cart object (example of composition since cart holds items)
        ShoppingCart cart = new ShoppingCart();

        // adding different items to the cart
        cart.addItem(new Item("Pen", 20, 3));
        cart.addItem(new Item("Notebook", 50, 2));
        cart.addItem(new Item("Pencil", 10, 5));

        // showing all items added in the cart
        cart.displayItems();

        // calculating the total amount before applying any discount
        double total = cart.calculateTotal();
        System.out.println("\nBase Amount: Rs " + total);

        // this object applies different discount strategies
        BillingEngine engine = new BillingEngine();

        System.out.println("\n========================================");
        System.out.println("  Testing Different Discount Strategies");
        System.out.println("========================================");

        // using percentage discount (example of polymorphism)
        DiscountStrategy percentDiscount = new PercentageDiscount(10);
        double finalAmount1 = engine.getFinalAmount(total, percentDiscount);
        engine.printBillingSummary(total, finalAmount1);

        // using fixed amount discount
        DiscountStrategy fixedDiscount = new FixedAmountDiscount(40);
        double finalAmount2 = engine.getFinalAmount(total, fixedDiscount);
        engine.printBillingSummary(total, finalAmount2);

        // using buy-one-get-one discount
        DiscountStrategy bogoDiscount = new BuyOneGetOneDiscount();
        double finalAmount3 = engine.getFinalAmount(cart.getItems(), bogoDiscount);
        engine.printBillingSummary(total, finalAmount3);

        // listing the OOP ideas used in this project
        System.out.println("\n========================================");
        System.out.println("  OOP Concepts Demonstrated:");
        System.out.println("========================================");

        System.out.println("✓ Abstraction: DiscountStrategy interface hides discount details");
        System.out.println("✓ Encapsulation: Item class uses private fields");
        System.out.println("✓ Inheritance: Discount classes follow the DiscountStrategy interface");
        System.out.println("✓ Polymorphism: BillingEngine accepts any discount type");
        System.out.println("✓ Composition: Cart contains a list of items");
        System.out.println("✓ Method Overriding: applyDiscount method in each discount class");
    }
}
