package com.gdavidben.algolab.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FibonacciTest {

    /*
    * 0 1 1 2 3 5 8 13 21 34 55 89 144...
    *                              ^
    * O(2n)
    * */
    @Test
    void testFibonacci() {
        final int n = 12;
        final long expected = 144;

        assertEquals(expected, Fibonacci.run(n));
    }

    /*
    * O(n)
    * */
    @Test
    void testCachedFibonacci() {
        final int n = 12;
        final long expected = 144;

        assertEquals(expected, Fibonacci.Cached.run(n));
    }
}
