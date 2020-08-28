package com.zcw.kdxf;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:02 2020/7/31
 */
public class KeDaXunFei1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])){
                sb.append(arr[i]);
            }
        }
        Long l = Long.parseLong(sb.toString());
        System.out.println(l);
    }
}
