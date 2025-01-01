package com.practicejava.code_challange.Day3;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int maxLength = 0, left = 0, right = 0;
        while(right < s.length()){
            char currentChar = s.charAt(right);

            if(map.containsKey(currentChar) && map.get(currentChar) >= left){
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, right);
            right++;
            maxLength = Math.max(maxLength, right - left);


        }
        return maxLength;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
    }
}
