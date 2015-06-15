package com.twu.salestax;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParserTest {

    @Test
    public void shouldBeAbleToParseTheInput() {
        Parser parser = new Parser();

        String[] actualItems = {"1", "book", "at", "12.49"};

        assertThat(parser.parseInput("1 book at 12.49"), is(actualItems));
    }
}