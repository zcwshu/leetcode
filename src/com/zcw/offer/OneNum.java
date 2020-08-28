package com.zcw.offer;

/**
 * @Author: AndrewBar
 * @Date: Created in 12:45 2020/8/18
 */
public class OneNum {

    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
            System.out.println(n);
        }
    }
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
