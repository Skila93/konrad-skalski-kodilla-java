package com.kodilla.testing.shape;

public class Circle implements Shape{
    String name;
    double radius;

    public Circle(String name) {
        this.name = name;
    }

    public Circle(String circle, int radius) {
        this.name = circle;
        this.radius = radius;
    }

    public String getShapeName(){
        return name;
    }
    public double getField(){
        return radius * radius * 3.14;
    }
}
