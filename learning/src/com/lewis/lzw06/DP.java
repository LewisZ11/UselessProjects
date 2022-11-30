package com.lewis.lzw06;

public class DP {



    public static int helper(int n) {

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i-2], dp[i-3]) + 1;
        }

        return dp[n];


    }
    public static void main(String[] args) {
        System.out.println(helper(10));
    }
}
