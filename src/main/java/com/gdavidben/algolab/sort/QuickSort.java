package com.gdavidben.algolab.sort;


public class QuickSort {

    private QuickSort() {
    }

    public static int[] run(final int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private static int[] quickSort(final int[] arr, int left, int right) {
        int partitionIndex;
        int pivot;

        if (left < right) {
            pivot = right;
            partitionIndex = partition(arr, pivot, left, right);

            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }

        return arr;
    }

    private static int partition(final int[] arr, int pivot, int left, int right) {
        int pivotValue = arr[pivot];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, right, partitionIndex);

        return partitionIndex;
    }

    private static void swap(final int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
