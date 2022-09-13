package com.kodilla.good.patterns.food2door;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderGenerator {

    public List<OrderRequest> generate() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("Jerzy");
        Manufacturer manufacturer = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GlutenFreeProduct("bread", "Bread made from coconut flour"), 2);
        productsList.put(new GlutenFreeProduct("rice", "extraordinary white rice"), 3);
        productsList.put(new GlutenFreeProduct("cookies", "amaranth cookies with dactyls"), 1000);

        orderRequestList.add(new OrderRequest(customer, manufacturer, productsList));

        Customer customer1 = new Customer("Kamil");
        Manufacturer manufacturer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList.put(new GlutenFreeProduct("bread", "Bread made from coconut flour"), 2);
        productsList.put(new GlutenFreeProduct("rice", "extraordinary white rice"), 3);
        productsList.put(new GlutenFreeProduct("cookies", "amaranth cookies with dactyls"), 1);

        orderRequestList.add(new OrderRequest(customer1, manufacturer1, productsList1));

        return orderRequestList;
    }
}