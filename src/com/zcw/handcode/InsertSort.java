package com.zcw.handcode;

import static com.zcw.handcode.BubbleSort.print;
import static com.zcw.handcode.BubbleSort.swap;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:49 2020/8/18
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,76,1,6,7};
        sort(arr);
        print(arr);
    }
    static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
        return arr;
    }


}
