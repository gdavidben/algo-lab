package com.gdavidben.algolab.array;

/*
Move Zeroes: https://leetcode.com/problems/move-zeroes/description/

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
    Input: nums = [0,1,0,3,12,0]
    Output: [1,3,12,0,0]
Example 2:
    Input: nums = [0]
    Output: [0]
 */
public class MoveZeroes {

    private MoveZeroes() {
    }

    static int[] run(final int[] nums) {
        int insertPos = 0;

        for(int num : nums) {
            if(num != 0) {
                nums[insertPos++] = num;
            }
        }

        while(insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

        return nums;
    }
}
