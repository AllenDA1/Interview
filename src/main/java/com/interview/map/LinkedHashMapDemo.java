package com.interview.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put(null, null);
        map.put(null, "hello");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
//        System.out.println(map);

    }
}
