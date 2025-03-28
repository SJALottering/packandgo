package za.ca.cput.adp3capstone.factory;
/* ItineraryDayActivityFactoryTest.java
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.ItineraryDayActivity;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ItineraryActivityFactoryTest {
    private ItineraryDayActivity activity;

    @BeforeEach
    void setUp() {
        activity = ItineraryActivityFactory.createItineraryDayActivity(
                2, 1, "Zoo day", "Go to the zoo to see the wildlife",
                LocalTime.of(8, 30), LocalTime.of(12, 0), 200.00
        );
    }

    @Test
    void testCreateItineraryActivityFactory() {
        assertNotNull(activity, "Activity should not be null");
        assertEquals(2, activity.getActivityId());
        assertEquals(1, activity.getitineraryDayId());
        assertEquals("Zoo day", activity.getActivityName());
        assertEquals("Go to the zoo to see the wildlife", activity.getActivityDescription());
        assertEquals(LocalTime.of(8, 30), activity.getStartTime());
        assertEquals(LocalTime.of(12, 0), activity.getEndTime());
        assertEquals(200.00, activity.getCostPrice());
    }
}

