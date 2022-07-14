package com.interview.leetcode;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String src = sc.next();

        int len = src.length();

        String s1 = src.substring(0, 2);
        String s2 = src.substring(3, len);

        StringBuffer sb = new StringBuffer();

        sb.append(s1.charAt(0));
        sb.append(s1.charAt(1));
        sb.append(s2.charAt(0));
        sb.append(s2.charAt(1));

        char[] chars = {src.charAt(0), src.charAt(1), src.charAt(3), src.charAt(4)};

        System.out.println("==========");


        ArrayList<StringBuffer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        StringBuffer sb1 = new StringBuffer();
                        sb1.append((chars[i]));
                        sb1.append((chars[j]));
                        sb1.append((chars[k]));
                        sb1.append((chars[l]));
                        int sum = (chars[i] - 48) * 1000 + (chars[j] - 48) * 100 + (chars[k] - 48) * 10 + (chars[l] - 48);

                        if (sum > 2359) continue;
                        list.add(sb1);
                    }
                }
            }
        }

        TreeSet<StringBuffer> treeSet = new TreeSet<>(list);

        /*System.out.println();
        Object[] array = list.toArray();


        String[] strings = new String[list.size()];
        int i = 0;
        for (Object o : array) {
            strings[i++] = new String((StringBuffer) o);
        }

        Arrays.sort(strings);*/
        Iterator<StringBuffer> it = treeSet.iterator();
        String[] strings = new String[list.size()];
        int i = 0;
        while (it.hasNext()) {
            strings[i++] = new String(it.next());
        }

        int cnt = 0;
        for (String string : strings) {
            if (string.equals(new String(sb))) {
                System.out.println(string);
                break;
            }
            cnt++;
        }

        String res;
        if (cnt == list.size() - 1) {
            res = strings[0];
        } else {
            res = strings[cnt + 1];
        }
        System.out.println(res);

        Integer value = Integer.valueOf(res);


        //1855;
        int a = value / 1000;
        int b = value / 100 % 10;
        int c = value % 100 / 10;
        int d = value % 10;

        System.out.println(a +""+ b + ":" + c +""+ d);


    }
}
