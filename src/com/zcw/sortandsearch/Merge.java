package com.zcw.sortandsearch;

/**
 * @Author: AndrewBar
 * @Date: Created in 17:24 2020/8/20
 */
public class Merge {
    public static void main(String[] args) {
        int[] arr = {9,3,1,4,6,8,7,5,2};
        sort(arr);
        print(arr);
    }
    static void sort(int[] arr){
        merge(arr);
    }
    static void merge(int[] arr){
        int mid = arr.length / 2;
        int[] temp = new int[arr.length];

        int i = 0;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j<arr.length){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while(i<=mid)temp[k++] = arr[i++];
        while(j<=arr.length)temp[k++] = arr[i++];
    }
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
