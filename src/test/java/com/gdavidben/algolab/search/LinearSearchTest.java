package com.gdavidben.algolab.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LinearSearchTest {

    @Test
    void testSearch() {
        int[] arr = {5, 6, 1, 3};
        int expected = 1;
        int result = LinearSearch.search(arr, 1);

        assertEquals(expected, result);
    }
}
