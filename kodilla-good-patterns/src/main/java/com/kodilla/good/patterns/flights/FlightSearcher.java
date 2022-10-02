package com.kodilla.good.patterns.flights;

import java.util.Scanner;

public class FlightSearcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Departure city: ");
        String flightFrom = scan.nextLine();
        System.out.println("Arrival city: ");
        String flightTo = scan.nextLine();
        Flight flight = new Flight(flightFrom, flightTo);
        System.out.println(flight.flightSearcher());
    }
}
