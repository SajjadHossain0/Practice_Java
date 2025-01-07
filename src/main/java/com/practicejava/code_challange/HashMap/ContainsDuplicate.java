package com.practicejava.code_challange.HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                if (!map.containsKey(num)) { // check is there any num already, if not then put the element
                    map.put(num, 1);
                } else {
                    map.put(num, map.get(num) + 1); //now that it detects that element already tin the map, return true
                    return true;
                }
            }
            return false;
        }
    }
}
