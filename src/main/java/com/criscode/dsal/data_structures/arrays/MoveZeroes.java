package com.criscode.dsal.data_structures.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes3(nums);
    }

    public void moveZeroes1(int[] nums) {
        int length = nums.length;
        int[] temp = new int[length];
        int j = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0)
                continue;
            temp[j] = nums[i];
            j++;
        }

        while (j < length) {
            temp[j] = 0;
            j++;
        }

        System.out.println(Arrays.toString(temp));
    }

    public void moveZeroes2(int[] nums) {
        int i = 0, j = 0;

        while (i < nums.length) {
            if (nums[i] == 0 && j < nums.length - 1) {
                int temp = nums[i];
                nums[i] = nums[j + 1];
                nums[j + 1] = temp;
                j++;
            } else {
                i++;
                j = i;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes3(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }


        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        System.out.println(Arrays.toString(nums));
    }

}
