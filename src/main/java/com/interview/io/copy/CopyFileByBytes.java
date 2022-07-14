package com.interview.io.copy;

import java.io.*;
import java.util.Properties;

public class CopyFileByBytes {

    public static void main(String[] args) throws IOException {

        Properties info = new Properties();
        InputStream ins = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(ins);

        String input = info.getProperty("input");
        String output = info.getProperty("output");

        File inputFile = new File(input);
        // 创建缓冲字节输入流
        FileInputStream inputStream = new FileInputStream(inputFile + "\\111.mp4");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);


        File outputFile = new File(output);
        // 创建缓冲字节输出流
        FileOutputStream outputStream = new FileOutputStream(outputFile + "\\222.mp4");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

        byte[] bytes = new byte[2048];  // 1024-->489   2048-->474 4096-->439
        int len = 0;
        long start = System.currentTimeMillis();
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        bufferedInputStream.close();
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

    }
}
