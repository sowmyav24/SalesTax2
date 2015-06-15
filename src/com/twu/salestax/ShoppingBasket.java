package com.twu.salestax;

public class ShoppingBasket {
    private ConsoleView consoleView;
    private Parser parser;
    private Item item;

    public ShoppingBasket(ConsoleView consoleView, Parser parser, Item item) {
        this.consoleView = consoleView;
        this.parser = parser;
        this.item = item;
    }

    public void start() {
        item = parser.extractItemDetails(consoleView.readInput());
    }
}
