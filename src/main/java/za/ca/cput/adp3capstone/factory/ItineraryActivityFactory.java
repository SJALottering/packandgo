package za.ca.cput.adp3capstone.factory;

import za.ca.cput.adp3capstone.domain.ItineraryDayActivity;
import za.ca.cput.adp3capstone.util.Helper;

import java.time.LocalDate;
import java.time.LocalTime;

public class ItineraryActivityFactory {
    public static ItineraryDayActivity createItineraryDayActivity(int activityDayId, int itineraryDayId, String activityName,
                                                                  String activityDescription, LocalTime startTime,
                                                                  LocalTime endTime, double costPrice) {
        if (Helper.isStringNullOrEmpty(activityName) || Helper.isStringNullOrEmpty(activityDescription)) {
            return null;
        }
        if (activityDayId <= 0)
            return null;

        if (startTime == null || endTime == null || endTime.isBefore(startTime)) {
            return null;
        }

        return new ItineraryDayActivity.Builder()
                .setActivityId(activityDayId)
                .setItineraryDayId(itineraryDayId)
                .setActivityName(activityName)
                .setActivityDescription(activityDescription)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .setCostPrice(costPrice)
                .build();
    }
}

