package com.zcw.handcode;

import static com.zcw.handcode.BubbleSort.print;
import static com.zcw.handcode.BubbleSort.swap;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:59 2020/8/18
 */
public class SelectSort {
    public static void main(String[] args) {
         int[] arr = new int[]{23,4,5,1,6,54,38};
         sort(arr);
         print(arr);
    }
    static int[] sort(int[] arr){//选择,把小的往前放
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]){
                    swap(arr,j,minPos);
                }
            }
        }
        return arr;
    }
}
