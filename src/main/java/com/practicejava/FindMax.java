package com.practicejava;// Problem: Find Missing Number

public class FindMax {


    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5};
        int[] nums2 = {-3, -5, -7, -2, -8};

        print(nums);
        System.out.println("");
        System.out.println("Max number is : " + findMax(nums));

        print(nums2);
        System.out.println("");
        System.out.println("Max number is : " + findMax(nums2));
    }
}
