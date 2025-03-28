package za.ca.cput.adp3capstone.factory;
/* ItineraryDayFactory Class
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import za.ca.cput.adp3capstone.domain.ItineraryDay;
import za.ca.cput.adp3capstone.util.Helper;

import java.time.LocalDate;

public class ItineraryDayFactory {
    public static ItineraryDay createItineraryDay(int itineraryDayId, String itineraryDayName, String itineraryDayDescription, LocalDate itineraryDayDate, double budgetAmount){
        if (Helper.isIntNull(itineraryDayId) ||
                Helper.isStringNullOrEmpty(itineraryDayName) ||
                Helper.isStringNullOrEmpty(itineraryDayDescription) ||
                Helper.isDoubleNull(budgetAmount) ||
                itineraryDayDate == null) {
            return null;
        }
        return new ItineraryDay.Builder()
                .setItineraryDayId(itineraryDayId)
                .setItineraryDayName(itineraryDayName)
                .setItineraryDayDescription(itineraryDayDescription)
                .setItineraryDayDate(itineraryDayDate)
                .setBudgetAmount(budgetAmount)
                .build();
    }
}
