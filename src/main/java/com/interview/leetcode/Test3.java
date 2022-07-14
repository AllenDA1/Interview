package com.interview.leetcode;



/**
 * 有一个字符串A，有一个字符串B，想要从A转换到B，只能一次一次转换，
 * 每次转换要把字符串A中的一个字符全部转换成另外一个字符。求字符串A能不能转换成字符串B。
 * 例如： “abc” -> "bbc" -> "ddc" （判断转换是否成立）
 */
public class Test3 {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ddc";
        boolean b = convert(s1, s2);

        if (b) {
            System.out.println(s1 + "转化成" + s2 + "====> 转换成功！");
        } else {
            System.out.println(s1 + "转化成" + s2 + "====> 转换失败！");

        }
    }

    private static boolean convert(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }

        char[] chars = s2.toCharArray();


        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) != chars[i]) {
                s1 = s1.replace(s1.charAt(i), chars[i]);
            }
        }

        if(s1.trim().equals(s2.trim())){
            return true;
        }else{
            return false;
        }
    }


}
