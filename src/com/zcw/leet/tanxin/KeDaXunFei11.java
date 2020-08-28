package com.zcw.leet.tanxin;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:23 2020/7/31
 */
public class KeDaXunFei11 {
    public static int[] C = new int[5];
    public static int[] v = new int[]{1,5,10,50,100};
    public static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            C[i] = sc.nextInt();
        }
        k = sc.nextInt();
        sc.close();
        solve();
    }

    public static void solve(){
        int ans= 0;
        if (k != 0){
            System.out.println(-1);
            return;
        }
        for(int i = 4;i>=0;--i){
            int t = Math.min(k/v[i],C[i]);
            ans += t;
            k -= t*v[i];
        }

        System.out.println(ans);
    }
}
