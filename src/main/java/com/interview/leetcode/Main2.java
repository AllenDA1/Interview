package com.interview.leetcode;

import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int cnt = 1;
        System.out.println(T + "=" + T);


        int A = T / 2 + 1;

        for (int i = A -1; i > 0; i--) {
            int sum = 0;
            for (int j = i; j <= A; j++) {
                sum += j;
                if (sum == T) {
                    System.out.print(T + "=");
                    for (int k = i; k <= j; k++) {
                        System.out.print(k);
                        if (k < j) {
                            System.out.print("+");
                        }

                    }
                    System.out.println();
                    cnt++;
                    break;
                }
                if (sum > T) {
                    break;
                }
            }
        }
        System.out.println("Result:" + cnt);

    }
}
