package com.designpatterns.structural.decorator;

public class Client {
  public static void main(String[] args) {
    NormalCoffeeMachine normal = new NormalCoffeeMachine();
    EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);

    System.out.println("Calling normal coffee machine\n------------------------------");
    normal.makeSmallCoffee();
    normal.makeLargeCoffee();

    System.out.println("\nCalling Enhanced normal coffee machine\n---------------------------------------");
    enhanced.makeSmallCoffee();
    enhanced.makeLargeCoffee();
    enhanced.makeMilkCoffee();
  }
}
