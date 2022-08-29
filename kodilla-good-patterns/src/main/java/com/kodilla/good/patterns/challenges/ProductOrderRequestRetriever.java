package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("Jumper13", "Karol", "Skoczek");
        LocalDateTime orderDate = LocalDateTime.of(2020, 3, 5, 11, 7, 44);
        Product product = new Toothbrush("Manual toothbrush",
                "Soft",
                new BigDecimal("8"));
        int quantity = 1;

        System.out.println("Retrieve product request:");
        System.out.println("User: " + user.getUserName() +
                " Date: " + orderDate + "\n" +
                product + ", quantity=" + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}