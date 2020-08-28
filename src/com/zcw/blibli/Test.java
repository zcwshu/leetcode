package com.zcw.blibli;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:35 2020/8/13
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = sc.nextLine();

        System.out.println(match(s, x));

    }

    public static int match (String s ,String x){
        if (s == "" && x == ""){
            return 1;
        }else if (s.length() != x.length()){
            return -1;
        }else{
            String[] arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].startsWith(x)){
                    return i+1;
                }
            }
            return -1;
        }
    }
}
