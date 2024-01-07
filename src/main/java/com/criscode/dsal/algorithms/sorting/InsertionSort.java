package com.criscode.dsal.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public void solution(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) <= nums.get(0)) {
                nums.add(0, nums.remove(i));
            } else {
                if (nums.get(i) < nums.get(i - 1)) {
                    for (int j = 1; j < i; j++) {
                        if (nums.get(i) < nums.get(j)) {
                            nums.add(j, nums.remove(i));
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList
                (99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)
        );
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.solution(nums);
        System.out.println(nums);
    }

}
