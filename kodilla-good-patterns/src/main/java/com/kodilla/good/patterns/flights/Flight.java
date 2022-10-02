package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Flight {
    private final String from;
    private final String to;
    public List<String> flightsFromKrakow = new LinkedList<>();
    public List<String> flightsToWroclaw = new LinkedList<>();
    public Flight(String from, String to) {
        this.from = from;
        this.to = to;
        flightsFromKrakow.add("Wroclaw");
        flightsFromKrakow.add("Warsaw");
        flightsFromKrakow.add("Helsinki");
        flightsFromKrakow.add("Wroclaw");

        flightsToWroclaw.add("Krakow");
        flightsToWroclaw.add("Warsaw");
        flightsToWroclaw.add("Berlin");
        flightsToWroclaw.add("Krakow");
        flightsToWroclaw.add("Prague");
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public List<String> getFlightsFromKrakow() {
        return flightsFromKrakow;
    }

    public List<String> getFlightsToWroclaw() {
        return flightsToWroclaw;
    }
    public String flightSearcher(){
        for (String flightFrom : flightsFromKrakow){
            if(flightFrom.equals(from)){
                for (String fligtTo : flightsToWroclaw){
                    if(fligtTo.equals(to)){
                        return "Flight from " + from + " to " + to + " is available.";
                    }
                }
            }
        }
        return "Nie znaleziono lotu";
    }
}
