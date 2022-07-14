package com.interview.map.hashmap;

import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1、HashMap 的成员变量、底层结构
 *
 *      DEFAULT_INITIAL_CAPACITY (默认初始容量：1<<4 = 16) ———— 常量
 *      DEFAULT_LOAD_FACTOR (默认加载因子：0.75)   ———— 常量
 *
 *
 *      数组和链表的结合体(数组查询快，增删慢；链表增删快，查询慢)，数组和链表发挥各自的优势，
 *      使用拉链法（JDK1.8以前）可以解决哈希冲突（将hash冲突的值添加到链表上）。
 *      HashMap 基于 Hash算法实现
 *
 *
 *
 *
 * 2、HashMap的方法
 *
 *      构造方法：HashMap(int initialCapacity, float loadFactor)
 *
 *
 *      put：调用putVal方法
 *      存放值的规则：无冲突，存放数组、有冲突，存放链表（红黑树）
 *          1、传入put(key,value)
 *          2、调用hash(key)的返回一个hash值
 *              h = key.hashCode()
 *              return (key == null) ? 0 : h^(1>>>16)
 *
 *
 *
 *
 *
 *
 *      get:
 *
 * 3、HashMap的特性、应用场景
 *      不同步、可以存储null值和null键、无序、
 */

public class HashMapDemo01 {


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();



        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(map.get(string));
        }

        System.out.println("====================");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.println(entry);
        }


        System.out.println("====================");
        System.out.println(entries);
        System.out.println(map);
    }
}
