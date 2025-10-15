package com.gdavidben.algolab.sort;

public class BubbleSort {

    private BubbleSort() {
    }

    public static int[] sort(final int[] arr) {
        int n = arr.length;

        // every iteration ensures that the highest value is in the end of the array
        for (int i = 0; i < n - 1; i++) {

            // iterate each pair value, excluding the ones that already are in the right place (last ones).
            for (int j = 0; j < n - 1 - i; j++) {
                int positionI = arr[j];
                int positionJ = arr[j+1];

                if(positionI > positionJ) {
                    arr[j] = positionJ;
                    arr[j+1] = positionI;
                }
            }
        }

        return arr;
    }
}
