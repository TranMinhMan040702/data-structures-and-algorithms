package com.criscode.dsal.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public void solution(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{99, 44, 2, 1, 5, 63, 87, 283, 4, 0};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.solution(nums);
        System.out.println(Arrays.toString(nums));
    }

}
