package com.zcw.meituan;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:17 2020/8/15
 */
public class Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] strings = new String[n][2];
        String s1 = "";
        for (int i = 0; i < n; i++) {
            s1 = sc2.nextLine();
            String[] s = s1.split(" ");
            strings[i][0] = s[0];
            strings[i][1] = s[1];
        }

        int i = 0;
        int j = 0;
        int ans = 0;

        while (i < strings.length){
            if (strings[i][0].equals(strings[j][1])){
                i = j + 1;
                ans++;
            }
            j++;
        }
        System.out.println(ans);
    }
}
