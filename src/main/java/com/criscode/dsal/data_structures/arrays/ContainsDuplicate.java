package com.criscode.dsal.data_structures.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {

        if (nums.length <= 1) {
            return false;
        }

        Map<Integer, Integer> temp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                return true;
            } else {
                temp.put(nums[i], 1);
            }
        }
        return false;
    }

}
