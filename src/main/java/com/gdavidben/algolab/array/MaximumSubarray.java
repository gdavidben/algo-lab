package com.gdavidben.algolab.array;

/*
Maximum Subarray: https://leetcode.com/problems/maximum-subarray/description/

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:
    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.
 Example 3:
    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaximumSubarray {

    private MaximumSubarray() {
    }

    static int run(final int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        int largestSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // Verifies if it's better to start a new subarray or continue the existing one
            if(currentSum + num > num) {
                currentSum += num;
            } else {
                currentSum = num;
            }

            if(currentSum > largestSum) {
                largestSum = currentSum;
            }
        }
        return largestSum;
    }
}
