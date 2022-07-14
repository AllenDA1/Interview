package com.interview.leetcode;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        TreeSet set = new TreeSet();
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            set.add(num[i]);
        }

        int flag = 0;
        
        for(int i = 0; i<n; i++) {
            int A = num[i];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int B = num[j];
                int C = (A - B) / 2;
                if ((A - B) % 2 != 0) {
                    continue;
                }
                for (int k = 0; k < n && k != i && k != j; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if (set.contains(C)) {
                        if (A == B && B == C && C == 0) {
                            continue;
                        }
                        System.out.println(A + " " + B + " " + C);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        if (flag == 0) {
            System.out.println(0);
        }
    }
}