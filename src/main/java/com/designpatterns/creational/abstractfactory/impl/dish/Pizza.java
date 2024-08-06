package com.designpatterns.creational.abstractfactory.impl.dish;

import com.designpatterns.creational.abstractfactory.IDish;

public class Pizza implements IDish {
    @Override
    public void prepare() {
        System.out.println( "Pizza is prepared");
    }
}