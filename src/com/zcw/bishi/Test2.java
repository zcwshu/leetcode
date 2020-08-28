package com.zcw.bishi;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:15 2020/7/29
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        Thread.sleep(1000);
        System.out.println(t.isAlive()+ "="+Thread.activeCount());
        try{}
        catch (ArrayIndexOutOfBoundsException | NullPointerException e){

        }
    }
}
class T extends Thread{
    public void run(){
        try{
            sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
