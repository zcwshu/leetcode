package com.zcw.meituan;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:10 2020/8/15
 */
import java.util.*;
public class Nixudui {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer>list = new ArrayList<>();
        int k = n/4+1;
        for (int i = 1;i<k;i++){
            String str = String.valueOf(i);
            String str2 =new StringBuilder(str).reverse().toString();
            int x = Integer.parseInt(str2);
            if(i*4 == x){
                list.add(i);
                list.add(x);
            }
        }
        System.out.println(list.size()/2);

        for(int i = 0 ;i<list.size();i = i+2){
            System.out.println(list.get(i) +" "+list.get(i+1));
        }
    }
}
