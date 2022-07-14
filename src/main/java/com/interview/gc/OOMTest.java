package com.interview.gc;

import lombok.Data;

public class OOMTest {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Obj obj = new Obj();
        }

    }


}

@Data
class Obj {

    private int[] a = new int[1024];

}
