package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.impl.Burger;
import com.designpatterns.creational.factory.impl.Pizza;
import com.designpatterns.creational.factory.impl.Samosa;

public class DishFactory {

    public IDish getDish(String dishType) {
        if (dishType == null) {
            return null;
        }

        switch (dishType) {
            case "samosa":
                return new Samosa();
            case "burger":
                return new Burger();
            case "pizza":
                return new Pizza();
            default:
                throw new IllegalArgumentException("Dish not found");
        }
    }
}
