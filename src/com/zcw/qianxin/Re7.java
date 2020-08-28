package com.zcw.qianxin;

import java.util.*;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:10 2020/8/1
 */
public class Re7 {
    public static void main(String[] args) {
    }

    public static void backtrack(List<Integer> res,int[] digit,ArrayList<Integer> temp,int[] ints){
        if (temp.size() == digit.length){
            int sum = 0;
            int pow = digit.length - 1;
            for (int i = 0; i < digit.length; i++) {
                sum += Math.pow(10,pow) * temp.get(i);
                pow--;
            }
            res.add(sum);
            return;
        }
        for (int i = 0; i < digit.length; i++) {
            if (ints[i] == 1)
                continue;
            ints[i] = 1;
            temp.add(digit[i]);
            backtrack(res, digit, temp, ints);
            ints[i] = 0;
            temp.remove(temp.size() -1);
        }
    }

    public int relevent_7(int[] digit){
        List<Integer> res = new ArrayList<>();
        int[] ints = new int[digit.length];
        backtrack(res,digit,new ArrayList<Integer>(),ints);
        int count = 0;
        for (Integer re : res) {
            if (re % 7 == 0){count++;}
        }
        return count;
    }
}
