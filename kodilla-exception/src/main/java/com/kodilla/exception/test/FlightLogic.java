package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FlightLogic {
    public final void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> possibleFlights = new HashMap<>();
        possibleFlights.put("Warsaw", true);
        possibleFlights.put("New York", false);
        possibleFlights.put("Rome", false);
        possibleFlights.put("Berlin", true);
        possibleFlights.put("London", true);
        String arrivalAirport = flight.getArrivalAirport();
        System.out.println("Departure airport: " + flight.getDepartureAirport());
        System.out.println("Arrival Airport: " + arrivalAirport);
        if (possibleFlights.get(arrivalAirport)){
            System.out.println("The flight may take place");
        }else{
            System.out.println("Flight to chosen destination is not available");
            throw new RouteNotFoundException();
        }
    }
    public static void main(String[] args)
    {
        Flight berlinWarsaw = new Flight("Berlin", "Warsaw");
        Flight newYorkBerlin = new Flight("New York", "Berlin");
        Flight newYorkRome = new Flight("New York", "Rome");
        Flight romeLondon = new Flight("Rome", "London");
        Flight romeNewYork = new Flight("Rome", "New York");
        FlightLogic flightLogic = new FlightLogic();
        try {
            flightLogic.findFlight(berlinWarsaw);
            flightLogic.findFlight(newYorkBerlin);
            flightLogic.findFlight(newYorkRome);
            flightLogic.findFlight(romeLondon);
            flightLogic.findFlight(romeNewYork);
        }catch(RouteNotFoundException e) {
            System.out.println("Choose another flight");
        }
    }
}