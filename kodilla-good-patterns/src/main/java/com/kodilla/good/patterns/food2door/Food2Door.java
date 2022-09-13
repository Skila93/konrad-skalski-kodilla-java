package com.kodilla.good.patterns.food2door;

public class Food2Door {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processAllOrders(new OrderGenerator().generate());
    }
}