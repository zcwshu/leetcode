package com.zcw.leet;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:20 2020/7/30
 */
public class IntergerBreak {
    public static void main(String[] args) {
        System.out.println(integerBreak(3));
    }
    public static int integerBreak(int n) {

        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
