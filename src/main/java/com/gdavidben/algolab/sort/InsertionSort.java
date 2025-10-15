package com.gdavidben.algolab.sort;

public class InsertionSort {

    private InsertionSort() {
    }

    public static int[] run(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j-1] > arr[j]) {
                    int max = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = max;
                }
            }
        }
        return arr;
    }
}
