package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.childfactory.DishFactory;
import com.designpatterns.creational.abstractfactory.childfactory.DrinkFactory;

public class HungryFactory {

    public IDish getDish(String choice, String type) {

        DishFactory dishFactory = new DishFactory();
        DrinkFactory drinkFactory = new DrinkFactory();

        switch (choice) {
            case "eat":
                return dishFactory.getDish(type);
            case "drink":
                return drinkFactory.getDrink(type);
            default:
                throw new RuntimeException("We don't have anything for choice " + choice);
        }
    }
}
