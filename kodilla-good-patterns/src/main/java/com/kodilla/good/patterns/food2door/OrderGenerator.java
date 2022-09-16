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
        productsList.put(new GlutenFreeProduct("shitake mushrooms", "dried"), 2);
        productsList.put(new GlutenFreeProduct("kimchi", "one can of coconut milk"), 3);
        productsList.put(new GlutenFreeProduct("nori algae", "algae perfect for sushi"), 1000);

        orderRequestList.add(new OrderRequest(customer, manufacturer, productsList));

        Customer customer1 = new Customer("Kamil");
        Manufacturer manufacturer1 = new HealthyShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList.put(new Fruit("chokeberry", true), 5);
        productsList.put(new Fruit("banana", false), 2);
        productsList.put(new GlutenFreeProduct("kimchi", "ingredients: chinese cabbage, turnip greens"), 1);

        orderRequestList.add(new OrderRequest(customer1, manufacturer1, productsList1));

        return orderRequestList;
    }
}