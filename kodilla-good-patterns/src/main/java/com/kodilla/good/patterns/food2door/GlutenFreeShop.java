package com.kodilla.good.patterns.food2door;

import java.util.*;

public class GlutenFreeShop implements Manufacturer {
    private Map<Product, Integer> productsList;

    public GlutenFreeShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("shitake mushrooms", "dried"), 14);
        productsList.put(new GlutenFreeProduct("coconut milk", "one can of coconut milk"), 30);
        productsList.put(new GlutenFreeProduct("kimchi", "ingredients: chinese cabbage, turnip greens"), 11);
        productsList.put(new GlutenFreeProduct("nori algae", "algae perfect for sushi"), 80);

        return productsList;
    }
    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}