package com.zcw.meituan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: AndrewBar
 * @Date: Created in 11:46 2020/8/15
 */
public class DeleteStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String arr = sc.nextLine();
            System.out.println(deleteStr(arr));
        }
    }

    static String deleteStr(String str) {
        //StringBuilder res = new StringBuilder();
        String res = "";
        int min = 0;
        int count = 0;
        if (str.length() == 1) {
            return str;
        } else {
            char[] c = str.toCharArray();
            for (min = 0; min < c.length - 1; min++) {
                if (c[min] == c[min + 1]) {
                    count++;
                } else if (count == 0)
                    res += c[min];
                else
                    count = 0;
            }
            if (res == "") {
                return "no";
            } else {
                return res;
            }
        }
    }
}
