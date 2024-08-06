package com.designpatterns.creational.abstractfactory.impl.drink;

import com.designpatterns.creational.abstractfactory.IDish;

public class LemonJuice implements IDish {
    @Override
    public void prepare() {
        System.out.println( "Lemon Juice is prepared");
    }
}

