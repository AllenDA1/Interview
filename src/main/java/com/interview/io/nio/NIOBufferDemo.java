package com.interview.io.nio;

import sun.nio.ch.FileChannelImpl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Properties;

public class NIOBufferDemo {


    public static void main(String[] args) throws IOException {

        // 定义缓存区的长度
        int bufferSize = 1024;

        Properties info = new Properties();
        InputStream stream = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(stream);

        String path = info.getProperty("path");

        // 定义两个FileChannel对象，用来指向待读写对象
        FileChannel src = new FileInputStream(path + "\\source.txt").getChannel();
        FileChannel dest = new FileOutputStream(path + "\\dest.txt").getChannel();


        Selector selector = Selector.open();
        ServerSocketChannel socketChannel = ServerSocketChannel.open();
        socketChannel.configureBlocking(false);
        SelectionKey key = socketChannel.register(selector, SelectionKey.OP_READ);
        int val = selector.select();


        // 通过allocate方法来分配空间
        ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
        byte[] bytes = new byte[1024];

        while (src.read(buffer) != -1) {
            buffer.flip();  //切换读写模式
            dest.write(buffer);
            buffer.clear();     // 清空缓存，以便下次再读
        }
        System.out.println(bytes.toString());

    }
}
