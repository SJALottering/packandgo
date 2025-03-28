package za.ca.cput.adp3capstone.factory;

/* Itinerary.java
Itinerary Factory class
Author: Seja Kgomokaboya (222152672)
Date:28 March 2025
*/

import za.ca.cput.adp3capstone.domain.Itinerary;
//import za.ca.cput.adp3capstone.domain.Activity;
import za.ca.cput.adp3capstone.util.Helper;

import java.time.LocalDate;
import java.util.List;

public class ItineraryFactory {
    public static Itinerary createItinerary(String itineraryId, String travelPlanId, int day,
                                            LocalDate date, String activities) {
        if(Helper.isStringNullOrEmpty(itineraryId) || Helper.isStringNullOrEmpty(travelPlanId))

        if (day <= 0)
            return null;

        if (date == null || date.isBefore(LocalDate.now()))
            return null;

      /*  if (activities == null || activities.isEmpty())
            return null;*/

        return new Itinerary.Builder()
                .setItineraryId(itineraryId)
                .setTravelPlanId(travelPlanId)
                .setDay(day)
                .setDate(date)
                .setActivities(activities)
                .build();
    }
}