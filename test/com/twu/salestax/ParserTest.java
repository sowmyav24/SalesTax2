package com.twu.salestax;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class ParserTest {

    @Test
    public void shouldBeAbleToParseTheInput() {
        Item itemStub = mock(Item.class);
        ExemptedItem exemptedItem = mock(ExemptedItem.class);
        Parser parser = new Parser(exemptedItem);

        String[] actualItems = {"1", "book", "at", "12.49"};

        assertThat(parser.parseInput("1 book at 12.49"), is(actualItems));
    }

//    @Test
//    public void shouldExtractItemDetails() {
//        Item itemStub = mock(Item.class);
//        ExemptedItem exemptedItem = mock(ExemptedItem.class);
//        Parser parser = new Parser(exemptedItem);
//
//        Item actualItems = new Item(1, "bookat", 12.49,exemptedItem);
//
//        assertThat(parser.extractItemDetails("1 book at 12.49"), is(equalTo(itemStub)));
//    }


}
