package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private Manufacturer manufacturer;
    private Map<Product, Integer> productOrderRequest;


    public OrderRequest(Customer customer, Manufacturer manufacturer, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.manufacturer = manufacturer;
        this.productOrderRequest = productOrderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Manufacturer getFoodManufacturer() {
        return manufacturer;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}