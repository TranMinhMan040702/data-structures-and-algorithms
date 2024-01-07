package com.criscode.dsal.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public void solution(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{99, 44, 2, 1, 5, 63, 87, 283, 4, 0};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.solution(nums);
        System.out.println(Arrays.toString(nums));
    }

}
