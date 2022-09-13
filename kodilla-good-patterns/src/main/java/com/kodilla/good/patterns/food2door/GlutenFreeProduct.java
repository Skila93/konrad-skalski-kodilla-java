package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class GlutenFreeProduct extends Product {
    private String productDescription;

    public GlutenFreeProduct(String productName, String productDescription) {
        super(productName);
        this.productDescription = productDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GlutenFreeProduct glutenFreeProduct = (GlutenFreeProduct) o;

        return Objects.equals(productDescription, glutenFreeProduct.productDescription);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        return result;
    }
}