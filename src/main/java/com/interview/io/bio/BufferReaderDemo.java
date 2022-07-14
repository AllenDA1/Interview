package com.interview.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {


    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = null;
        System.out.println("input is :");

        try {
            read = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(read);
    }
}
