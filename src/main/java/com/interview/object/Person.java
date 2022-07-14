package com.interview.object;

import lombok.Data;

@Data
public class Person {

    private String name;

    private int age;

    private String gender;


    public void say() {
        System.out.println("hello world");
    }

}
