package com.zcw.sortandsearch;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:41 2020/8/6
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {2,1,0,5,4};
        int min=0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 0){
                count++;
                continue;
            }
            else{
                min = arr[i];
                max = arr[i];
                if (min > arr[i + 1]){
                    swap(arr,min,i+1);
                }else if (max < arr[i + 1]){
                    swap(arr,min,i+1);
                }
                continue;
            }
        }
        int res = max - min + count;
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(res);
        if (res <= 4){
            System.out.println("lucky");
        }else{
            System.out.println("god");
        }
    }
    static void swap(int[] arr,int min,int j){
        int temp = min;
        min = arr[j];
        arr[j] = temp;
    }
}
