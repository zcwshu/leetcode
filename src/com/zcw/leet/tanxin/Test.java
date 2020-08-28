package com.zcw.leet.tanxin;

import java.util.Comparator;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:31 2020/8/1
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(3);
        Cat cat2 = new Cat(1);
        Cat cat3 = new Cat(5);

        System.out.println(cat3.compare(cat2, cat3));

    }
}
class Cat implements Comparator {
    private int weight;

    @Override
    public int compare(Object o1, Object o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;
        if (c1.weight > c2.weight){
            return 1;
        }else if(c1.weight < c2.weight){
            return -1;
        }
        return 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat() {
    }

    public Cat(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }


}
