package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private HashSet<Flight> flightDataBase;

    public FlightSearch(HashSet<Flight> flightDataBase) {
        this.flightDataBase = flightDataBase;
    }

    public List<String> findDestinationsFrom(Airport airport) {

        List<String> foundFlights = flightDataBase.stream()
                .filter(f -> f.getAirportFrom().equals(airport))
                .map(f -> f.getAirportTo().getName())
                .collect(Collectors.toCollection(ArrayList::new));
        return foundFlights;
    }

    public List<String> findArrivalsTo(Airport airport) {

        List<String> foundFlights = flightDataBase.stream()
                .filter(f -> f.getAirportTo().equals(airport))
                .map(f -> f.getAirportFrom().getName())
                .collect(Collectors.toCollection(ArrayList::new));
        return foundFlights;
    }

    public List<String> findIndirectFlightsFromTo(Airport airportSource, Airport airportDestination) {

        List<Airport> airportsToDestination = flightDataBase.stream()
                .filter(f -> f.getAirportTo().getName().equals(airportDestination.getName()))
                .map(f -> f.getAirportFrom())
                .collect(Collectors.toCollection(ArrayList::new));

        List<String> foundFlights = new ArrayList<>();

        for (Airport airport : airportsToDestination) {
            flightDataBase.stream()
                    .filter(f -> f.getAirportFrom().equals(airportSource) && f.getAirportTo().equals(airport))
                    .map(f -> f.getAirportTo())
                    .forEach(f -> foundFlights.add(f.getName()));
        }
        return foundFlights;
    }
}