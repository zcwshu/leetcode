package com.zcw.offer;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:22 2020/8/12
 */
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        sb.toString();
        System.out.println(sb);
    }
}
