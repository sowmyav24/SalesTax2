package com.twu.salestax;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Parser {
    private Item item;

    Parser(Item item) {
        this.item = item;
    }

    public String[] parseInput(String input) {
        return input.split(" ");
    }

    public Item extractItemDetails(String input) {
        String[] subString;
        subString = parseInput(input);
        String details = "";
        for (int i = 1; i < subString.length - 1; i++) {
            details += subString[i];
        }
        item = new Item(parseInt(subString[0]), details, parseDouble(subString[subString.length - 1]));
        return item;
    }
}
