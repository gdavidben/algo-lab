package com.gdavidben.algolab.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SelectionSortTest {

    @Test
    void test() {
        int[] arr = {5, 6, 1, 3};
        int[] expected = {1, 3, 5, 6};
        int[] sorted = SelectionSort.run(arr);

        for(int i = 0; i <arr.length; i++) {
            assertEquals(expected[i], sorted[i]);
        }
    }
}
