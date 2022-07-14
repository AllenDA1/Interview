package com.interview.io.bio;

import java.io.*;
import java.util.Properties;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        Properties info = new Properties();
        InputStream ins = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(ins);
        String path = info.getProperty("path");
        File file = new File(path + "//writer//against1.txt");

        Reader reader = new FileReader(file);
        char[] chars = new char[12];

        reader.read(chars);
        System.out.println(chars);
        reader.close();
    }
}
