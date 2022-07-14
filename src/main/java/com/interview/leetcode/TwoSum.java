package com.interview.leetcode;

import java.util.*;

public class TwoSum {


    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 8, 9, 6};

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int target = scanner.nextInt();
            Set set = twoSum(nums, target);
            ArrayList<Integer> list = new ArrayList<>(2);

            for (Object index : set) {
                list.add((Integer) index);
            }
            System.out.println("[" + list.get(0) + ", " + list.get(1) + "]");
        }
    }


    private static Set<Integer> twoSum(int[] nums, int target) {

        // key 存放元素  value存放索引
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(map.get(key));
                set.add(i);
                return set;
            }
        }
        return null;
    }


}
