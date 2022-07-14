package com.interview.leetcode;


/**
 * 你在检查项目的时候发现最后一个版本的测试没有通过，并且你知道只要上一个版本有错误，此版本的每一个下面版本都会是错误的。
 * 【1 ,2,3…… X】数组由你的后台技术人员提供给你了，是这些版本编号的数组。假设提供了一个API可以直接检测出错误（FindBug(b)），
 * 传入这些版本编号就会返回是否出错。现在团队需要找到问题所在。 请使用这个接口写一个程序，用最少的步骤找出原始出错的编号。
 */
public class Test1 {


    public static Integer binaryFind(Integer currentV) {
        int low = 0 ;
        int high = currentV;
        while (low < high) {

            int mid = (high + low) / 2;
            if (isBug(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }


    public static Boolean isBug(Integer v) {
        //假设10以后的都是BUG版本
        if(v != null && v >=10){return true;}
        return false;
    }

    public static void main(String[] args) {

        System.out.println(binaryFind(20));
    }
}