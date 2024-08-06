package com.designpatterns.creational.abstractfactory.impl.dish;

import com.designpatterns.creational.abstractfactory.IDish;

public class Samosa implements IDish {
    @Override
    public void prepare() {
        System.out.println( "Samosa is prepared");
    }
}

