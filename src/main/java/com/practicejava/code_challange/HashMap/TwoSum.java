package com.practicejava.code_challange.HashMap;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){

                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        TwoSum ts = new TwoSum();

        int[] nums = {2, 4, 7, 9, 0, 6};
        int target = 9;

        int[] result = ts.twoSum(nums, target);
        System.out.println(result);

    }


}
