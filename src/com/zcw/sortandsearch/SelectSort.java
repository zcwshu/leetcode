package com.zcw.sortandsearch;

/**
 * @Author: AndrewBar
 * @Date: Created in 13:02 2020/8/4
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,2,7,3,1,8,9,5,6};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr){  //选择
        for (int j = 0; j < arr.length-1; j++) {
            int minPos = j;
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < arr[minPos]){
                    swap(arr,i,minPos);
                }
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
