package com.zcw.bishi;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:08 2020/7/29
 */
 import java.util.Comparator;
 import java.util.HashMap;
 import java.util.PriorityQueue;
 import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            arr[i] =  sc.nextLong();
        }

        HashMap<Long, Integer> map = new HashMap<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (!pq.contains(arr[i])) {
                pq.add(arr[i]);
            }
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i]);
                map.put(arr[i], ++value);

            } else {
                map.put(arr[i], 1);
            }
        }
        int index = 0;
        Long[] nums = new Long[map.size() * 2];
        while (!pq.isEmpty()) {
            Long res;
            Long key = pq.poll();
            int value = map.get(key);
            if (value == 1) {
                res = key;
            } else if (value % 2 == 0 && value!= 1) {
                res = key * value;
            } else {
                res = key * (value - 1);
                nums[index++] = key;
            }
            if (pq.contains(res)) {
                int valueNum = map.get(res);
                map.put(res, ++valueNum);
            } else {
                nums[index++] = res;
            }
        }
        int[] num = new int[index];
        System.arraycopy(nums, 0, num, 0, index);
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        for(int i = 0;i <num.length ;i++){
//            priorityQueue.add(num[i]);
//        }
//        while (!priorityQueue.isEmpty()) {
//            System.out.print(priorityQueue.poll() + " ");
//        }
//    }
        for (int i= num.length-1 ; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}