package com.interview.datatype;

public class BasicType {


    public static void main(String[] args) {
        Integer an = new Integer(10);
        Integer bn = new Integer(10);

        System.out.println(an == bn);
        System.out.println(an.equals(bn));


        int cn = 10;
        int dn = 10;
        Integer en = 10;

        System.out.println(cn == dn);
        System.out.println(dn == en);

        Integer c = 100;
        Integer d = 100;
        int f = d.intValue();   //手动拆箱
        System.out.println(c == d);
        c = 200;
        d = 200;
        System.out.println(c == d);

        System.out.println(ReturnCode.FRI);

    }
}
