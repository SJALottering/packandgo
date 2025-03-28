package za.ca.cput.adp3capstone.repository;

/* Employee.java
Flight Repository interface
Author: Ethan Le Roux (222622172)
Date:28 March 2025
*/

import za.ca.cput.adp3capstone.domain.Flight;

import java.util.HashMap;

public interface IFlightRepository extends IRepository<Flight, Integer> {
    public HashMap<Integer, Flight> getAll();
}