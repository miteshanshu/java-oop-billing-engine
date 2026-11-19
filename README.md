# Smart Billing & Discount Engine

I built this small Java console project to practise OOP and the Strategy pattern. It adds up a sample shopping cart, applies a discount, and prints the bill summary.

## What it does

The demo uses three strategies:

- Percentage discount: takes a percentage off the cart total.
- Fixed discount: subtracts a set amount, without letting the final amount go below zero.
- `BuyOneGetOneDiscount`: item-based buy-one-get-one. For every 2 units of an item, 1 is free (so 3 pens means 1 free, 5 pencils means 2 free). It needs the cart items, so call `getFinalAmount(cart.getItems(), strategy)`.

`ShoppingCart` holds the items, `DiscountStrategy` defines the discount method, and `BillingEngine` uses whichever strategy it receives. After the three bills, the program also prints the OOP concepts it used, so a run reads like a small checklist of the ideas.

## Run it

You need a JDK (Java 8 or newer), with both `javac` and `java` available. Run these commands from the project folder:

```bash
mkdir -p build
javac -encoding UTF-8 -d build App.java BillingEngine.java cart/*.java discount/*.java
java -cp build App
```

The entry file is `App.java`, with a capital A. Compiled files go into `build/`, which is ignored by Git.

## What a run looks like

The sample cart has 3 pens at Rs 20, 2 notebooks at Rs 50 and 5 pencils at Rs 10, so the base amount is Rs 210. The program then prints one billing summary per strategy:

```text
========================================
  Smart Billing & Discount Engine
========================================

--- Shopping Cart Items ---
Pen x 3 @ Rs 20.0 = Rs 60.0
Notebook x 2 @ Rs 50.0 = Rs 100.0
Pencil x 5 @ Rs 10.0 = Rs 50.0

Base Amount: Rs 210.0

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
Discount Amount: Rs 90.00
Discount Percentage: 42.86%
Final Amount: Rs 120.00
```

The three summaries are the 10% discount, the Rs 40 discount and buy-one-get-one, in that order. These are three separate runs on the same cart, not discounts stacked together. The run then lists the OOP concepts demonstrated, for example "Polymorphism: BillingEngine accepts any discount type".

The buy-one-get-one bill saves Rs 90 because 3 pens give 1 free (Rs 20), 2 notebooks give 1 free (Rs 50) and 5 pencils give 2 free (Rs 20).

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

This is a learning project, not a production billing system. It currently uses `double` for money, and the billing summary does not handle a zero cart total separately. The next improvements would be money handling and tests.

## Add a discount

Implement `discount.DiscountStrategy`, define `applyDiscount(double amount)` (override `applyDiscount(List<Item>)` too if it depends on items), and use the new strategy in `App.java`.

## Author

Mitesh Anshu - [@miteshanshu](https://github.com/miteshanshu)
