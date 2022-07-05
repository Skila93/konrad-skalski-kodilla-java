package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
            //Countries with population
        BigDecimal germanPopulation = new BigDecimal("67390000");
        BigDecimal polishPopulation = new BigDecimal("37950000");
        BigDecimal frenchPopulation = new BigDecimal("83019200");
        BigDecimal japanPopulation = new BigDecimal("125800000");
        BigDecimal chinaPopulation = new BigDecimal("1400000000");
        BigDecimal singaporePopulation = new BigDecimal("5686000");
        BigDecimal egyptPopulation = new BigDecimal("102300000");
        BigDecimal keniaPopulation = new BigDecimal("53770000");
        Country germany = new Country("Germany", germanPopulation);
        Country poland = new Country("Poland", polishPopulation);
        Country france = new Country("France", frenchPopulation);
        Country japan = new Country("Japan", japanPopulation);
        Country china = new Country("China", chinaPopulation);
        Country singapore = new Country("Singapore", singaporePopulation);
        Country kenia = new Country("Kenia", keniaPopulation);
        Country egypt = new Country("Egypt", egyptPopulation);
            //Continents
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
            //World
        World world = new World();
            //Adding elements
        europe.addCountryEurope(poland);
        europe.addCountryEurope(germany);
        europe.addCountryEurope(france);

        asia.addCountryAsia(singapore);
        asia.addCountryAsia(china);
        asia.addCountryAsia(japan);

        africa.addCountryAfrica(kenia);
        africa.addCountryAfrica(egypt);

        world.worldAdd(europe);
        world.worldAdd(asia);
        world.worldAdd(africa);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("1875915200");
        assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}