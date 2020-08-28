package com.zcw.qianxin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:02 2020/8/16
 */
public class UndoRedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String temp = "";
        int index = 0;
        String str = sc.nextLine();
        if (str == ""){
            System.out.println("");
        }else{
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i++) {
                if (s[i] != "" && !s[i].equals("undo") && !s[i].equals("redo")){
                    list.add(s[i]);
                    index++;
                }else if (s[i].equals("undo") && i != 0 && index >0){
                    list.remove(--index);
                    temp = s[index];
                }else if (s[i].equals("redo") && i != 0){
                    list.add(temp);
                }
            }
        }
        for (String s : list) {
            System.out.print(s+" ");
        }
    }
}
