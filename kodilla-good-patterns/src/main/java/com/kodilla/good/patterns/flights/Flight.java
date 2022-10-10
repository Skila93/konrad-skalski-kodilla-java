package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {

    private Airport airportFrom;
    private Airport airportTo;

    public Flight(Airport airportFrom, Airport airportTo) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }
    public Airport getAirportFrom() {
        return airportFrom;
    }
    public Airport getAirportTo() {
        return airportTo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return airportFrom == flight.airportFrom &&
                airportTo == flight.airportTo;
    }

    @Override
    public int hashCode() {
        int result = airportFrom != null ? airportFrom.hashCode() : 0;
        result = 31 * result + (airportTo != null ? airportTo.hashCode() : 0);
        return result;
    }
}