package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements Manufacturer {
    private Map<Product, Integer> productsList;

    public HealthyShop() {
        productsList = createProductList();
    }
    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("muesli", "soya flakes , maize flakes"), 10);
        productsList.put(new GlutenFreeProduct("pasta", "rice flour"), 30);
        productsList.put(new Fruit("chokeberry", true), 20);
        productsList.put(new Fruit("banana", false), 41);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (productsOrders.size() >= 2 && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println(productQty);
                System.out.println("Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}