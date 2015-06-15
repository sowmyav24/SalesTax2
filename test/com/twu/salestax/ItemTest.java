package com.twu.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ItemTest {

    @Test
    public void shouldReturnItemDetails() {
        ExemptedItem exemptedItem = mock(ExemptedItem.class);
        Item item = new Item(1, "Book", 12.49, exemptedItem);

        String actualName = "Book";

        assertEquals(item.returnItemName(), actualName);
    }

    public void shouldComputeSalesTax() {
        ExemptedItem exemptedItem = mock(ExemptedItem.class);
        Item item = new Item(1, "Book", 12.49, exemptedItem);

        Double actualTax = 0.0;

        assertEquals(item.calculateSalesTax(), actualTax);

    }
}