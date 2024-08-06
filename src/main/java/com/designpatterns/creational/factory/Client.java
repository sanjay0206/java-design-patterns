package com.designpatterns.creational.factory;


public class Client {
    public static void main(String[] args) {

        DishFactory dishFactory = new DishFactory();

        dishFactory.getDish("burger").prepare();

        dishFactory.getDish("pizza").prepare();

        dishFactory.getDish("pasta").prepare();

    }
}

/*
Burger is prepared
Pizza is prepared
Exception in thread "main" java.lang.IllegalArgumentException: Dish not found
	at com.designpatterns.creational.factory.DishFactory.getDish(DishFactory.java:22)
	at com.designpatterns.creational.factory.Client.main(Client.java:16)
*/