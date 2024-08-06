package com.designpatterns.creational.abstractfactory.childfactory;

import com.designpatterns.creational.abstractfactory.IDish;
import com.designpatterns.creational.abstractfactory.impl.drink.LemonJuice;
import com.designpatterns.creational.abstractfactory.impl.drink.MangoJuice;
import com.designpatterns.creational.abstractfactory.impl.drink.OrangeJuice;

public class DrinkFactory {

    public IDish getDrink(String drinkType) {
        if (drinkType == null) {
            return null;
        }

        switch (drinkType) {
            case "mango":
                return new MangoJuice();
            case "lemon":
                return new LemonJuice();
            case "orange":
                return new OrangeJuice();
            default:
                throw new IllegalArgumentException("Drink not found");
        }
    }
}
