package za.ca.cput.adp3capstone.repisitory;

import za.ca.cput.adp3capstone.domain.Flight;

import java.util.HashMap;

public interface IFlightRepository extends IRepository<Flight, Integer> {
    public HashMap<Integer, Flight> getAll();
}