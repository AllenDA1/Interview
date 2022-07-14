package com.djj.map;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();



        //无冲突，存放数组  有冲突，存放链表
        hashMap.put("mashiro", "nanami");
        hashMap.put("allen", "dai");
        hashMap.put("123", "321");


        Set<Map.Entry<Object, Object>> entries = hashMap.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }

        //Collection<Object> values = hashMap.values();

        System.out.println("----------");
        System.out.println(entries);
        System.out.println(hashMap);
        //Iterator<Map.Entry<Object, Object>> iterator = hashMap.entrySet().iterator();
        //while (iterator.hasNext()) {
        //    Map.Entry<Object, Object> entry = iterator.next();
        //    System.out.println(entry);
        //}

        //视图包装器，有一个mutex互斥锁
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(hashMap);


        Hashtable<Object, Object> hashtable = new Hashtable<>();

        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();

        TreeMap<Object, Object> treeMap = new TreeMap<>();

        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
    }



}
