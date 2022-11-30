package com.Never2019Forget;

public class CountingProblem {

    public static int minimizeXor(int num1, int num2) {

        String s1 = Integer.toBinaryString(num1);
        String s2 = Integer.toBinaryString(num2);

        System.out.println(s1);
        System.out.println(s2);

        int count1 = counting(s1);
        int count2 = counting(s2);

        if (count1 == count2) {
            return num1;
        }

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        if (sb1.length() < sb2.length()) {

            int diff = sb2.length() - sb1.length();
            int times = 0;

            while (times < diff) {

                sb1.insert(0, "0");
                times++;
            }

        } else if (sb1.length() > sb2.length()) {

            int diff = sb1.length() - sb2.length();
            int times = 0;

            while (times < diff) {

                sb2.insert(0, "0");
                times++;
            }
        }

        System.out.println(sb1);
        System.out.println(sb2);

        if (count1 > count2) {

            int res = 0;

            for (int i = 0; i < sb1.length(); i++) {

                if (sb1.charAt(i) == '1' && count2 > 0) {
                    res += Math.pow(2, sb1.length() - 1 - i);
                    count2--;
                }
//                else if (sb1.charAt(i) == '1' && count2 == 0) {
//                    res += Math.pow(2, sb1.length() - 1 - i);
//                }
            }

            return res;

        }

        if (count1 < count2) {

            int diff = count2 - count1;
            int res = 0;

            for (int i = sb1.length() - 1; i >= 0; i--) {

                if (sb1.charAt(i) == '0' && diff > 0) {
                    res += Math.pow(2, sb1.length() - 1 - i);
                    diff--;
                } else if (sb1.charAt(i) == '1') {
                    res += Math.pow(2, sb1.length() - 1 - i);
                }
            }

            return res;

        }

        return 0;
    }

    public static int counting(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                result++;
            }

        }

        return result;
    }



    public static int deleteString(String s) {

        StringBuilder sb = new StringBuilder(s);
        int operations = 0;

        while (sb.length() > 0 && exists(sb, 0)) {
            int pos = position(sb);
            sb.delete(0, pos);
            if (sb.length() > 0) {
                System.out.println(sb);
            } else {
                System.out.println("liuziwei");
            }

            operations++;

        }

        return sb.length() > 0 ? operations + 1 : operations;

    }

    public static boolean exists(StringBuilder sb, int startPos) {

        int length = (sb.length() - startPos)/ 2;

        for (int i = startPos + 1; i <= startPos + length; i++) {

            if (sb.substring(startPos, i).equals(sb.substring(i, 2*i - startPos))) {
                return true;
            }

        }

        return false;
    }


    public static int position(StringBuilder sb) {

        int length = sb.length() / 2;

        for (int i = 1; i <= length; i++) {

            if (sb.substring(0, i).equals(sb.substring(i, 2*i))) {
                if (exists(sb, i)) {
                    return i;
                }
            }

        }

        for (int i = 1; i <= length; i++) {

            if (sb.substring(0, i).equals(sb.substring(i, 2*i))) {

                    return i;
                }
        }



        return -1;


    }

    public static void main(String[] args) {

        // System.out.println(minimizeXor(25,72));

        int a = 1;
        int b = deleteString("aaabaab");
        System.out.println(deleteString("aaabaab"));

    }
}
