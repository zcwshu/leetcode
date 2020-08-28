package com.zcw.designmod;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:39 2020/8/23
 */
public class Holder {
    private Holder(){
    }

    public static Holder getInstance(){
        return InnerClass.holder;
    }

    public static class InnerClass{
        private static final Holder holder = new Holder();
    }
}
