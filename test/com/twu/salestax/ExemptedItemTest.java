package com.twu.salestax;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ExemptedItemTest {

    @Test
    public void shouldExemptSalesTax() {
        ArrayList<String> exemptedItems = new ArrayList<>();
        exemptedItems.add("Book");
        ExemptedItem exemptedItem = new ExemptedItem(exemptedItems);

        boolean actualTax = true;

        assertEquals(exemptedItem.checkIfSalesTaxIsExempted("Book"), actualTax);
    }
}