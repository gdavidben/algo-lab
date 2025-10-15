package com.gdavidben.algolab.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RotateArrayTest {

    @Test
    void test() {
        final int[] nums = {1,2,3,4,5,6,7};
        final int[] expected = {5,6,7,1,2,3,4};
        final int k = 3;

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], RotateArrray.run(nums, k)[i]);
        }
    }

    @Test
    void test2() {
        final int[] nums = {-1,-100,3,99};
        final int[] expected = {3,99,-1,-100};
        final int k = 2;

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], RotateArrray.run(nums, k)[i]);
        }
    }

}
