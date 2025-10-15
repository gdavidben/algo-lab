package com.gdavidben.algolab.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MoveZerosTest {

    @Test
    void test() {
        final int[] nums = {0,1,0,3,12};
        final int[] expected = {1,3,12,0,0};

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], MoveZeroes.run(nums)[i]);
        }
    }
}
