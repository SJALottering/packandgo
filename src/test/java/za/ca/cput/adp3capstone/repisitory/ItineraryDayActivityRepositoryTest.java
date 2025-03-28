package za.ca.cput.adp3capstone.repisitory;
/* ItineraryDayActivityRepositoryTest.java
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.ItineraryDayActivity;
import za.ca.cput.adp3capstone.factory.ItineraryActivityFactory;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ItineraryDayActivityRepositoryTest {
    private ItineraryDayActivityRepository repository = ItineraryDayActivityRepository.getRepository();
    private ItineraryDayActivity activity1, activity2;

    @BeforeEach
    void setUp() {
        activity1 = ItineraryActivityFactory.createItineraryDayActivity(
                1, 1, "Hiking", "Hiking Signal Hill",
                LocalTime.of(12, 0), LocalTime.of(14, 0),
                100.0
        );

        activity2 = ItineraryActivityFactory.createItineraryDayActivity(
                2, 1, "City Tour", "Exploring Cape Town City",
                LocalTime.of(15, 0), LocalTime.of(17, 0),
                150.0
        );

    }



    @Test
    void create() {
        ItineraryDayActivity created = repository.create(activity1);
        assertNotNull(created);
        assertEquals(activity1.getActivityId(), created.getActivityId());
    }

    @Test
    void update() {
        repository.create(activity1);
        ItineraryDayActivity updatedActivity = ItineraryActivityFactory.createItineraryDayActivity(
                1, 1, "Updated Hiking", "Hiking Signal Hill - Sunset",
                LocalTime.of(18, 0), LocalTime.of(20, 0),
                120.0
        );

        ItineraryDayActivity result = repository.update(1, updatedActivity);

        assertNotNull(result);

        assertEquals("Updated Hiking", result.getActivityName());
        assertEquals(LocalTime.of(18, 0), result.getStartTime());
        assertEquals(LocalTime.of(20, 0), result.getEndTime());
    }


    @Test
    void get() {
        repository.create(activity1);
        ItineraryDayActivity retrieved = repository.get(1);

        assertNotNull(retrieved);
        assertEquals(activity1.getActivityId(), retrieved.getActivityId());
        assertEquals(activity1.getActivityName(), retrieved.getActivityName());
    }

    @Test
    void delete() {

        repository.create(activity1);
        boolean deleted = repository.delete(1);


        assertTrue(deleted);
        assertNull(repository.get(1));
    }

    @Test
    void getAll() {
        repository.create(activity1);
        repository.create(activity2);
        assertEquals(2, repository.getAll().size());
    }
}