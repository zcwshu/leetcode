package com.zcw.sortandsearch;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:38 2020/8/5
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,4,6,8,7,5,2};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr){ //希尔
        //int h = 4;
        for (int h = 4; h > 0 ; h /= 2) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j > h -1; j-=h) {
                    if (arr[j] < arr[j - h])
                        swap(arr,j,j-h);
                }
                System.out.println("");
                print(arr);
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
