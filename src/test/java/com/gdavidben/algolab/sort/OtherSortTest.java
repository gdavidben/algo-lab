package com.gdavidben.algolab.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class OtherSortTest {

    @Test
    void testMergeSort() {
        int[] arr = {5, 6, 1, 3};
        int[] arr2 = {2, 8, 9, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 8, 9};
        int[] sorted = OtherSort.sort(arr,arr2);

        for(int i = 0; i <arr.length; i++) {
            assertEquals(expected[i], sorted[i]);
        }
    }

    @Test
    void testModernMergeSort() {
        int[] arr = {5, 6, 1, 3};
        int[] arr2 = {2, 8, 9, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 8, 9};
        int[] sorted = OtherSort.modernSort(arr,arr2);

        for(int i = 0; i <arr.length; i++) {
            assertEquals(expected[i], sorted[i]);
        }
    }
}
