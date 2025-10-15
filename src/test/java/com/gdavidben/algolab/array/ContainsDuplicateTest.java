package com.gdavidben.algolab.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ContainsDuplicateTest {

    @Test
    void test() {
        final int[] nums = {1, 2, 3, 1};
        final boolean expected = true;

        assertEquals(expected, ContainsDuplicate.run(nums));
    }

    @Test
    void test2() {
        final int[] nums = {1,2,3,4};
        final boolean expected = false;

        assertEquals(expected, ContainsDuplicate.run(nums));
    }

    @Test
    void test3() {
        final int[] nums = {1,1,1,3,3,4,3,2,4,2};
        final boolean expected = true;

        assertEquals(expected, ContainsDuplicate.run(nums));
    }
}
