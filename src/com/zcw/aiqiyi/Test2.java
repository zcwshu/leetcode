package com.zcw.aiqiyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:55 2020/8/23
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        if (isPath(path)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static boolean isPath(String path){
        Set<Integer> set = new HashSet<>();
        int x = 0,y = 0;
        set.add(getHash(x,y));
        int length = path.length();
        for (int i = 0; i < length; i++) {
            char c = path.charAt(i);
            switch(c){
                case 'N' : --x; break;
                case 'S' : ++x; break;
                case 'W' : --y; break;
                case 'E' : ++x; break;
            }
            int hashValue = getHash(x,y);
            if(!set.add(hashValue)){
                return true;
            }
        }
        return false;
    }
    public static int getHash(int x,int y){
        return x*20001 + y;
    }
}
