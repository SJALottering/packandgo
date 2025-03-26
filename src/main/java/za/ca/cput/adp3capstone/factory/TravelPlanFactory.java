package za.ca.cput.adp3capstone.factory;

import za.ca.cput.adp3capstone.domain.TravelPlan;
import za.ca.cput.adp3capstone.util.Helper;

public class TravelPlanFactory{
    public static TravelPlan createTravelPlan(String destinationCountry, int tripDuration, String accommodationType, double accommodationBudget,
                                              String transportationType, double transportationBudget, double foodBudget,
                                              String iteniraryDayActivity, double currencyExchangeRate, double emergencyFund) {
        if (Helper.isNullorEmpty(destinationCountry) || Helper.isNull(tripDuration) || Helper.isNullorEmpty(accommodationType) || Helper.isNull2(accommodationBudget)
                || Helper.isNullorEmpty(transportationType) || Helper.isNull2(transportationBudget) || Helper.isNull2(foodBudget) || Helper.isNullorEmpty(iteniraryDayActivity)
                || Helper.isNull2(currencyExchangeRate) || Helper.isNull2(emergencyFund))
            return null;

        return new TravelPlan.Builder().setDestinationCountry(destinationCountry)
                .setTripDuration(tripDuration)
                .setAccommodationType(accommodationType)
                .setAccommodationBudget(accommodationBudget)
                .setTransportationType(transportationType)
                .setTransportationBudget(transportationBudget)
                .setFoodBudget(foodBudget)
                .setIteniraryDayActivity(iteniraryDayActivity)
                .setCurrencyExchangeRate(currencyExchangeRate)
                .setEmergencyFund(emergencyFund)
                .build();
    }
}

