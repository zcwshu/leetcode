package com.zcw.handcode;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 11:13 2020/8/22
 */
public class DeleteNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ListNode D = new ListNode(4,null);
        ListNode C = new ListNode(3,D);
        ListNode B = new ListNode(2,C);
        ListNode A = new ListNode(1,B);

        System.out.println(delete(A, C.val));


    }
    static ListNode delete(ListNode listNode,int val){
        if (listNode == null)
            return listNode;
        if (listNode.val == val)
            return listNode.next;
        ListNode cur = listNode;
        while (cur.next.val != val && cur.next != null){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return listNode;
    }
}
