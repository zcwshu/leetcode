package com.zcw.designmod;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:29 2020/8/23
 */

import java.lang.reflect.Constructor;

/**
 * 1.分配内存空间
 * 2.执行构造方法,初始化对象
 * 3.把这个对象指向这个空间
 */
public class DCLSingle {

    private DCLSingle(){
        synchronized (DCLSingle.class){
            if (dclSingle != null){
                throw new RuntimeException("不要使用反射破坏");
            }
        }
    }
    //   volatile保证可见性,避免指令重排序
    private volatile static DCLSingle dclSingle;

    //双层检测锁模式
    public static DCLSingle getInstance(){
        if (dclSingle == null){  //外层检查有利于提高效率,避免频繁的锁竞争
            synchronized (DCLSingle.class){  //锁class 只有一个
                if (dclSingle == null){
                    dclSingle = new DCLSingle();//不是一个原子性操作
                }
            }
        }
        return dclSingle;
    }

    //反射
    public static void main(String[] args) throws Exception {
        DCLSingle instance = DCLSingle.getInstance();
        Constructor<DCLSingle> declaredConstructor = DCLSingle.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        DCLSingle instance1 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}
