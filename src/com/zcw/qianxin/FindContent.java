package com.zcw.qianxin;

import java.util.*;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:37 2020/8/1
 */
public class FindContent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int N = sc.nextInt();
        int temp = 0;
        List<String> list = new ArrayList<>();
        while(temp == N){
            list.add(sc.nextLine());
            temp++;
        }


    }
    public static int ZeroOne(int V,int N,int[] weight,int[] value){
        int[] dp = new int[V+1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = V; j >= weight[i-1] ; j++) {
                dp[j] = Math.max(dp[j - weight[i - 1]] + value[i-1],dp[j]);
            }
        }
        return dp[V];
    }
}
