package com.zcw.handcode;

import java.util.List;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:30 2020/8/13
 */
public class ReLinkedList {
    public static void main(String[] args) {
        ListNode D = new ListNode(4,null);
        ListNode C = new ListNode(3,D);
        ListNode B = new ListNode(2,C);
        ListNode A = new ListNode(1,B);
        System.out.println(A);
        ListNode node = reverse(A);
        System.out.println(node);
    }
    static ListNode reverse(ListNode listNode){
        ListNode pre = null;
        ListNode now = listNode;
        ListNode next;
        while(now != null){
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return pre;
    }
}
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString() {
        return "val=" + val +
                ", next=" + next;
    }
}
