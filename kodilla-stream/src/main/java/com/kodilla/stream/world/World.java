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
        BigDecimal eur = world.stream()
                .flatMap(country -> country.getEurope().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        BigDecimal asia = world.stream()
                .flatMap(country -> country.getAsia().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        BigDecimal afr = world.stream()
                .flatMap(country -> country.getAfrica().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        BigDecimal euras = eur.add(asia);
        return euras.add(afr);
    }
}