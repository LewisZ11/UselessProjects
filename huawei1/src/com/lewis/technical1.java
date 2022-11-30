package com.lewis;

import java.util.*;


public class technical1 {

//    题目描述
//    给定一个只包含大写英文字母的字符串S，要求你给出对S重新排列的所有不相同的排列数。
//    如：S为ABA，则不同的排列有ABA、AAB、BAA三种。
//    输入
//    输入一个长度不超过10的字符串S，我们确保都是大写的。
//    输出
//    输出S重新排列的所有不相同的排列数（包含自己本身）。
//
//    输入样例 1
//    ABA
//    输出样例 1
//            3
//
//    输入样例 2
//    AABBCC
//    输出样例 2
//            90
//
//
//    输入样例 3
//    ABCDEFGHHA
//    输出样例 3
//            907200
    //public HashSet<String> set;

    public static int huawei2(String s) {
        int length = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }
        int fac = computefac(length);
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0 || arr[i] == 1) {
                continue;
            } else {
                fac = fac / computefac(arr[i]);
            }
        }
        return fac;

    }

    public static int computefac(int n) {
        if (n == 1) {
            return 1;
        }
        return n*computefac(n-1);
    }

    


    public static void main(String[] args) {

        String s = "ABCDEFGHHA";
        System.out.println(huawei2(s));

        //System.out.println(sum(2, 3));

    }
}
