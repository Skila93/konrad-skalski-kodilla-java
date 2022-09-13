package com.kodilla.good.patterns.food2door;

public class Fruit extends Product {
    private boolean comesFromDomesticCorps;

    public Fruit(String productName, boolean comesFromDomesticCorps) {
        super(productName);
        this.comesFromDomesticCorps = comesFromDomesticCorps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Fruit that = (Fruit) o;

        return comesFromDomesticCorps == that.comesFromDomesticCorps;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (comesFromDomesticCorps ? 1 : 0);
        return result;
    }
}