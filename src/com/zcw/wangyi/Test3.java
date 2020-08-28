package com.zcw.wangyi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:43 2020/8/8
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[N];  //每组测试数据长度
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(pao(arr));
        }
    }

    public static int pao(int[] arr){
        Arrays.sort(arr);

        int value = calSum(arr) / 2;
        int[] dp = new int[arr.length +1];

        dp[0] = arr[arr.length-1];

        for (int i = arr.length-1; i > 0; i--) {
            dp[i] = Math.max(dp[i] , dp[i - 1]);
        }

        return dp[arr.length + 1];
    }

    static int calSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
