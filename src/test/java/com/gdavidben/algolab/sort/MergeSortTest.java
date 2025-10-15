package com.gdavidben.algolab.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MergeSortTest {

    @Test
    void test() {
        int[] arr = {5, 6, 1, 3};
        int[] expected = {1, 3, 5, 6};
        int[] sorted = MergeSort.run(arr);

        for(int i = 0; i <arr.length; i++) {
            assertEquals(expected[i], sorted[i]);
        }
    }
}
