package com.zcw.meituan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:56 2020/8/15
 */
public class Arrfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] res = new String[n*2];

        for (int i = 0; i < n; i++) {
            res[i*2] = "男生"+i+1;
        }
        for (int i = 0; i < n; i++) {
            res[i*2 + 1] = "女生"+i+1;
        }
        for (String re : res) {
            System.out.println(re);
        }
    }
}
