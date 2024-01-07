package com.criscode.dsal.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public List<Integer> mergeSort(List<Integer> nums) {
        if (nums.size() == 1) {
            return nums;
        }

        List<Integer> left = nums.subList(0, nums.size() / 2);
        List<Integer> right = nums.subList(nums.size() / 2, nums.size());
        return merge(mergeSort(left), mergeSort(right));
    }

    private ArrayList<Integer> merge(List<Integer> left, List<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex));
            rightIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList
                (99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)
        );


        MergeSort mergeSort = new MergeSort();
        System.out.println(mergeSort.mergeSort(nums));
    }

}
