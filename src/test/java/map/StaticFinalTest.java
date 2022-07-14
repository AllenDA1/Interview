package map;

import org.junit.Test;


/**
 *  static、final、static final修饰的区别
 *
 *  1、static修饰的变量
 *
 *
 *  2、final修饰的变量不能再被赋值
 */

public class StaticFinalTest {

    static final int anInt = 100;

    static int anInt1 = 200;

    private int anInt2 = 300;


    @Test
    public void test1() {
        // anInt = 200;  // 不能再被赋值
        anInt1 = 300;
        anInt2 = 400;
        System.out.println(anInt);
        System.out.println(anInt1);
        System.out.println(anInt2);

    }

    @Test
    public void test2() {
        System.out.println(anInt1);
        System.out.println(anInt2);
    }


    @Test
    public void test3() {
        Integer a = 1783;
        int h = a.hashCode();

        System.out.println(h);
        System.out.println(h ^ (h >>> 16));
    }

    @Test
    public void test4() {
        String s = "hello";
        int hash = s.hashCode();
        System.out.println(hash);
        System.out.println((hash>>>16));
        System.out.println(hash^(hash>>>16));
    }
}
