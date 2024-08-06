package com.designpatterns.structural.bridge;

import com.designpatterns.structural.bridge.abstractions.AmericanRestaurant;
import com.designpatterns.structural.bridge.abstractions.ItalianRestaurant;
import com.designpatterns.structural.bridge.abstractions.Restaurant;
import com.designpatterns.structural.bridge.implementations.PepperoniPizza;
import com.designpatterns.structural.bridge.implementations.VeggiePizza;

public class Client {
    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }
}

/*
Adding Sauce: Super Secret Recipe
Adding Toppings: Everything
Adding Pepperoni
Crust is: Thick
Order in Progress!
==========================================
Adding Sauce: Oil
Adding Toppings: -
Adding Cheese
Crust is: Thin
Order in Progress!
*/