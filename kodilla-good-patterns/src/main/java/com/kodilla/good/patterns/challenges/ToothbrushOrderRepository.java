package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Random;

public class ToothbrushOrderRepository implements ProductOrderRepository {
    public boolean prepProductOrder(User user, LocalDateTime orderDate, Product product, int quantity) {
        return new Random().nextBoolean();
    }
}