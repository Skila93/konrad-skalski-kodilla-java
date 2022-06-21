package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name;
    double baseOfTheTriangle;
    double height;

    public Triangle(String name) {
        this.name = name;
    }

    public Triangle(String name, double baseOfTheTriangle, double height) {
        this.name = name;
        this.baseOfTheTriangle = baseOfTheTriangle;
        this.height = height;
    }

    public String getShapeName(){
        return name;
    }
    public double getField(){
        return baseOfTheTriangle * height * 0.5;
    }
}