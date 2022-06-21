package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    double sideA;
    double sideB;

    public Square(String name) {
        this.name = name;
    }

    public Square(String name, double sideA, double sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String getShapeName(){
        return name;
    }
    public double getField(){
        return sideA * sideB;
    }
}