package com.designpatterns.creational.factory.impl;

import com.designpatterns.creational.factory.IDish;

public class Samosa implements IDish {
    @Override
    public void prepare() {
        System.out.println( "Samosa is prepared");
    }
}

