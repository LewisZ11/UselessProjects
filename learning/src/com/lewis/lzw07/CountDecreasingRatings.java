package com.lewis.lzw07;

// I can use dp solution to solve this problem
// dp[i] = 
// the solution to this problem is sum of all dp[i] in an array

// each one element subarray could be considered as a consective decreasing subarray
// dp[i] = 1
// dp[0] = 1
// also
// if nums[i] = nums[i-1] - 1
// all the consequtive decereasing subarrays ending at position i-1 can be used to generate new consequtive deceewasing subarrays ending at position i
// two elements to denote instead of a whole array
// pre cur sum


public class CountDecreasingRatings {

    public static long getValue(int[] arr) {

        long result = 0;
        int start = 0, end = 1;
        while (end < arr.length) {

            if (arr[end - 1] - arr[end] == 1) {
                result += end - start;
            } else {
                start = end;
            }
            end++;

        }

        return result + arr.length;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {5,4,4,2,1};

        System.out.println(getValue(arr));
    }
}
