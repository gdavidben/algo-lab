package com.gdavidben.algolab.sort;

public class SelectionSort {

    private SelectionSort() {
    }

    public static int[] run(final int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int min = i;
            int temp = arr[i];

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
