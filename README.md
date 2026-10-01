# Smart Billing & Discount Engine

I built this small Java console project to practise OOP and the Strategy pattern. It adds up a sample shopping cart, applies a discount, and prints the bill summary.

## What it does

The demo uses three strategies:

- Percentage discount: takes a percentage off the cart total.
- Fixed discount: subtracts a set amount, without letting the final amount go below zero.
- `BuyOneGetOneDiscount`: currently halves the whole cart total. This is a placeholder, not an item-based buy-one-get-one offer.

`ShoppingCart` holds the items, `DiscountStrategy` defines the discount method, and `BillingEngine` uses whichever strategy it receives.

## Run it

You need a JDK (Java 8 or newer), with both `javac` and `java` available. Run these commands from the project folder:

```bash
mkdir -p build
javac -encoding UTF-8 -d build App.java BillingEngine.java cart/*.java discount/*.java
java -cp build App
```

The entry file is `App.java`, with a capital A. Compiled files go into `build/`, which is ignored by Git.

## Sample result

The sample cart contains 3 pens at Rs 20 each, 2 notebooks at Rs 50 each, and 5 pencils at Rs 10 each. Its total is Rs 210.

| Strategy | Discount | Final amount |
| --- | --- | --- |
| 10% off | Rs 21 | Rs 189 |
| Rs 40 off | Rs 40 | Rs 170 |
| Current half-total placeholder | Rs 105 | Rs 105 |

These are three separate examples on the same cart, not discounts stacked together.

## Project structure

```text
java-oop-billing-engine/
├── App.java
├── BillingEngine.java
├── cart/
│   ├── Item.java
│   └── ShoppingCart.java
├── discount/
│   ├── DiscountStrategy.java
│   ├── PercentageDiscount.java
│   ├── FixedAmountDiscount.java
│   └── BuyOneGetOneDiscount.java
├── .gitignore
└── README.md
```

## Scope

This is a learning project, not a production billing system. It currently uses `double` for money, and the billing summary does not handle a zero cart total separately. The next improvements would be money handling, item-based BOGO logic, and tests.

## Add a discount

Implement `discount.DiscountStrategy`, define `applyDiscount(double amount)`, and use the new strategy in `App.java`.

## Author

Mitesh Anshu - [@miteshanshu](https://github.com/miteshanshu)
