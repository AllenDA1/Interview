package com.interview.io.bio;

import java.io.*;
import java.util.Properties;

public class InputStreamDemo {

    public static void main(String[] args) throws IOException {

        Properties info = new Properties();
        InputStream ins = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(ins);

        String path = info.getProperty("path");
        File output = new File(path + "\\against2.txt");
        File input = new File(path + "\\against1.txt");
        InputStream inputStream = new FileInputStream(input);
        OutputStream outputStream = new FileOutputStream(output);

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes,0,len);
        }
        outputStream.flush();
        outputStream.close();
        inputStream.close();
    }
}
