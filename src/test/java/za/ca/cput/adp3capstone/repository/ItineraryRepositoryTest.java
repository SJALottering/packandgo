package za.ca.cput.adp3capstone.repository;

/* Itinerary.java
Itinerary Repository Test class
Author: Seja Kgomokaboya (222152672)
Date:28 March 2025
*/

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ca.cput.adp3capstone.domain.Itinerary;
import za.ca.cput.adp3capstone.factory.ItineraryFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ItineraryRepositoryTest {

    private static IItineraryRepository repository;

    @BeforeAll
    static void setup() {
        try {
            repository = ItineraryRepository.getRepository();
        } catch (Exception e) {
            fail("Failed to initialize repository: " + e.getMessage());
        }
    }

    private Itinerary itinerary = ItineraryFactory.createItinerary("IT001", "TP123", 1, LocalDate.now().plusDays(3), "Hiking, Scuba Diving");

    @Test
    void a_create() {
        Itinerary created = repository.create(itinerary);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Itinerary read = repository.get(itinerary.getItineraryId());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Itinerary newItinerary = new Itinerary.Builder().copy(itinerary).setDay(2).build();
        Itinerary updated = repository.update(itinerary.getItineraryId(), newItinerary);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(itinerary.getItineraryId()));
        System.out.println("Success: itinerary deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
