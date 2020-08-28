package com.zcw.shopee;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:05 2020/8/19
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(del(str));
    }
    public static String del(String str){
        char[] c = str.toCharArray();
        if (str == "" || str.length() < 3){
            return str;
        }
        StringBuffer sb = new StringBuffer();

        while (true){
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (i < str.length()-2){
                    if ((str.charAt(i) == 'a' || str.charAt(i) == 'A') && (str.charAt(i+1) == 'b' || str.charAt(i+1) == 'B')&& (str.charAt(i+2) == 'c' || str.charAt(i+2) == 'C')){
                        i = i + 2;
                        count++;
                        //str.charAt()
                        continue;
                    }else{
                        sb = sb.append(c[i]);
                    }
                }else{
                    sb = sb.append(c[i]);
                }
            }
            if (count == 0)
                break;
        }
        return sb.toString();
    }
}
