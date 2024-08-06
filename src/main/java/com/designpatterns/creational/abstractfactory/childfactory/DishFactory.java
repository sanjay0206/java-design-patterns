package com.designpatterns.creational.abstractfactory.childfactory;


import com.designpatterns.creational.abstractfactory.IDish;
import com.designpatterns.creational.abstractfactory.impl.dish.Burger;
import com.designpatterns.creational.abstractfactory.impl.dish.Pizza;
import com.designpatterns.creational.abstractfactory.impl.dish.Samosa;

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
