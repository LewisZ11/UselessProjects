package com.lewis.lzw03;

public class learningJavaDemo1 {


    int a = 50;

    public static void main(String[] args) {
        // constant
        // int a, b, c = 400;
        //

        // 注意
        float f = 2.3F;
        char c = '0' + '1';
        // System.out.print(c);
        helper1();
        learningJava lj = new learningJava(23,23);
        System.out.println(lj.age);
        String s1 = "abc";
        System.out.println(s1);
        helper2(s1);
        System.out.println(s1);
    }

    public static void helper2(String s1) {
        s1 += "abc";

    }

    public static void helper1() {

        int m = 99;
        int n = 100;
        System.out.println(m > n & m > n++);
        System.out.println("n = " + n);

        int k = 99;
        int f = 100;
        System.out.println(k > f && k > f++); //false
        System.out.println("f = " + f); //100

    }
}
