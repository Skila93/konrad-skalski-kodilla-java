package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderProcessor {

    public void processAllOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("Mr. " + n.getCustomer().getName() + ", your order is processing");
                    return n.getFoodProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Is order confirmed: " + t + "\n"));
    }
}