package com.Mathworks;

import java.util.*;

public class IntegerFlip {

    public static void flip(int n) {

        double number = (double) (1.0 / n);
        // System.out.println(number);
        String str = Double.toString(number);
        System.out.println(str);

    }

    static String f(int m,int n){
        Set<Integer> list = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        StringBuilder sb1 = new StringBuilder();
        m = m % n;
        sb.append('0');
        sb.append('.');
        int t = 0;
        while(m!=0) {

            if(list.contains(m)){
                int i = 2;
                for(;i<sb.length();i++){
                    if(sb.charAt(i)-'0' == m*10/n){
                        break;
                    }
                }

                int length = sb.length();

                sb.append(' ');


                for (int idx = i; idx < length; idx++) {
                    sb.append(sb.charAt(idx));
                }

                // System.out.println(sb.toString());

                // sb.delete(0, i);
                break;

            } else {

                list.add(m);//转入余数
                sb.append(m*10/n);//装入商的值



            }
            t++;
            m=m*10%n;
        }

        if (m == 0) {
            sb.append('0');
            sb.append(' ');
            sb.append('0');
        }

        // sb.append('.');

        return sb.toString();
    }

    public static String getResult(int a,int b){
        if(a%b==0)	return String.valueOf(a/b);
        String decimal ="";
        List<Integer> temp = new LinkedList<Integer>();
        a = a % b;
        loop:
        while(a!=0){
            if(!temp.contains(a))	temp.add(a);
            else
                for(int i=0;i<temp.size();i++)
                    if(temp.get(i)==a) {
                        decimal = decimal + " " +decimal.substring(i,decimal.length());
                        break loop;
                    }
            decimal += a*10/b;
            a = (a*10)%b;
        }

        if (a == 0) {
            decimal = decimal + "0  0";
        }

        return String.valueOf(a/b)+"."+decimal;
    }


    public static void helper(int m, int n) {
        int t = 0;
        StringBuffer sb = new StringBuffer();
        // StringBuilder sb1 = new StringBuilder();
        m = m % n;
        sb.append('0');
        sb.append('.');

        while(m!=0 && t < 80) {

                sb.append(m*10/n);//装入商的值
                t++;
                m=m*10%n;

            }

        System.out.println(sb.toString());
    }

        // sb.append('.');




    public static void main(String[] args) {

        // flip(22);
        helper(1, 22);
        System.out.println(getResult(1, 21));
    }
}
