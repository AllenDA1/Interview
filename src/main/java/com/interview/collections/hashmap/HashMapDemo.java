package com.interview.collections.hashmap;

import java.util.*;

public class HashMapDemo implements Iterable{

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap();
        map.put(null, null);
        map.put("1", "one");
        map.put(null, "hello");
        map.put(null, "world");
        map.put("1", "two");

        List<Object> list = new ArrayList<>();

        Integer[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> integers = Arrays.asList(arr);
        System.out.println(integers);

        LinkedList<Object> linkedList = new LinkedList<>();

        Vector<Object> objects = new Vector<>();


        System.out.println(map.containsKey(null));
        System.out.println(map.containsValue(null));


        System.out.println(map);

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
