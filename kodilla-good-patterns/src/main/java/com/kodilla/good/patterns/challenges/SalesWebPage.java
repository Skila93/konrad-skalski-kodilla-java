package com.kodilla.good.patterns.challenges;

public class SalesWebPage {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MessageService(), new ToothbrushOrderService(), new ToothbrushOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}