package com.lewis.lzw02;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("成功运行");
    }
}
