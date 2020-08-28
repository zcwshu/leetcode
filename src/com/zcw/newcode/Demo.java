package com.zcw.newcode;

import java.lang.reflect.Parameter;
import java.util.*;

/**
 * @Author: AndrewBar
 * @Date: Created in 17:16 2020/7/29
 */
public class Demo {
    public static void main(String[] args) {
        Fish fish = new Fish(5);
        Chizi chizi = new Chizi(fish);
        chizi.put(5);
        System.out.println(fish.weight);

//        Child child = new Child();
//        Parent p = child;
//        System.out.println(child.num+","+p.num);
//
//        int a = 0;
//        System.out.println(func(a));
    }
    public static int func(int i){
        try{
            return i++;
        }
        catch (RuntimeException e){

        }catch (Exception e){

        }
        finally {
            return i++;
        }
    }
}
class Parent{
    public int num = 0;
}
class Child extends Parent{
    public int num = 1;
}
class Chizi{
    private Fish fish;

    public Chizi(Fish fish) {
        this.fish = fish;
    }

    public Fish getFish() {
        return fish;
    }

    public void put(int w){
        fish.weight+=w;
    }

}
class Fish{
    int weight;

    public Fish(int weight) {
        this.weight = weight;
    }
}