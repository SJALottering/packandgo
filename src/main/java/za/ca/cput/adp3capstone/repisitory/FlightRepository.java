package za.ca.cput.adp3capstone.repisitory;

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
    public Flight get(int flightId) {
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
    public Flight update(int flightId, Flight newFlight) {
        Flight flight = flights.get(flightId);

        Flight updatedFlight = newFlight;

        flights.put(flightId, updatedFlight);
        return null;
    }

    @Override
    public boolean delete(int flightId) {
        Flight flight = flights.get(flightId);
        if(flight==null){
            return false;
        }
        flights.remove(flightId);
        return true;
    }
}
