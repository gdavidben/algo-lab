package com.gdavidben.algolab.search;

public class LinearSearch {

    private LinearSearch() {
    }

    public static int search(final int[] arr, final int value) {

        for(int item : arr) {
            if(item == value) {
                return value;
            }
        }
        return -1;
    }
}
