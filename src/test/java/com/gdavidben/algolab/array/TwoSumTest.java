package com.gdavidben.algolab.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TwoSumTest {

    @Test
    void test() {
        final int[] nums = {2, 7, 11, 15};
        final int[] expected = {0 ,1};
        final int target = 9;

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], TwoSum.run(nums, target)[i]);
        }
    }

    @Test
    void test2() {
        final int[] nums = {3,2,4};
        final int[] expected = {1,2};
        final int target = 6;

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], TwoSum.run(nums, target)[i]);
        }
    }
}
