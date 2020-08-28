package com.zcw.bishi;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 18:55 2020/7/29
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(scanner.nextInt());
        }
        while(m>0){
            pq.add(x + pq.poll());
            m--;
        }
        System.out.println(pq.poll());
    }
}
