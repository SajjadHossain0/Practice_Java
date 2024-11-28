package com.practicejava;

public class ReverseNum {

    public static int[] reverseNum(int[] nums){
        int start = 0; // starting index
        int end = nums.length - 1; // ending index

        while (start < end) { // starting index is smaller then ending index
            int temp = nums[start]; // store the starting value to a temp var
            nums[start] = nums[end]; // put the ending value to the starting index
            nums[end] = temp; // now put the temp value that was start at the beginning, put it in the ending index

            start++; // now increment the starting value
            end--; // and decrement the ending value
        }
        return nums;
    }
    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {6,3,7,9,0,5};

        print(reverseNum(nums));
    }

}
