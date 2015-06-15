package com.twu.salestax;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readInput() {
        return scanner.nextLine();
    }
}
