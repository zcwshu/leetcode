package com.zcw.Trip;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:06 2020/8/15
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] divingBoard(int a, int b, int k) {

//    static int max =Integer.MIN_VALUE;
//    dfs(max, node,0);
//        System.out.println(max);
//    private void dfs(TreeNode node, int val ,int max){
//        if(node == null){
//            max = Math.max(max, val);
//            return ;
//        }
//
//            for (int i = 0; i < node.nextNode.size(); i++) {
//                dfs(node.nextNode.get(i), val +timeoutMillis ,max);
//            }
//
//        }
        return new int[3];
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a;
        _a = Integer.parseInt(in.nextLine().trim());

        int _b;
        _b = Integer.parseInt(in.nextLine().trim());

        int _k;
        _k = Integer.parseInt(in.nextLine().trim());

        res = divingBoard(_a, _b, _k);
        String value = "[]";
        if (res != null && res.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < res.length; i++) {
                if (i == 0) {
                    stringBuilder.append("[");
                }
                stringBuilder.append(res[i]);
                if (i == res.length - 1) {
                    stringBuilder.append("]");
                } else {
                    stringBuilder.append(",");
                }
            }
            value = stringBuilder.toString();
        }
        System.out.println(value);
    }
}