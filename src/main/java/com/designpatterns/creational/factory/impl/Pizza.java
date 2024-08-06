package com.designpatterns.creational.factory.impl;

import com.designpatterns.creational.factory.IDish;

public class Pizza implements IDish {
    @Override
    public void prepare() {
        System.out.println( "Pizza is prepared");
    }
}