package com.twu.salestax;

import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

public class ShoppingBasketTest {

    @Test
    public void shouldParseTheInput() {
        ConsoleView consoleViewStub = mock(ConsoleView.class);
        Parser parserStub = mock(Parser.class);
        Item itemStub = mock(Item.class);
        ShoppingBasket shoppingBasket = new ShoppingBasket(consoleViewStub, parserStub, itemStub);

        shoppingBasket.start();

        verify(parserStub, timeout(1)).extractItemDetails(anyString());
    }
}