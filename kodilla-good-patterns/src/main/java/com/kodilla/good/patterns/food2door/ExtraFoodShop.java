package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements Manufacturer {
    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductsList();
    }

    private Map<Product, Integer> createProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Dairy("goat's cheese", "goat's"), 10);
        productsList.put(new Dairy("yogurt", "cow's"), 50);
        productsList.put(new Fruit("apple", true), 20);
        productsList.put(new Fruit("avokado", false), 90);

        return productsList;
    }
    @Override
    public boolean process(Customer customer, Map<Product, Integer>productsOrders) {

        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()){
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Product is unavailable");
                return false;
            }
        }
        return true;
    }
}