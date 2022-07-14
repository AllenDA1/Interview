package com.djj.desginpattern.singleton;

public class UserService3 {

    private static UserService3 userService3;

    static class Inner{
        static {
            userService3 = new UserService3();
        }

        public static UserService3 provideInstance() {
            return userService3;
        }
    }

    private UserService3() {}

    public static UserService3 getInstance() {
        return Inner.provideInstance();
    }
}
