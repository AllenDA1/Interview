package com.interview.collections.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.TreeSet;

public class TreeSetDemo {


    public static void main(String[] args) {

        TreeSet<Object> set = new TreeSet<>();

        set.add("one");
        set.add("three");
        set.add("two");
        Person person = new Person();
        set.add(person);

        boolean b = set.contains("one");

        Student stu1 = new Student("张三", 19);
        Student stu2 = new Student("李四", 18);
        Student stu3 = new Student("王五", 20);
        Student stu4 = new Student("马六", 25);

        TreeSet<Student> stuSet = new TreeSet<>();



        stuSet.add(stu1);
        stuSet.add(stu2);
        stuSet.add(stu3);
        stuSet.add(stu4);

        System.out.println(stuSet);


;


    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Comparable<Student> {

    private String name;

    private Integer age;

    @Override
    public int compareTo(Student student) {
        int num = this.age - student.age; // 降序

        return num == 0 ? this.name.compareTo(student.name) : num;
    }

}


class Person {

}
