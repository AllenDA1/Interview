package com.interview.collections.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;


/**
 *
    无序、不可重复，只允许存在一个null值
 */
public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Object> hashSet = new HashSet<>();

        User user1 = new User("张一", 20);
        User user2 = new User("张二", 21);
        User user3 = new User("张三", 22);
        User user4 = new User("张四", 22);

        hashSet.add(null);
        hashSet.add(user1);
        hashSet.add(user1);
        hashSet.add(user2);
        hashSet.add(user3);
        hashSet.add(user4);

        System.out.println(hashSet);




    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class User {

    private String name;

    private Integer age;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        User user = (User) o;

        return name.equals(user.name) && age.equals(user.name);

    }

    @Override
    public int hashCode() {
        int nameH = name.hashCode();
        return nameH ^ (nameH >>> 16);
    }

}