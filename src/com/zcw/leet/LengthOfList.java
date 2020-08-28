package com.zcw.leet;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:24 2020/8/18
 */
public class LengthOfList {

    public static void main(String[] args) {
        int[] arr = new int[]{10,1,4,3,6,7,2,15};
        LengthOfList lol = new LengthOfList();
        System.out.println(lol.leng(arr));
    }
    public int leng(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int maxOfEve = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]){
                    maxOfEve = Math.max(maxOfEve,dp[j]);
                }
            }
            dp[i] = maxOfEve + 1;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
