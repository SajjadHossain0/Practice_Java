package com.practicejava;

public class MissingNum {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5};

        print(nums);
        System.out.println("");
        System.out.println("Missing number is : " + findMissingNumber(nums));
    }
}
