package com.interview.designpattern.proxy.statics;


/**
 * 房东
 */
public class HouseOwner {

    private static HouseOwner houseOwner = new HouseOwner();

    private HouseOwner() {

    }

    public static HouseOwner getHouseOwner() {
        return houseOwner;
    }


    public boolean rentHouse(int money) {
        if (money >= 1500) {
            return true;
        }
        return false;
    }
}
