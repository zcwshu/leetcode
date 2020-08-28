package com.zcw.sortandsearch;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:40 2020/8/5
 */
public class DataCheck {
    static int[] generateRandomArray(){
        Random r = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }

    static void check(){
        int[] arr = generateRandomArray();
        int[] arr2 = new int[arr.length];  //拷贝一份
        System.arraycopy(arr,0,arr2,0,arr.length);

        Arrays.sort(arr);
        //SelectSort.sort(arr2);
        InsertSort.sort(arr2);

        boolean same = true;

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr2[i])
                same = false;
        }

        System.out.println(same == true ? "right" : "false");
    }

    public static void main(String[] args) {
        check();
    }
}
