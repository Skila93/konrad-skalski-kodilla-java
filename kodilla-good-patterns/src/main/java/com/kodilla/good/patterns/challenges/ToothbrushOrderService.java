package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Random;

public class ToothbrushOrderService implements ProductOrderService {
    public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        return new Random().nextBoolean();
    }
}
