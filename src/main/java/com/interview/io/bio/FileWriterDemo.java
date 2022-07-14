package com.interview.io.bio;

import java.io.*;
import java.util.Properties;

public class FileWriterDemo {


    public static void main(String[] args) throws IOException {

        Properties info = new Properties();
        InputStream ins = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(ins);
        String path = info.getProperty("path");
        File file = new File(path + "//writer//against1.txt");

        FileWriter writer = new FileWriter(file);

        String text = "Hello World";
        writer.write(text);
        writer.flush();
        writer.close();
    }
}
