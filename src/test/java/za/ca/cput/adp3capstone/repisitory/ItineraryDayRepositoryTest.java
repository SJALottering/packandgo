package za.ca.cput.adp3capstone.repisitory;
/* ItineraryDayRepositoryTest.java
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.ItineraryDay;
import za.ca.cput.adp3capstone.factory.ItineraryDayFactory;
import za.ca.cput.adp3capstone.repository.ItineraryDayRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ItineraryDayRepositoryTest {
    private ItineraryDayRepository repository;
    private ItineraryDay itineraryDay1, itineraryDay2;


    @BeforeEach
    void setUp() {
        repository = ItineraryDayRepository.getRepo();
        itineraryDay1 = ItineraryDayFactory.createItineraryDay(1, "Day 1",
                "Visit Cape Point", LocalDate.now(), 500.0);

        itineraryDay2 = ItineraryDayFactory.createItineraryDay(2, "Day 2",
                "Visit Grand Musuem", LocalDate.now(), 300.90);
    }


    @Test
    void testCreate() {
        ItineraryDay created = repository.create(itineraryDay1);
        assertNotNull(created);
        assertEquals(itineraryDay1.getItineraryDayId(), created.getItineraryDayId());
        System.out.println(created);

    }

    @Test
    void testUpdate() {
        repository.create(itineraryDay1);
        ItineraryDay updated = new ItineraryDay.Builder()
                .setItineraryDayId(1)
                .setItineraryDayName("Day 1 Updated")
                .setItineraryDayDescription("Updated Visit")
                .setItineraryDayDate(LocalDate.now())
                .setBudgetAmount(700.0)
                .build();

        ItineraryDay result = repository.update(1, updated);
        assertNotNull(result);
        assertEquals("Day 1 Updated", result.getItineraryDayName());
        System.out.println(result);

    }

    @Test
    void testDelete() {
        repository.create(itineraryDay1);
        boolean deleted = repository.delete(itineraryDay1.getItineraryDayId());
        assertTrue(deleted);
        assertNull(repository.get(itineraryDay1.getItineraryDayId()));
    }

    @Test
    void testGet() {
        repository.create(itineraryDay1);
        ItineraryDay retrieved = repository.get(itineraryDay1.getItineraryDayId());
        assertNotNull(retrieved);
        assertEquals(itineraryDay1.getItineraryDayId(), retrieved.getItineraryDayId());
    }

    @Test
    void testFindItineraryDays() {
        repository.create(itineraryDay1);
        repository.create(itineraryDay2);
        assertEquals(2, repository.findItineraryDays().size());
        System.out.println(repository.findItineraryDays());

    }
}