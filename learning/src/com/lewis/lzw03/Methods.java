package com.lewis.lzw03;

public class Methods extends AbstractClass{
    public static int getSum(int a,int b){
        System.out.println("两个int参数");
        return a+b;
    }
    public static int getSum(int a,int b,int c){
        System.out.println("三个int参数");
        return a+b+c;
    }
    public static double getSum(double a,double b){
        System.out.println("两个double参数");
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1,2));
    }

    @Override
    public void method1() {
        System.out.println("daidai");
    }

    @Override
    public void method2() {
        System.out.println("dsds");
    }
}
