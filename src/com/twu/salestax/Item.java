package com.twu.salestax;

public class Item {
    private int quantity;
    private String itemName;
    private double price;
    private double salesTaxAmount;
    private ExemptedItem exemptedItem;

    Item(int quantity, String itemName, double price, ExemptedItem exemptedItem) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
        this.exemptedItem = exemptedItem;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String returnItemName() {
        return this.itemName;
    }

    public Double calculateSalesTax() {
        if (!(exemptedItem.checkIfSalesTaxIsExempted(returnItemName()))) {
            salesTaxAmount += 0.1 * price;
            this.price += 0.1 * this.price;
        }
        return salesTaxAmount;
    }
}
