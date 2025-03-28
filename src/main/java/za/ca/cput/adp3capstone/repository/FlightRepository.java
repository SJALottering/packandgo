package za.ca.cput.adp3capstone.repository;

/* Employee.java
Flight Repository class
Author: Ethan Le Roux (222622172)
Date:28 March 2025
*/

import za.ca.cput.adp3capstone.domain.Flight;
import za.ca.cput.adp3capstone.factory.FlightFactory;

import java.io.IOException;
import java.util.HashMap;

public class FlightRepository implements IFlightRepository{
    private HashMap<Integer, Flight> flights;
    private static IFlightRepository repository = null;

    private FlightRepository() {
        flights = new HashMap<Integer, Flight>();
    }

    public static IFlightRepository getRepository() {
        if(repository == null) {
            repository = new FlightRepository();
        }
        return repository;
    }

    @Override
    public HashMap<Integer, Flight> getAll() {
        return flights;
    }

    @Override
    public Flight get(Integer flightId) {
        return flights.get(flightId);
    }

    @Override
    public Flight create(Flight flight) {
        if(flight==null){
            return null;
        }
        flights.put(flight.getFlightId(), flight);
        return flight;
    }

    @Override
    public Flight update(Integer flightId, Flight newFlight) {
        Flight flight = flights.get(flightId);

        Flight updatedFlight = newFlight;
        if(updatedFlight==null){
            flights.put(flightId, updatedFlight);
            return null;
        }
        return updatedFlight;
    }

    @Override
    public boolean delete(Integer flightId) {
        Flight flight = flights.get(flightId);
        if(flight==null){
            return false;
        }
        flights.remove(flightId);
        return true;
    }
}
