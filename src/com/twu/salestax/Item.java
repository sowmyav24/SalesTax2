package com.twu.salestax;

public class Item {
        private int quantity;
        private String itemName;
        private double price;
        private double salesTaxAmount;

        Item(int quantity, String itemName, double price) {
            this.quantity = quantity;
            this.itemName = itemName;
            this.price = price;
        }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String returnItemName() {
            return this.itemName;
        }

}
