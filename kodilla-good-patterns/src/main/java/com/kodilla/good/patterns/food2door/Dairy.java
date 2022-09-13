package com.kodilla.good.patterns.food2door;

public class Dairy extends Product {
    private String milkType;

    public Dairy(String productName, String milkType) {
        super(productName);
        this.milkType = milkType;
    }
}