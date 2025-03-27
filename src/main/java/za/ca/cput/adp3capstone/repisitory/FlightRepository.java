package za.ca.cput.adp3capstone.repisitory;

import za.ca.cput.adp3capstone.domain.Flight;
import za.ca.cput.adp3capstone.factory.FlightFactory;

import java.io.IOException;
import java.util.HashMap;

public class FlightRepository implements IFlightRepository{
    private HashMap<Double, Flight> flights;
    private static IFlightRepository repository;

    public FlightRepository() throws IOException {
        flights = new HashMap<>();
        repository = getRepository();
    }

    private static IFlightRepository getRepository() throws IOException {
        if(repository == null) {
            repository = new FlightRepository();
        }
        return new FlightRepository();
    }

    @Override
    public HashMap<Double, Flight> getAll() {
        return flights;
    }

    @Override
    public Flight get(Double flightId) {
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
    public Flight update(Double flightId, Flight newFlight) {
        Flight flight = flights.get(flightId);

        Flight updatedFlight = newFlight;

        flights.put(flightId, updatedFlight);
        return null;
    }

    @Override
    public boolean delete(Double flightId) {
        Flight flight = flights.get(flightId);
        if(flight==null){
            return false;
        }
        flights.remove(flightId);
        return true;
    }
}
