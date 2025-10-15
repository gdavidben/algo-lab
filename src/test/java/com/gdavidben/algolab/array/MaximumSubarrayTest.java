package com.gdavidben.algolab.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MaximumSubarrayTest {

    @Test
    void test() {
        final int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        final int expected = 6;

        assertEquals(expected, MaximumSubarray.run(nums));
    }

    @Test
    void test2() {
        final int[] nums = {5,4,-1,7,8};
        final int expected = 23;

        assertEquals(expected, MaximumSubarray.run(nums));
    }

    @Test
    void test3() {
        final int[] nums = {1};
        final int expected = 1;

        assertEquals(expected, MaximumSubarray.run(nums));
    }
}
