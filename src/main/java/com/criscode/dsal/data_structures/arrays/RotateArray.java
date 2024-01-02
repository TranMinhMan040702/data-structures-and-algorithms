package com.criscode.dsal.data_structures.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate3(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate1(int[] nums, int k) {
        while (k > 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;

        while (k > n) {
            k = k - n;
        }

        int[] temp = new int[n - k];

        for (int i = 0; i < n - k; i++) {
            temp[i] = nums[i];
        }

        for (int i = n - k; i < n; i++) {
            nums[i - n + k] = nums[i];
        }

        for (int i = 0; i < n - k; i++) {
            nums[i + k] = temp[i];
        }
    }

    public void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverseArray(nums, 0, n - k - 1);
        reverseArray(nums, n - k, n - 1);
        reverseArray(nums, 0, n - 1);
    }

    public void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
