package com.gdavidben.algolab.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FactorialTest {

    /*
    * !5 = 5 * 4 * 3 * 2 * 1
    * !5 = 120
    * */
    @Test
    void test() {
        final int n = 5;
        final long expected = 120;

        assertEquals(expected, Factorial.run(n));
    }
}
