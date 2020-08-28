package com.zcw.leet.tanxin;

import java.util.*;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:48 2020/7/31
 */
public class FindMinArrowShots {
    public static void main(String[] args) {
        //int[][] arr = new int[][]{{1,4}, {1,2}, {2,3}, {3,4}};
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            list.add(sc.nextLine());
        }

        int[][] arr = new int[count][2];
        list.toArray(new String[count]);
        int c = 0;
//        for (java.lang.String s : list) {
//            for (int j = 0; j < 2; j++) {
//                arr[c][j] = Integer.parseInt(s.split(" ")[j]);
//                c++;
//            }
//        }
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < 2; j++) {
                arr[c][j] = Integer.parseInt(list.get(i).split(" ")[j]);
            }
            c++;
        }
        System.out.println(findMinArrowShots(arr));
    }

    public static int findMinArrowShots(int[][] points) {

        if (points.length == 0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int end1 = points[0][1];
        int res = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end1){
                res++;
                end1 = points[i][1];
            }
        }
        return res;
    }
}
