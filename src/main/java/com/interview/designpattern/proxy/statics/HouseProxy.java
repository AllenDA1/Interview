package com.interview.designpattern.proxy.statics;


/**
 * 中介
 */
public class HouseProxy {


    HouseOwner houseOwner = HouseOwner.getHouseOwner();

    public boolean rentHouse(int money) {
        // 此处需要调用房东的rentHouse方法
        money -= 500;
        boolean b = houseOwner.rentHouse(money);
        if (b) {
            System.out.println("赚了500, 晚上吃烧烤");
            return true;
        }
        return false;

    }
}
