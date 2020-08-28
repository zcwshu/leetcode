package com.zcw.offer;

import org.junit.Test;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:54 2020/7/29
 */
public class FindNumIn2DArr {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean flag = false;

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return flag;
        }else{
            int n = matrix.length;
            int m = matrix[0].length;
            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < m; i1++) {
                    if (target == matrix[i][i1]){
                        flag = true;
                        return flag;
                    }
                }
            }
        }
        return flag;
    }
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        boolean flag = false;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return flag;
        }
            int n = matrix.length;
            int m = matrix[0].length;
            int row = 0;
            int col = m-1;
            while (row < n && col >= 0){
                if (matrix[row][col] == target){
                    flag = true;
                    return true;
                }else if (matrix[row][col] > target){
                    col--;
                }else{
                    row++;
                }
            }
        return flag;
    }
}
