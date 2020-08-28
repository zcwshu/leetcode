package com.zcw.sortandsearch;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:00 2020/8/5
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,4,6,8,7,5,2};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr,j,j-1);
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
