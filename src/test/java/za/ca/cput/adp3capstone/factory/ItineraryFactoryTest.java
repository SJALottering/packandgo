
package za.ca.cput.adp3capstone.factory;

import org.junit.jupiter.api.*;
import za.ca.cput.adp3capstone.domain.Itinerary;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ItineraryFactoryTest {

    public static Itinerary i1 = ItineraryFactory.createItinerary(
            "HK001", "HK100", 1, LocalDate.now(), "Bungee Jumping");

    public static Itinerary i2 = ItineraryFactory.createItinerary(
            "HK002", "HK200", 2, LocalDate.now().plusDays(3), "Hiking, Sunset Cruise");

    public static Itinerary i3 = ItineraryFactory.createItinerary(
            "", "", -1, null, "");

    @Test
    @Order(1)
    public void testCreateItinerary() {
        assertNotNull(i1);
        System.out.println(i1.toString());
    }

    @Test
    @Order(2)
    public void testCreateItineraryWithAllAttributes() {
        assertNotNull(i2);
        System.out.println(i2.toString());
    }

    @Test
    @Order(3)
    public void testCreateItineraryThatFails() {
        assertNull(i3);
        System.out.println(i3);
    }

    @Test
    @Order(4)
    @Disabled
    public void testNotImplementedYet() {
        // Todo
    }
}
