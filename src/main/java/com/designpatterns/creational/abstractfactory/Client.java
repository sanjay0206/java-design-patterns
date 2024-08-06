package com.designpatterns.creational.abstractfactory;


public class Client {
    public static void main(String[] args) {

       HungryFactory hungryFactory = new HungryFactory();

       hungryFactory.getDish("drink", "lemon").prepare();

       hungryFactory.getDish("eat", "burger").prepare();

    }
}
