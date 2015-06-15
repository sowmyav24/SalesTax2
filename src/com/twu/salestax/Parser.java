package com.twu.salestax;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Parser {
    // private Item item;
    private ExemptedItem exemptedItem;

    Parser(ExemptedItem exemptedItem) {
        //this.item = item;
        this.exemptedItem = exemptedItem;
    }

    public String[] parseInput(String input) {
        return input.split(" ");
    }

    public Item extractItemDetails(String input) {
        String[] subString = input.split(" ");
        String details = "";
        for (int i = 1; i < subString.length - 1; i++) {
            details += subString[i];
        }
        Item item = new Item(parseInt(subString[0]), details, parseDouble(subString[subString.length - 1]), this.exemptedItem);
        return item;
    }
}
