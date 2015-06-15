package com.twu.salestax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ConsoleViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream byteArrayInputStream;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldAcceptInputFromUser() {
        String inputData = "1";
        ConsoleView consoleView = mock(ConsoleView.class);
        when(consoleView.readInput())
                .thenReturn("1");
        byteArrayInputStream = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(byteArrayInputStream);

        String actualOption = consoleView.readInput();

        assertEquals(inputData, actualOption);
    }

    @Test
    public void shouldPrintSalesTax() {
        ConsoleView consoleView = new ConsoleView(new Scanner(System.in));

        consoleView.display(12.49);

        assertEquals("Sales Tax 12.49\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}