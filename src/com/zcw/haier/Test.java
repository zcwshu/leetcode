package com.zcw.haier;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 18:45 2020/7/31
 */
public class Test {

    public static int helper[] = new int[100];

    public static void calc(int n){
        if(n==1){
            helper[n]=1;
            return;
        }
        if(helper[n-1]==0)
            calc(n-1);
        helper[n] = helper[n-1]+n;
    }

    public static void trianglePatternPrint(int n){
        if(helper[n]==0){
            calc(n);
        }
        String[] strs = new String[n+1];
        int row = 1;
        for(;row<=n;row++){
            String str = new String();
            for(int i=helper[row-1]+1;i<=helper[row];i++){
                if(!str.equals(""))str+='*';
                str += i;
            }
            strs[row] = str;
        }
        for(String str : strs){
            if(str==null)continue;
            System.out.println(str);
        }
        for(int i=n;i>0;i--){
            System.out.println(strs[i]);
        }
    }
}
