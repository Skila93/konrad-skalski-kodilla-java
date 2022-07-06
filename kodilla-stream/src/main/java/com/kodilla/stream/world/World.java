package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    Set<Continent> world = new HashSet<>();
    public void worldAdd(Continent continent){
        world.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal worldPeople = world.stream()
                .flatMap(country -> country.getContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPeople;
    }
}