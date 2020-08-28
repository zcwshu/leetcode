package com.zcw.leet.tanxin;

import java.util.Arrays;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:29 2020/7/31
 * 分饼干
 */
public class FindContentChildren {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,2};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int sIndex = 0;
        int gIndex = 0;
        while(gIndex < g.length && sIndex < s.length){
            if (g[gIndex] <= s[sIndex]){
                res++;
                gIndex++;
                sIndex++;
            }else{
                sIndex++;
            }
        }
        return res;
    }
}
