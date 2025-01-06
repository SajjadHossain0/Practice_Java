package com.practicejava.code_challange.HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){ //convert array to character and run loop
            if(!map.containsKey(c)){ // if map dont contains the current character then add to count 1
                map.put(c, 1);
            }
            else{
                map.put(c, map.get(c)+1); // if map contains the current charaacter already then current count + 1
            }
        }

// now that 1st string in my map now check 2nd string
        for(char c : t.toCharArray()){

            if(!map.containsKey(c)){ // if and char of 2nd string not in my map or the 1st string then return false
                return false;
            }
            map.put(c, map.get(c)-1); // substract the count
            if(map.get(c)==0){
                map.remove(c);
            }
        }

        return map.isEmpty();
    }
}

/*
242. Valid Anagram
Attempted
Easy
Topics
Companies
Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/