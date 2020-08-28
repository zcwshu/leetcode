package com.zcw.meituan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 17:24 2020/8/15
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
            map.put(arr1[i],arr2[i]);
        }

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr1[i]) == arr2[i]){

            }
        }
    }
}
