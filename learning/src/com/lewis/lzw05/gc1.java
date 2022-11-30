package com.lewis.lzw05;

import java.util.ArrayList;
import java.util.List;

public class gc1 {

    public static int a = 30;
    public static void helper() {
        int a = 10; //

        System.out.println("helperfunc");
    }
    public static void main(String[] args) {

        String a = "hello";
        // "hello" 常量 ，常量地址赋给a
        a += "asp";


        // gc.helper();
        helper();

        System.out.println("ssasasas");
    }
}
