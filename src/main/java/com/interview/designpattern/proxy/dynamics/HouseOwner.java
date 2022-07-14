package com.interview.designpattern.proxy.dynamics;

public class HouseOwner implements Rent{



    @Override
    public boolean rent(int money) {
        System.out.println("租房");
        if (money >= 2000) {
            return true;
        }
        return false;
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
