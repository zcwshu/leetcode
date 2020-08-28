package com.zcw.kdxf;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:16 2020/7/31
 */
public class ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x01 = sc.nextInt();
        int y01 = sc.nextInt();
        int x02 = sc.nextInt();
        int y02 = sc.nextInt();
        int x11 = sc.nextInt();
        int y11 = sc.nextInt();
        int x12 = sc.nextInt();
        int y12 = sc.nextInt();
        System.out.println(help(x01,x02,y01,y02,x11,x12,y11,y12));
    }
   public static int help(int x01,int x02,int y01,int y02,
                          int x11,int x12,int y11,int y12){
        int zx = Math.abs(x01 + x02 -x11 -x12);
        int x = Math.abs(x01 - x02) + Math.abs(x11 -x12);
        int zy = Math.abs(y01 + y02 -y11 -y12);
        int y = Math.abs(y01 - y02) + Math.abs(y11 -y12);

        if (zx <= x && zy <= y)
            return 1;
        else
            return 0;
   }
}
