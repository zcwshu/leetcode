package com.zcw.jingdong;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:13 2020/8/6
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(String.format("%.4f", getSum(n)));
    }

    public static float getSum(int n) {
        float result = 0f;
        float son = 1f;
        float sum = 5f;
        while (n > 0) {
            result += son / sum - son / (sum + 5);
            sum += 10;
            n--;
        }
        return result;
    }
}
