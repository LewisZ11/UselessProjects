package com.company.lewis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearch bs = new BinarySearch();
        int[] arr = new int[] {1,2,2,2,3,5};
        //System.out.println(bs.binarysearch(arr, 2));
        System.out.println(bs.binarysearchleft(arr, 2)); // 1
        System.out.println(bs.binarysearchright(arr, 2)); // 3
    }
}
