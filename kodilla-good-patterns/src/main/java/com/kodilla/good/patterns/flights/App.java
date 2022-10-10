package com.kodilla.good.patterns.flights;

public class App {

    public static void main(String[] args) {

        FlightSearch fs = new FlightSearch(new FlightsSet().retrieveFlightSet());

        System.out.println("All arrivals to " + Airport.WAW.getName() + " are: " + fs.findArrivalsTo(Airport.WAW));

        System.out.println("All departures from " + Airport.WAW.getName() + " are: " + fs.findDestinationsFrom(Airport.WAW));

        System.out.println("Indirect flights from - " + Airport.WAW.getName()
                + " through " + fs.findIndirectFlightsFromTo(Airport.WAW, Airport.KAT) + " to " + Airport.KAT.getName());
    }
}