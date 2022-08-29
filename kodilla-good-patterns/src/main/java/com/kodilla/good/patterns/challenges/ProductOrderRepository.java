package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean prepProductOrder(User user, LocalDateTime dateOfOrder, Product product, int quantity);
}