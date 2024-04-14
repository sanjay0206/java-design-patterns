package com.designpatterns.creational.factory;


import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTest {
    ShapeFactory factory = new ShapeFactory();
    Shape roundFood = factory.getFood("Round");
    Shape cylinderFood = factory.getFood("Cylinder");

    @Test
    public void factoryMethodTest() {
        Assert.assertEquals("Round", roundFood.getShape());
        Assert.assertEquals("Cylinder", cylinderFood.getShape());
    }
}
