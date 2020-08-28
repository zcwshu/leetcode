package com.zcw.leet;

import java.util.LinkedList;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:17 2020/8/15
 */
public class IsValid {
    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '[') stack.push(']');
            else if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
