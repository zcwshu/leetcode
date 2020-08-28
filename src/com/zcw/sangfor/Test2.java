package com.zcw.sangfor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: AndrewBar
 * @Date: Created in 12:09 2020/8/26
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,4,2,1,3,4,3,2,5};
        Map<Integer, Integer> map = new HashMap<>();
        map = getMap(arr,map);
//        map.put(1,arr[1]);

    }
    public static Map<Integer, Integer> getMap(int array[], Map<Integer,Integer> map){
        for(int i = 0 ; i < array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }
        return map;
    }
}
