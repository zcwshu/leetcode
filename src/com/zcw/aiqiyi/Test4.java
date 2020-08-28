package com.zcw.aiqiyi;

        import java.util.Scanner;
        import java.util.Stack;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:23 2020/8/23
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() % 2 != 0){
            System.out.println("False");
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop());
            System.out.println("False");
        }
        if (stack.empty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
