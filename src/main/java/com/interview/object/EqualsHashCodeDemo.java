package com.interview.object;

import java.util.Objects;

public class EqualsHashCodeDemo {


    public static void main(String[] args) {

    }
}

class AA {

    private String username;

    private String password;

    private void login(Object aa) {
        if (aa instanceof AA) {
            System.out.println("yes");
        }
        System.out.println("yes");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        AA aa = (AA) o;
        return username.equals(aa.username) &&
                password.equals(aa.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
