package com.interview.io.bio;

import java.io.*;
import java.util.Properties;

public class BufferedInputStreamDemo {


    public static void main(String[] args) throws IOException {

        Properties info = new Properties();
        InputStream ins = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(ins);
        String path = info.getProperty("path");
        File file = new File(path + "//writer//against1.txt");

        FileReader reader1 = new FileReader(file);
        BufferedReader reader = new BufferedReader(reader1);

        char[] chars = new char[15];
        reader.read(chars);
        System.out.println(chars);
        reader1.close();
    }
}
