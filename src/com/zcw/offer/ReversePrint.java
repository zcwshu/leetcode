package com.zcw.offer;

import java.util.List;
import java.util.Stack;

/**
 * @Author: AndrewBar
 * @Date: Created in 8:36 2020/7/31
 */
public class ReversePrint {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int[] arr = new int[stack.size()];
//        for (int i : arr) {
//            arr[i] = stack.pop();
//            System.out.print(arr[i]);
//        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }

        System.out.println(stack.size());
        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.pop();
            System.out.print(arr[i]);
        }
    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int[] arr = new int[stack.size()];
        for (int i : arr) {
            arr[i] = stack.pop().val;
        }
        return arr;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
