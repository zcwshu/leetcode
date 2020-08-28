package com.zcw.sortandsearch;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:04 2020/8/20
 */
public class ceshi {
    public static void main(String[] args) {
        int[][] arr = {{0}};
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }
        String s = sc.nextLine();
        if (set.contains(s)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
