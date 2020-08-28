package com.zcw.jingdong;

        import java.util.Scanner;
        import static java.lang.Math.sqrt;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:51 2020/8/6
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int partner = sc.nextInt();
        double xx = sc.nextDouble();//自身位置
        double xy = sc.nextDouble();//自身位置
        double dis = Double.MAX_VALUE;
        double t = 0;
        for (int i = 0; i < partner; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            t = Math.min(dis,sqrt((x-xx)*(x-xx)+(y-xy)*(y-xy)));
            dis = t;
        }
        double res = dis / speed;
        //System.out.println(res);
        System.out.println(String.format("%.2f",res));
    }
}
