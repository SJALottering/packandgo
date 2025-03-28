package za.ca.cput.adp3capstone.repisitory;

import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.Flight;
import za.ca.cput.adp3capstone.factory.FlightFactory;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class FlightRepositoryTest {

    private static IFlightRepository repository = FlightRepository.getRepository();

    private Flight flight1 =  FlightFactory.createFlight(12345, "JFK", "LAX", 360, "Boeing 747", "Delta", "Economy",
            "DL456", "Standard", false, 299.99);
    private Flight flight2 =  FlightFactory.createFlight(32145, "JFK", "HND", 360, "Boeing 747", "Delta", "First",
            "DL345", "Premium", false, 299.99);
    private Flight flight3 =  FlightFactory.createFlight(54321, "CPT", "AUS", 360, "Boeing 747", "Delta", "Middle",
            "DL232", "Economy", false, 299.99);

    @Test
    void testGetAllFlight() {
        HashMap<Integer, Flight> flights = repository.getAll();
        assertNotNull(flights);
    }

    @Test
    void testGetFlight() {
        Flight testFlight = repository.get(12345);
        assertNotNull(testFlight);
    }

    @Test
    void testCreateFlight() {
        Flight createdFlight = repository.create(flight1);
        assertNotNull(createdFlight);
    }

    @Test
    void testUpdateFlight() {
        Flight flightToUpdate =  FlightFactory.createFlight(54321, "CPT", "AUS", 360, "Boeing 747", "Delta", "Middle",
                "DL232", "Economy", false, 299.99);
        Flight flightWithUpdatedDetails =  FlightFactory.createFlight(54321, "JPN", "CPT", 500, "Spmething 747", "Alpha", "Premium",
                "DL232", "Economy", false, 999.99);

        Flight updatedFlight = repository.update(flightToUpdate.getFlightId(),flightWithUpdatedDetails);
        assertNotNull(updatedFlight);
    }

    @Test
    void testDeleteFlight() {
        HashMap<Integer, Flight> flights = new HashMap<>();
        flights.put(flight1.getFlightId(),flight1);
        flights.put(flight2.getFlightId(),flight2);
        flights.put(flight3.getFlightId(),flight3);

        repository.create(flight1);
        repository.create(flight2);
        repository.create(flight3);

        boolean isFlightDeleted = repository.delete(54321);
        assertTrue(isFlightDeleted);
    }
}