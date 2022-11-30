package com.Never2019Forget;

public class PeakValue {


    public static int findPeakValue(int[] arr) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid == 0) {
                left = mid + 1;
                continue;
            }

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            } else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                left = mid + 1;
            } else if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) {
                right = mid - 1;
            }

        }

        return -1;


    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,9,7,6,4};

        System.out.println(findPeakValue(arr));
        System.out.println(arr[findPeakValue(arr)]);
    }
}
