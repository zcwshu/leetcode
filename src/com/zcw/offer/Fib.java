package com.zcw.offer;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 21:59 2020/8/15
 */
public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        int res = 0;
        int f1 = 1;
        int f2 = 1;
        if (n == 1){
            return 1;
        }else{
            for (int i = 2; i <= n; i++) {
                res = (f1 + f2) % 1000000007;
                f1 = f2;
                f2 = res;
            }
            return res;
        }
    }
}
