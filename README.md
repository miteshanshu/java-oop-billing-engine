# Smart Billing & Discount Engine - Java OOP

A pure **OOP-based** billing and discount engine in Java that demonstrates core object-oriented programming concepts.

## Project Overview

This system calculates final bill prices using different discount strategies:
- Percentage-based discounts
- Fixed-amount discounts  
- Buy-One-Get-One (BOGO) discounts

## OOP Concepts Demonstrated

✓ **Abstraction** - `DiscountStrategy` interface  
✓ **Encapsulation** - Private fields in `Item` class  
✓ **Inheritance** - Strategy classes implement interface  
✓ **Polymorphism** - `BillingEngine` works with any strategy  
✓ **Composition** - `ShoppingCart` contains `Item` objects  
✓ **Method Overriding** - Each strategy overrides `applyDiscount()`  
✓ **Real Business Logic** - Complex discount algorithms

## How to Run

### Option 1: Using Shell Script
```bash
bash run.sh
```

### Option 2: Simple Compilation & Run
```bash
javac app.java
java App
```

## Project Structure
```
java-oop-billing-engine/
│
├── discount/
│   ├── DiscountStrategy.java      (Interface)
│   ├── PercentageDiscount.java    (10% off)
│   ├── FixedAmountDiscount.java   (Rs 40 off)
│   └── BuyOneGetOneDiscount.java  (50% off)
│
├── cart/
│   ├── Item.java                  
│   └── ShoppingCart.java          
│
├── BillingEngine.java             
├── App.java                       
├── run.sh                         
└── README.md                      
```

## Expected Output
```
========================================
  Smart Billing & Discount Engine
========================================

--- Shopping Cart Items ---
Pen x 3 @ Rs 20.0 = Rs 60.0
Notebook x 2 @ Rs 50.0 = Rs 100.0
Pencil x 5 @ Rs 10.0 = Rs 50.0

Base Amount: Rs 210.0

========================================
  Testing Different Discount Strategies
========================================

--- Billing Summary ---
Base Amount: Rs 210.00
Discount Amount: Rs 21.00
Discount Percentage: 10.00%
Final Amount: Rs 189.00

--- Billing Summary ---
Base Amount: Rs 210.00
Discount Amount: Rs 40.00
Discount Percentage: 19.05%
Final Amount: Rs 170.00

--- Billing Summary ---
Base Amount: Rs 210.00
Discount Amount: Rs 105.00
Discount Percentage: 50.00%
Final Amount: Rs 105.00

========================================
  OOP Concepts Demonstrated:
========================================
✓ Abstraction: DiscountStrategy interface hides discount details
✓ Encapsulation: Item class uses private fields
✓ Inheritance: Discount classes follow DiscountStrategy interface
✓ Polymorphism: BillingEngine accepts any discount type
✓ Composition: Cart contains a list of Items
✓ Method Overriding: applyDiscount() differs in each discount class
```

## System Requirements

- Java 8 or higher
- javac compiler

Check Java version:
```bash
java -version
javac -version
```

## Design Pattern

This project implements the **Strategy Design Pattern**:
- **Context**: `BillingEngine`
- **Strategy Interface**: `DiscountStrategy`
- **Concrete Strategies**: `PercentageDiscount`, `FixedAmountDiscount`, `BuyOneGetOneDiscount`

## How to Extend

Add new discount strategies by:
1. Create a new class implementing `DiscountStrategy`
2. Override `applyDiscount()` method
3. Use it in `App.java`

Example:
```java
public class SeasonalDiscount implements DiscountStrategy {
    private double discountPercent;
    
    public SeasonalDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * discountPercent / 100);
    }
}
```

## Author

**Mitesh Anshu**  
GitHub: [@miteshanshu](https://github.com/miteshanshu)

## License

This project is open source and available under the [MIT License](LICENSE).

---

⭐ If you found this helpful, consider giving it a star!
