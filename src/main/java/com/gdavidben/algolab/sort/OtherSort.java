package com.gdavidben.algolab.sort;

import java.util.stream.IntStream;

public class OtherSort {

    private OtherSort() {
    }

    public static int[] sort(final int[] arr1, final int[] arr2) {
        final int total = arr1.length + arr2.length;

        int[] result = new int[total];
        int index = 0;

        for(int i = 0; i <= arr1.length-1; i++) {
            result[index] = arr1[i];
            index++;
        }

        for(int i = 0; i <= arr2.length -1; i++) {
            result[index] = arr2[i];
            index++;
        }

        for(int i = 0; i <= result.length - 1; i++) {
            for(int j = 0; j < result.length - 1 - i; j++) {
                if(result[j] > result[j+1]) {
                    int bigger = result[j];
                    result[j] = result[j+1];
                    result[j+1] = bigger;
                }
            }
        }

        return result;
    }

    public static int[] modernSort(final int[] arr1, final int[] arr2) {
        return IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().toArray();
    }
}
