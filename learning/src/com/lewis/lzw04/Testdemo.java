package com.lewis.lzw04;

public class Testdemo {

    public static int s = 10;
    public static void main(String[] args) {
        s++;
        System.out.println(getSum(10,20));
        System.out.println(getSum(10.5, 20.5));
        // int b = getMoney(s);

        Fu f = new Zi();
        f.show();
        // 编译看左边，运行看左边 -》 成员变量 父类必须要有该名称的对象，执行时执行父类的成员变量
        // 编译看左边，运行看右边 -》 成员变量 父类必须要有该名称的方法，执行子类的方法
    }

    public int getMoney(int a) {
        return a;
    }

    // overload
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

}
