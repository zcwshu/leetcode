package com.zcw.leet;

import java.util.Arrays;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:20 2020/7/27
 */
public class IsSubsequence {
    public static void main(String[] args) {
        isSubsequence();
    }

    public static boolean isSubsequence(){
        boolean flag = true;
        String s = "axc";
        String t = "ahbgdc";
        char [] s1 = s.toCharArray();
        char [] s2 = t.toCharArray();
        int[] arr = new int[s1.length];
        int index = 0;
        int i = 0;
        int n = s1.length;
        for ( i = 0; i < s.length(); i++) {
            for (int j = index; j < t.length(); j++) {
                while(s1[i]==s2[j]){
                    index = j + 1;
                    arr[i] = 1;
                    break;
                }
            }
            arr[i] = -1;
        }
        String ss = Arrays.toString(arr);

        if (s.contains("-1")){
            flag = false;
        }
        return flag;
    }
}
