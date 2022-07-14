package com.interview.io.nio;


import java.io.IOException;
import java.nio.channels.ServerSocketChannel;


public class Demo01 {

    public static void main(String[] args) {
        try (ServerSocketChannel socketChannel = ServerSocketChannel.open()) {
            System.out.println();
        } catch (IOException e) {

        }
    }

}
