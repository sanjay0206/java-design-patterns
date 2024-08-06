package com.designpatterns.creational.factory;


import org.junit.Assert;
import org.junit.Test;

public class Client {
    public static void main(String[] args) {

        DishFactory dishFactory = new DishFactory();
        dishFactory.getDish("burger").prepare();
        dishFactory.getDish("pizza").prepare();
        dishFactory.getDish("pasta").prepare();

    }
}
