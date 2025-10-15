package com.gdavidben.algolab.sort;


import java.util.Arrays;

public class MergeSort {

    private MergeSort() {
    }

    public static int[] run(final int[] arr) {
        return mergeSort(arr);
    }

    private static int[] mergeSort(final int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        final int middle = arr.length / 2;
        final int[] left = Arrays.copyOfRange(arr, 0, middle);
        final int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[i++] = left[leftIndex];
                leftIndex++;
            } else {
                result[i++] = right[rightIndex];
                rightIndex++;
            }
        }

        while (leftIndex < left.length) {
            result[i++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[i++] = right[rightIndex++];
        }

        return result;
    }
}
