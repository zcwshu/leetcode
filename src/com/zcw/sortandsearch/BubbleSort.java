package com.zcw.sortandsearch;

/**
 * @Author: AndrewBar
 * @Date: Created in 12:16 2020/8/4
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,4,6,8,7,5,2};
        sort(arr);
        print(arr);
    }
    static void sort(int[] arr){ //冒泡,大的数往后放
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
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
