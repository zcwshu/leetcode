package com.zcw.sangfor;

import java.util.Map;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:40 2020/8/25
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {4,3,5,10,12};
        int temp = 0;
        int res = 10000;
        for (int i = 0; i < arr.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 += arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                sum2 += arr[j];
            }
            temp = Math.max(sum1,sum2);
            res = Math.min(res,temp);
        }
        System.out.println(res);
    }
}
