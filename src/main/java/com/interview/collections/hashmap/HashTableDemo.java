package com.interview.collections.hashmap;

import java.util.Hashtable;

public class HashTableDemo {


    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable();
        table.put("h", "H");
        //table.put("a", null);
        //table.put(null, "hello");
        table.put("Hello", "hello");


        System.out.println(table);

    }
}
