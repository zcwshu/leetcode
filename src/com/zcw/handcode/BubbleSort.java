package com.zcw.handcode;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:38 2020/8/18
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,51,7,4,87,6,9};
        sort(arr);
        print(arr);
    }
    static int[] sort(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr,int j,int i){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
