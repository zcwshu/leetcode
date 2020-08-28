package com.zcw.tencent;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:21 2020/8/23
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int Q = sc.nextInt();
        int[] arrL = new int[Q];
        int[] arrR = new int[Q];
        for (int i = 0; i < Q; i++) {
            arrL[i] = sc.nextInt();
            arrR[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(help(s, arrL[i] - 1, arrR[i]));
        }
    }

    public static int help(String s,int L,int R){
        s = s.substring(L,R);
        int len = s.length();
        boolean[][] flag = new boolean[len][len];
        for (int i = 0; i < s.length(); i++) {
            fromCenter(s,flag,i,i);
            fromCenter(s,flag,i,i+1);
        }
        int[] dp = new int[len];
        for (int i = 0; i < s.length(); i++) {
            if (flag[0][i]){
                dp[i] = 0;
            }else{
                dp[i] = dp[i-1] + 1;
                for (int j = 0; j < i; j++) {
                    if (flag[j+1][i]){
                        dp[i] = Math.min(dp[i],dp[j] + 1);
                    }
                }
            }
        }
        return dp[len - 1] +1;
    }

    static void fromCenter(String s,boolean[][] flag,int i,int j){
        while (i >=0 && j< s.length() && s.charAt(i) == s.charAt(j)){
            flag[i][j] = true;
            i--;
            j++;
        }
    }
}
