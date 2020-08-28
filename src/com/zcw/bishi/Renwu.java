package com.zcw.bishi;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:49 2020/7/29
 */
public class Renwu {
    public static void main(String[] args) {
        System.out.println(renwu());
    }
    public static int renwu(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int n = Integer.parseInt(arr[0]);//可分配人数
        int m = Integer.parseInt(arr[1]);//任务数

        int count = 0;
        int temp = 0;
        int cout = 0;

        for (int i = 0; i < n; i++) {
            String s2 = sc.nextLine();
            String[] arr2 = s2.split(" ");
            for (int j = 1; j < arr2.length; j++) {
                temp += Integer.parseInt(arr2[j]);
            }
            cout = Math.max(cout,temp);
            count += Integer.parseInt(arr2[0]);
        }
        if (count < m){
            return -1;
        }else{
            return cout;
        }
    }
}
