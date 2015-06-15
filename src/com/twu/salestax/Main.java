package com.twu.salestax;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Book");
        list.add("Medicine");

        ExemptedItem exemptedItem = new ExemptedItem(list);

        Parser parser = new Parser(exemptedItem);

        Scanner scanner = new Scanner(System.in);

        ConsoleView consoleView = new ConsoleView(scanner);

        Item item = new Item(1, "bookat", 12.49, exemptedItem);

        ShoppingBasket shoppingBasket = new ShoppingBasket(consoleView, parser, item);

        shoppingBasket.start();

    }
}
