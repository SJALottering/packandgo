package za.ca.cput.adp3capstone.factory;
/* Employee.java
Flight Factory test class
Author: Ethan Le Roux (222622172)
Date:28 March 2025
*/
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Flight;
import za.ca.cput.adp3capstone.repository.FlightRepository;
import za.ca.cput.adp3capstone.repository.IFlightRepository;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFactoryTest {
    private Flight flight1 =  FlightFactory.createFlight(12345, "JFK", "LAX", 360, "Boeing 747", "Delta", "Economy",
            "DL456", "Standard", false, 299.99);

    @Test
    public void testCreateFlight() {
        assertNotNull(flight1);
        System.out.println(flight1);
    }
}