package za.ca.cput.adp3capstone.repisitory;

import za.ca.cput.adp3capstone.domain.Flight;

import java.util.HashMap;

public interface IFlightRepository extends IRepository<Flight, Double> {
    public HashMap<Double, Flight> getAll();;
}