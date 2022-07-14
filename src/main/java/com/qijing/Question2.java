package com.qijing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a “flatten” dictionary object, whose keys are dot-separated.
 * For example, { ‘A’: 1, ‘B.A’: 2, ‘B.B’: 3, ‘CC.D.E’: 4, ‘CC.D.F’: 5}.
 * Implement a function to transform it to a “nested” dictionary object.
 * In the above case, the nested version is like:
 *
 * 我的理解是K-V结构，做出这种分割。。
 *
 * 递归割，每次判断还有没有.    有的话就分为前后，然后对着后半段接着割
 */
public class Question2 {
    public static void main(String[] args) {
        Map<String, Integer> flatten = new HashMap<>();

        Map<String, Object> nestedFlatten = new HashMap<>();
        //example
        flatten.put("A", 1);
        flatten.put("B.A", 2);
        flatten.put("B.B", 3);
        flatten.put("CC.D.E", 4);
        flatten.put("CC.D.F", 5);

        for (Map.Entry<String, Integer> entry : flatten.entrySet()) {
            nest(entry.getKey(), nestedFlatten, entry.getValue());
        }

        System.out.println("分割前：");
        System.out.println(flatten);

        System.out.println("分割后：");
        System.out.println(nestedFlatten);



    }

    /**
     *
     * 递归处理 .字符，没有.就结束，有.就划分成左右两段，
     * @param key
     * @param map
     * @param value
     */
    public  static void nest(String key , Map<String,Object> map, Integer value){

        //递归结束条件，没有.
        if(!key.contains(".")) {
            map.put(key,value);
        }else {
            String left = key.substring(0, key.indexOf("."));
            String right = key.substring(key.indexOf(".")+1);

            HashMap<String, Object> newMap = new HashMap<>();

            if (!map.containsKey(left)){
                map.put(left,newMap);
            }else {
                newMap = (HashMap<String, Object>) map.get(left);
            }

            //还要对newMap进行设置呢，
            nest(right,newMap,value);
        }

    }
}
