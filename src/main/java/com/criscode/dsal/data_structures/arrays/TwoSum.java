package com.criscode.dsal.data_structures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) {
            return null;
        }

        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                return new int[]{temp.get(nums[i]), i};
            } else {
                temp.put(target - nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
    }

}
