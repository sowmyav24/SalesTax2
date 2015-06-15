package com.twu.salestax;

public class ShoppingBasket {
    private ConsoleView consoleView;
    private Parser parser;

    public ShoppingBasket(ConsoleView consoleView, Parser parser) {
        this.consoleView = consoleView;
        this.parser = parser;
    }

    public void start() {
        String token[] = parser.parseInput(consoleView.readInput());
    }
}
