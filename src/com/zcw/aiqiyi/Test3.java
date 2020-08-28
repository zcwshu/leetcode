package com.zcw.aiqiyi;

import java.util.*;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:41 2020/8/23
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        if (n % 2 == 1){
            System.out.println("False");
        }

        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')','(');
            put(']','[');
            put('}','{');
        }};

        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (list.isEmpty() || list.peek() != map.get(c)){
                    System.out.println("False");
                }
                list.pop();
            }else{
                list.push(c);
            }
        }
        if (list.isEmpty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    static boolean isValid(String s){
        int n = s.length();
        if (n % 2 == 1){
            return false;
        }
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')','(');
            put(']','[');
            put('}','{');
        }};

        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (list.isEmpty() || list.peek() != map.get(c)){
                    return false;
                }
                list.pop();
            }else{
                list.push(c);
            }
        }
        return list.isEmpty();
    }
}

