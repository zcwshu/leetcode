package com.zcw.offer;

import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:08 2020/8/15
 */
public class StackQueue {
    static Stack<Integer> stack1;
    static Stack<Integer> stack2;
    public static void main(String[] args) {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        HashMap<Object, Object> map = new HashMap<>();
//        map.get();
//        map.put();

    }
    public static void appendTail(int value){
        stack1.push(value);
    }
    public static int deleteHead(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }if (stack2.isEmpty()){
            return -1;
        }else {
            return stack2.pop();
        }
    }
}
