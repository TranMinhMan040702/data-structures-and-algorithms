package com.criscode.dsal.data_structures.hash_tables;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        //        int[] nums = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        int[] nums = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        FirstRecurringCharacter firstRecurringCharacter = new FirstRecurringCharacter();
        System.out.println(firstRecurringCharacter.solution(nums));
    }


    public int solution(int[] nums) {
        Map<Integer, Integer> temp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                return nums[i];
            } else {
                temp.put(nums[i], 1);
            }
        }

        throw new RuntimeException("Not recurring character");
    }

}
