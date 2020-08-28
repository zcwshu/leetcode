package com.zcw.sortandsearch;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:29 2020/8/9
 */
public class Reverse {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        System.out.println(a);/*data=1-->data=2-->data=3-->data=4-->data=5-->null*/
        Node reverse = reverse(a);/*递归方式反转*/
        System.out.println(reverse);/*data=5-->data=4-->data=3-->data=2-->data=1-->null*/
    }
    private static Node reverse(Node head) {
        /*如果是空链或者只是单个节点的链表  将直接返回*/
        if(head == null || head.getNext() ==null) {
            return head;
        }
        Node reverse = reverse(head.getNext());/*找到了最后一个   也就是5   当前head为4  reverse为5*/
        head.getNext().setNext(head);/* 1-->2-->3-->4-->5   变为   5-->4  1-->2-->3-->4  此时4指向5  5 也指向4*/
        head.setNext(null);  /*4-->null    5-->4-->null  1-->2-->3-->4 */
        return reverse;    /*返回5-->4-->null*/
    }
}
class Node{
    private Node next;
    private int data;
    public Node(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "data=" + data + "-->"+next;
    }

}