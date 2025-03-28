package za.ca.cput.adp3capstone.factory;

import za.ca.cput.adp3capstone.domain.TravelPlan;
import za.ca.cput.adp3capstone.util.Helper;



public class TravelPlanFactory{
    public static TravelPlan createTravelPlan(String travelPlanId,String destinationCountry, int tripDuration, String accommodationType, double accommodationBudget,
                                              String transportationType, double transportationBudget, double foodBudget,
                                              String iteniraryDayActivity, double emergencyFund, double total) {
        if (Helper.isStringNullOrEmpty(destinationCountry) || Helper.isIntNull(tripDuration) || Helper.isStringNullOrEmpty(accommodationType) || Helper.isDoubleNull(accommodationBudget)
                || Helper.isStringNullOrEmpty(transportationType) || Helper.isDoubleNull(transportationBudget) || Helper.isDoubleNull(foodBudget) || Helper.isStringNullOrEmpty(iteniraryDayActivity)
                || Helper.isDoubleNull(emergencyFund) || Helper.isDoubleNull(total))
            return null;

        return new TravelPlan.Builder().setTravelPlanId(travelPlanId)
                .setDestinationCountry(destinationCountry)
                .setTripDuration(tripDuration)
                .setAccommodationType(accommodationType)
                .setAccommodationBudget(accommodationBudget)
                .setTransportationType(transportationType)
                .setTransportationBudget(transportationBudget)
                .setFoodBudget(foodBudget)
                .setIteniraryDayActivity(iteniraryDayActivity)
                .setEmergencyFund(emergencyFund)
                .setTotal(total)
                .build();
    }
}

