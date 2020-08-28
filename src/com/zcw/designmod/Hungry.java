package com.zcw.designmod;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:14 2020/8/23
 */

//饿汉式单例
    //单例中最重要的就是构造器私有
public class Hungry {
    private Hungry(){

    }
    private final static Hungry hungry = new Hungry();
    public static Hungry getInstance() {
        return hungry;
    }
}
