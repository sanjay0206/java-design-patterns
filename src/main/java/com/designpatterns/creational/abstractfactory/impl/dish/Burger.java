package com.designpatterns.creational.abstractfactory.impl.dish;

import com.designpatterns.creational.abstractfactory.IDish;

public class Burger implements IDish {
    @Override
    public void prepare() {
        System.out.println( "Burger is prepared");
    }
}

