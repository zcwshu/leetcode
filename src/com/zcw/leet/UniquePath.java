package com.zcw.leet;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:11 2020/7/26
 */
public class UniquePath {
    public static void main(String[] args) {
        int j = 62 % 7;
        System.out.println(j);
    }

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        return arr[m-1][n-1];
    }
}
