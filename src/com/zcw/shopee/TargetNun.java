package com.zcw.shopee;

/**
 * @Author: AndrewBar
 * @Date: Created in 11:07 2020/8/21
 */
public class TargetNun {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,14,17,34,56,78};
        int target = 56;
        System.out.println(search(nums, target));

    }
    static int search(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low < high){
            mid = (low + high) / 2;
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid;
            }else{
                high = mid;
            }
        }
        return -1;
    }
}
