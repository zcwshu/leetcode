package com.zcw.kdxf;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:18 2020/7/31
 */
public class KeDaXunFei3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        s.replaceAll(" ","");
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean negativeUsed = false;
        for (char c : chars) {
            if (sb.length() == 0 && c=='-' && !negativeUsed){
                negativeUsed = true;
                sb.append(c);
            }
            if (c >='0' && c <='9'){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
