package com.designpatterns.creational.factory.impl;

import com.designpatterns.creational.factory.IDish;

public class Burger implements IDish {
    @Override
    public void prepare() {
        System.out.println( "Burger is prepared");
    }
}

