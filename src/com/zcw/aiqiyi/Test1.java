package com.zcw.aiqiyi;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:11 2020/8/23
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(zeroNum(n));
    }
    public static int zeroNum(int n){
        int zeroCon = 0;
        BigInteger in = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            in = in.multiply(BigInteger.valueOf(i));
        }
        int zeroCou = 0;

        while(in.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
            in = in.divide(BigInteger.TEN);
            zeroCou++;
        }
        return zeroCou;
    }
}
