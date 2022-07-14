package com.interview.collections.set;

import java.util.*;

public class TreeSetDemo {


    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

//        HashSet set = new HashSet<Integer>((Collection<? extends Integer>) new HashMap<>());

        treeSet.add("zhangsan");
        treeSet.add("zhangsan");
        treeSet.add("lisa");
//        treeSet.add(null);        // 会报空指针异常

        hashSet.add("zhangsan");
        hashSet.add("zhangsan");
        hashSet.add("lisa");
        hashSet.add(null);

        arrayList.add("zhangsan");
        arrayList.add("zhangsan");
        arrayList.add("lisa");
        arrayList.add(null);
        arrayList.add(null);

        linkedList.add("zhangsan");
        linkedList.add("zhangsan");
        linkedList.add("lisa");
        linkedList.add(null);
        linkedList.add(null);




        System.out.println("TreeSet: " + treeSet);
        System.out.println("HashSet: " + hashSet);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

    }
}
