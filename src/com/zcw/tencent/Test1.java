package com.zcw.tencent;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:03 2020/8/23
 */
public class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (i+1 != k){
                System.out.print(temp + " ");
            }
        }
    }
}

