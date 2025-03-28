package za.ca.cput.adp3capstone.factory;
/* ItineraryDayFactoryTest.java
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.ItineraryDay;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ItineraryDayFactoryTest {

   @Test
    void testActvityDayCreate(){
       ItineraryDay itineraryDay = ItineraryDayFactory.createItineraryDay(1,
               "Beach",
               "A relaxing day",
               LocalDate.now().plusDays(3), 2000.99 );

       assertNotNull(itineraryDay);
       assertEquals(1, itineraryDay.getItineraryDayId());
       assertEquals("Beach", itineraryDay.getItineraryDayName());
       assertEquals("A relaxing day", itineraryDay.getItineraryDayDescription());
      assertEquals(LocalDate.now().plusDays(3), itineraryDay.getItineraryDayDate());
       assertEquals(2000.99, itineraryDay.getBudgetAmount() );

   }
}