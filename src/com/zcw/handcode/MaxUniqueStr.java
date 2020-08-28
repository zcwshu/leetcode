package com.zcw.handcode;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:57 2020/8/13
 */
//最大不同的字符串
public class MaxUniqueStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  //输入字符串
        System.out.println(findMaxUniqueStr(str));
    }
    static int findMaxUniqueStr(String str){
        int left = 0;
        int right;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (right = 0;  right< str.length(); right++) {
            char c = str.charAt(right);
            while (set.contains(c)){
                set.remove(str.charAt(left++));  //先用再++.可以从最右边开始删除
            }
            set.add(c);
            max = Math.max(max,set.size());
        }
        return max;
    }
}
