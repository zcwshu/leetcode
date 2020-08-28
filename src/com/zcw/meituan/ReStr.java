package com.zcw.meituan;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:12 2020/8/15
 */
public class ReStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(returnStr(str1, str2));
    }
    static String returnStr(String str1,String str2){
        int min = 0;
        int max = 0;
        boolean[] temp = new boolean[str1.length()];
        if (str2 == ""){
            return str1;
        }else{
            for (int i = 0; i < str2.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(j) == str2.charAt(i) && temp[j] == false){
                        temp[j] = true;         //匹配过置为true
                        break;
                    }
                    if (j == str1.length() - 1 && str1.charAt(j) != str2.charAt(i)){//str2中任一个在str1中匹配不到,返回空串
                        return "";
                    }
                }
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            if (temp[i]){
                min = i;
                break;
            }
        }
        for (int i = str1.length()-1; i >= 0; i--) {
            if (temp[i]){
                max = i;
                break;
            }
        }

        return str1.substring(min,max+1);
    }
}
