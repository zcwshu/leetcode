package com.zcw.offer;


import org.junit.Test;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:44 2020/7/29
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb = sb.append("%20");
            }else{
                sb = sb.append(c);
            }

        }
        return sb.toString();
    }


    @Test
    public void test(){
        String s = "hello zcw 123";

        System.out.println(replaceSpace(s));
    }
}
