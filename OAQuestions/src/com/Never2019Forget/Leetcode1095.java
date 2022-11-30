package com.Never2019Forget;

public class Leetcode1095 {

    public static int findPeak(int[] arr) {
        int pos = 0;

        int left = 0, right = arr.length - 1;

        System.out.println(left);
        System.out.println(right);

        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((mid - 1 < 0 && arr[mid] < arr[mid+1]) || (arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1]) ) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,17,1};
        System.out.println(findPeak(arr));
    }
}
