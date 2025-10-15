package com.gdavidben.algolab.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class InsertionSortTest {

    @Test
    void test() {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] sorted = InsertionSort.run(arr);

        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i], sorted[i]);
        }
    }
}
