package com.designpatterns.creational.singleton;

import org.junit.Test;

public class SingletonLazy {
    private static SingletonLazy lazyInstance;


    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (lazyInstance == null) {
            lazyInstance = new SingletonLazy();
        }

        return lazyInstance;
    }
}