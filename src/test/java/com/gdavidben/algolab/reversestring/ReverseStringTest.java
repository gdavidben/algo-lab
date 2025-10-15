package com.gdavidben.algolab.reversestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ReverseStringTest {

    @Test
    void testReverseString() {
        final String myStr = "This is my string";
        final String expected = "gnirts ym si sihT";
        final String result  = ReverseString.reserve(myStr);
        final String modernResult  = ReverseString.modernReverse(myStr);

        assertEquals(expected, result);
        assertEquals(expected, modernResult);
    }
}
