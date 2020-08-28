package com.zcw.wangyi;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:34 2020/8/8
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
}
