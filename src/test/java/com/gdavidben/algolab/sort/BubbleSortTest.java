package com.gdavidben.algolab.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BubbleSortTest {

    @Test
    void testBubbleSort() {
        int[] arr = {5, 6, 1, 3};
        int[] expected = {1, 3, 5, 6};
        int[] sorted = BubbleSort.sort(arr);

        for(int i = 0; i <arr.length; i++) {
            assertEquals(expected[i], sorted[i]);
        }
    }
}
