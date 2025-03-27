package za.ca.cput.adp3capstone.repisitory;

import za.ca.cput.adp3capstone.domain.Flight;

import java.util.HashMap;

public class FlightRepository implements IFlightRepository{
    private HashMap<Double, Flight> flights = new HashMap<>();

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
