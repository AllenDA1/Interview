package com.interview.collections.List;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {


        ConcurrentHashMap map = new ConcurrentHashMap();

        map.put("1", "one");
        map.put("2", "two");

        ConcurrentHashMap.KeySetView keySet = map.keySet();

        for (Object o : keySet) {

            System.out.println(map.get(o));
        }


    }
}
