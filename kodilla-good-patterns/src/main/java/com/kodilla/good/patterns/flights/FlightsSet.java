package com.kodilla.good.patterns.flights;

import java.util.HashSet;

public class FlightsSet {

    public HashSet<Flight> retrieveFlightSet() {

        HashSet<Flight> flights = new HashSet<>();
        flights.add(new Flight(Airport.WAW, Airport.GDN));
        flights.add(new Flight(Airport.WAW, Airport.KRK));

        flights.add(new Flight(Airport.WRO, Airport.WAW));
        flights.add(new Flight(Airport.WRO, Airport.KRK));

        flights.add(new Flight(Airport.KRK, Airport.WAW));
        flights.add(new Flight(Airport.KRK, Airport.GDN));
        flights.add(new Flight(Airport.KRK, Airport.KAT));

        flights.add(new Flight(Airport.GDN, Airport.WAW));
        flights.add(new Flight(Airport.GDN, Airport.KRK));

        flights.add(new Flight(Airport.KAT, Airport.GDN));
        flights.add(new Flight(Airport.KAT, Airport.WAW));

        return flights;
    }
}