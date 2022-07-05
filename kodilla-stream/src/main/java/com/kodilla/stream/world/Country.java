package com.kodilla.stream.world;
import java.math.BigDecimal;

public class Country{
    BigDecimal population;
    String countryName;

    public Country(String countryName, BigDecimal population) {
        this.population = population;
        this.countryName = countryName;
    }
    public BigDecimal getPeopleQuantity(){
        return population;
    }

    public String getCountryName() {
        return countryName;
    }
}