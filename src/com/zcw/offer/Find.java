package com.zcw.offer;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 8:34 2020/8/12
 */
public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[][] arr = new int[n][m];
        findNumberIn2DArray(arr,target);

    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int d1 = 0;
        int d2 = m - 1;

        while(d1 < n && d2 >= 0){
            if (target == matrix[d1][d2]){
                return true;
            }else if(target > matrix[d1][d2]){
                d1++;
            }else{
                d2--;
            }
        }
        return false;
    }
}
