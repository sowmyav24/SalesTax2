package com.twu.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldReturnItemDetails() {
        Item item = new Item(1, "Book", 12.49);

        String actualName = "Book";

        assertEquals(item.returnItemName(), actualName);

    }

}