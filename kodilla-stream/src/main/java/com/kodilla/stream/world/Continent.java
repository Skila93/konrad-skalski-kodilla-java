package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent{
    Set<Country> continent = new HashSet<>();
    public Set<Country> getContinent() {
        return continent;
    }
    public void addCountry(Country country){
        continent.add(country);
    }
}