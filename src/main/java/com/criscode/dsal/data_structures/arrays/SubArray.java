package com.criscode.dsal.data_structures.arrays;

import java.text.MessageFormat;


// Reference: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/ (Kadane’s Algorithm)
public class SubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, -11, -3, -4, -1, -2, -11, -5, -4};
        SubArray subArray = new SubArray();
        subArray.maxSubArrayWithPrint(nums);
    }

    public int maxSubArray(int[] nums) {
        int length = nums.length;

        if (length == 1) {
            return nums[0];
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // Set currentSum = 0 vì:
            // Nếu không set currentSum = 0
            // thì khi cộng với phần tử tiếp thu sẽ < hơn một lượng currentSum
            if (currentSum < 0) {
                currentSum = 0;
            }
        }


        return maxSum;
    }

    public void maxSubArrayWithPrint(int[] nums) {
        int length = nums.length;
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        int start = 0, end = 0;
        int s = 0;

        for (int i = 0; i < length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = s;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                s = i + 1;
            }
        }

        System.out.println(
                MessageFormat.format("Maximum Sum SubArray from {0} to {1}", start, end));
    }

}
