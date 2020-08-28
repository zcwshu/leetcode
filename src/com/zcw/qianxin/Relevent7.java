package com.zcw.qianxin;

import java.util.*;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:47 2020/8/1
 */
public class Relevent7 {
    public static void main(String[] args) {
        Relevent7 relevent7 = new Relevent7();
        int[] nums = {1,1,2};
        List<List<Integer>> res = relevent7.relevent(nums);
        System.out.println(res);


    }

    public static List<List<Integer>> relevent(int[] nums){
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0){
            return res;
        }
        //排序
        Arrays.sort(nums);

        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(nums,len,0,used,path,res);
        return res;
    }
    private static void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]){
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;

            dfs(nums, len, depth + 1, used, path, res);
            used[i] = false;
            path.removeLast();
        }
    }
}
