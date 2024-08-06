package com.designpatterns.structural.bridge.abstractions;


import com.designpatterns.structural.bridge.implementations.Pizza;

public abstract class Restaurant {

    // Pizza act as bridge between pizza and restaurant classes
    // so adding new pizzas won't require changing restaurant hierarchy
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }

}

