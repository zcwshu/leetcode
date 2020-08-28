package com.zcw.kdxf;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:03 2020/7/31
 */
public class Kdxf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int p1 = Integer.parseInt(arr[1]);
        int p2 = Integer.parseInt(arr[2]);
        int p3 = Integer.parseInt(arr[3]);
        int p4 = Integer.parseInt(arr[4]);
        int p5 = Integer.parseInt(arr[5]);
        int p6 = Integer.parseInt(arr[6]);
        int p7 = Integer.parseInt(arr[7]);
        int p8 = Integer.parseInt(arr[8]);

        int[] point1 = new int[]{p1,p2};  //第一个顶点
        int[] point2 = new int[]{p3,p2};
        int[] point3 = new int[]{p1,p4};
        int[] point4 = new int[]{p3,p4};
        int[] point5 = new int[]{p1,p2};
        int[] point6 = new int[]{p1,p2};
        int[] point7 = new int[]{p1,p2};
        int[] point8 = new int[]{p1,p2};

    }
}
