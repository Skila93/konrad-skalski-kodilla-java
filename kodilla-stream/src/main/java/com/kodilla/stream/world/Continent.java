package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent{
    Set<Country> europe = new HashSet<>();
    Set<Country> asia = new HashSet<>();
    Set<Country> africa = new HashSet<>();
    public Set<Country> getEurope() {
        return europe;
    }
    public Set<Country> getAsia() {
        return asia;
    }
    public Set<Country> getAfrica() {
        return africa;
    }
    public void addCountryEurope(Country country){
        europe.add(country);
    }
    public void addCountryAsia(Country country){
        asia.add(country);
    }
    public void addCountryAfrica(Country country){
        africa.add(country);
    }
}