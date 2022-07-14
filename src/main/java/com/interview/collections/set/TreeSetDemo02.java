package com.interview.collections.set;

import java.util.TreeSet;

public class TreeSetDemo02 {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<String> treeSet1 = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);


        treeSet1.add("003");
        treeSet1.add("002");
        treeSet1.add("001");
        treeSet1.add("110");

        System.out.println("TreeSet: " + treeSet);
        System.out.println("TreeSet1: " + treeSet1);
    }




}
