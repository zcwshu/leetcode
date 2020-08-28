package com.zcw.leet;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:45 2020/7/31
 */
public class FindMagicIndex {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i)
                return i;

        }
        return -1;
    }
}
