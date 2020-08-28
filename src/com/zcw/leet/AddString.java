package com.zcw.leet;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 22:00 2020/8/3
 */
public class AddString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        int L1 = num1.length()-1;
        int L2 = num2.length()-1;
        int add = 0;

        StringBuffer ans = new StringBuffer();
        while (L1 >= 0 || L2 >= 0 || add != 0) {
            int x = L1 >= 0 ? num1.charAt(L1) - '0' : 0;
            int y = L2 >= 0 ? num2.charAt(L2) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            L1--;
            L2--;
        }
        ans.reverse();

        System.out.println(ans.toString());
    }
}
