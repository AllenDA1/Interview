package com.interview.designpattern.factory;

import com.interview.designpattern.factory.bean.Animal;
import com.interview.designpattern.factory.bean.Pig;
import com.interview.designpattern.factory.bean.Sheep;

public class AnimalFactory {

    public Animal create(String name) {

        if ("Pig".equals(name)) {
            return new Pig();
        }
        if ("Sheep".equals(name)) {
            return new Sheep();
        }

        return null;
    }
}
