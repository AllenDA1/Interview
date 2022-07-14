package string;

/**
 * 今天我要问你的问题是，理解 Java 的字符串，String、StringBuffer、StringBuilder 有什么区别？
 * 1、String --- 典型的Immutable类，被声明成final类，所有的属性也都是final类型的。也由于它的不可变性，类似拼接、裁剪字符串等操作都会产生新的String对象。
 * 由于字符串操作的普遍性，所以相关操作的效率往往对应用性能有明显影响。
 *
 * 2、StringBuffer --- StringBuffer 是为解决上面提到拼接产生太多中间对象的问题而提供的一个类，我们可以用 append 或者 add 方法，
 * 把字符串添加到已有序列的末尾或者指定位置。StringBuffer 本质是一个线程安全的可修改字符序列，它保证了线程安全，也随之带来了额外的性能开销，
 * 所以除非有线程安全的需要，不然还是推荐使用它的后继者，也就是 StringBuilder。
 *
 * 3、StringBuilder --- StringBuilder 是 Java 1.5 中新增的，在能力上和 StringBuffer 没有本质区别，
 * 但是它去掉了线程安全的部分，有效减小了开销，是绝大部分情况下进行字符串拼接的首选。
 */

import org.junit.Test;

/**
 *  装箱和拆箱
 *
 */

public class Demo1 {

    @Test
    public void test() {

        Integer a = 100;
        Double b = 1.2;

        Short c = 1;
        Long d = 100L;
        long f = 100;
        String s1 = "abc";
        System.out.println(0x80000000);
    }

    @Test
    public void test1() {

        /*
            1、String类是被final修饰的，final修饰表示不能被继承 ————> String类不可变
            2、用来存储字符串的char value[]数组被private 和final修饰，对于一个被final的基本数据类型的变量，则其数值一旦在初始化之后便不能更改 ——> String类不可变
         */

        String s1 = "hello";    // s1指向了常量池中的"hello"
        String s2 = new String(s1); // s2指向了堆空间中的"hello"
        System.out.println(s1 == s2);   // false
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        StringBuilder sb = new StringBuilder(s1);

        String replace = s1.replace("he", "HE");
        String subs = s1.substring(0, 2);
        String subb = sb.substring(0, 2);
        System.out.println(subs.equalsIgnoreCase(subb));

        System.out.println(s1);
        System.out.println(sb);

        StringBuilder he = sb.replace(0, 2, "HE");

        // System.out.println(s1);
        // System.out.println(replace);

        System.out.println(sb == he);
        System.out.println(sb.equals(he));
        System.out.println(sb);
        System.out.println(he);
    }
}
