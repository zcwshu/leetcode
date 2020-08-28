package com.zcw.handcode;

/**
 * @Author: AndrewBar
 * @Date: Created in 13:57 2020/8/22
 */
public class ReverseBetw {
    public static void main(String[] args) {
        ListNode F = new ListNode(6, null);
        ListNode E = new ListNode(5, F);
        ListNode D = new ListNode(4, E);
        ListNode C = new ListNode(3, D);
        ListNode B = new ListNode(2, C);
        ListNode A = new ListNode(1, B);
        reBetween(A,2,4);
        System.out.println(A);
    }
    static ListNode reBetween(ListNode head, int m, int n) {
        ListNode pre = null;
        ListNode cur = head;
        while (m > 1) {
            pre = cur;
            cur = cur.next;
            m--;
            n--;
        }
        ListNode con = pre;
        ListNode tail = cur;
        ListNode third;
        while (n > 0) {
            third = cur.next;
            cur.next = pre;
            pre = cur;
            cur = third;
            n--;
        }
        if (con != null) {
            con.next = pre;
        } else {
            head = pre;
        }
        tail.next = cur;
        return head;
    }
}
