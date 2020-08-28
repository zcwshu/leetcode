package com.zcw.leet.pack;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:32 2020/8/3
 */
public class ZeroOne {
    public static void main(String[] args) {

        String str = "123456";
        int l = str.length() -1;
        int n = str.charAt(l) - '0';
        int m = str.charAt(1) - '0';
        System.out.println(n);
        System.out.println(m);
        System.out.println(str.length());

    }
}
