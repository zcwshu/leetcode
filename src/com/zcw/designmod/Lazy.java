package com.zcw.designmod;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:22 2020/8/23
 */
public class Lazy {
    private Lazy(){
        System.out.println(Thread.currentThread().getName()+"ok");
    }
    private static Lazy lazy;

    public static Lazy getInstance(){
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }
    //多线程并发问题
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
               lazy.getInstance();
            }).start();
        }
    }
}
