package com.zcw.offer;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:25 2020/7/29
 */
public class RepeatNums {
    public static void main(String[] args) {
        int num = 1;
        HashSet<Integer> set = new HashSet<>();
        set.add(num);
    }
    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int repeat = 0;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i + 1]){
                repeat = nums[i];
                break;
            }
        }
        return repeat;
    }
    @Test
    public void test(){

    }
}
