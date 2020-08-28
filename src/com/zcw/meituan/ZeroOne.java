package com.zcw.meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:41 2020/8/15
 */
public class ZeroOne {
    static int[] nums;
    static int n = 0;
    static int res = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while(!"}".equals(s = bf.readLine())){
            if("{".equals(s)) continue;
            if(n == 0){
                String[] strs = s.split(",");
                n = strs.length;
                nums = new int[n];
                for (int i = 0; i < n; i++) {
                    if(i == 0) nums[i] = strs[i].charAt(2) - '0';
                    else nums[i] = strs[i].charAt(1) - '0';
                }
                go(nums);
            }else{
                String[] strs = s.split(",");
                for (int i = 0; i < n; i++) {
                    if(i == 0) {
                        int tmp = strs[i].charAt(2) - '0';
                        if(tmp == 0) nums[i] = 0;
                        else nums[i] += tmp;
                    }
                    else {
                        int tmp = strs[i].charAt(1) - '0';
                        if(tmp == 0) nums[i] = 0;
                        else nums[i] += tmp;
                    }
                }
                go(nums);
            }
        }
        System.out.println(res);
    }
    public static void go(int[] nums){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while(!stack.isEmpty() && nums[i] <= nums[stack.peek()]){
                int j = stack.pop();
                int k = stack.isEmpty() ? -1 : stack.peek();
                res = Math.max(res, nums[j] * (i-k-1));
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int j = stack.pop();
            int k = stack.isEmpty() ? -1 : stack.peek();
            res = Math.max(res, nums[j] * (nums.length - k - 1));
        }
    }
}
