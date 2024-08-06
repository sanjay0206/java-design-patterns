package com.designpatterns.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {

       HungryFactory hungryFactory = new HungryFactory();

       hungryFactory.getDish("drink", "lemon").prepare();

       hungryFactory.getDish("eat", "burger").prepare();

       hungryFactory.getDish("drink", "orange").prepare();

    }
}

/*
Lemon Juice is prepared
Burger is prepared
Lemon Juice is prepared
*/