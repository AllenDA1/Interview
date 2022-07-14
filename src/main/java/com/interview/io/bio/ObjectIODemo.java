package com.interview.io.bio;

import lombok.Data;

import java.io.*;
import java.util.Properties;

public class ObjectIODemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Properties info = new Properties();
        InputStream stream = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(stream);
        String path = info.getProperty("path");

        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        user.setAge(18);
        user.setGender("男");

        FileOutputStream outputStream = new FileOutputStream(path + "\\user.json");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);

        objectOutputStream.close();

        FileInputStream inputStream = new FileInputStream(path + "\\user.json");

        try (ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            User user1 = (User) objectInputStream.readObject();
            System.out.println(user1);
        }

    }



}


@Data
class User implements Serializable {

    private String username;

    private transient String password;

    private Integer age;

    private String gender;
}