package com.zcw.wangyi;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:07 2020/8/8
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long[] arr = new long[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextLong();
        }

        long count = 0;
        for (int i = 0; i < len; i++) {
            count += MaxPrimeSum(arr[i]);
        }
        System.out.println(count);
    }

    public static long MaxPrimeSum(long num){
        if(num == 1){
            return 0;
        }else if (num == 2 || num == 3){
            return 1;
        }else{
            if (num % 2 == 0){
                return num / 2;
            }else{
                return (num-1) / 2;
            }

        }
    }
}
