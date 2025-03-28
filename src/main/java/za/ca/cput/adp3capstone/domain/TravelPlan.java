package za.ca.cput.adp3capstone.domain;
/* TravelPlan.java
TravelPLan domain class
Author: Brezano Liebenberg (230463886)
Date: 28 March 2025
 */

public class TravelPlan {
    private String travelPlanId;
    private String destinationCountry;
    private int tripDuration;
    private String accommodationType;
    private double accommodationBudget;
    private String transportationType;
    private double transportationBudget;
    private double foodBudget;
    private String iteniraryDayActivity;
    private double emergencyFund;
    private double total;

    private TravelPlan(){}

    private TravelPlan(Builder builder){
        this.travelPlanId = builder.travelPlanId;
        this.destinationCountry = builder.destinationCountry;
        this.tripDuration = builder.tripDuration;
        this.accommodationType = builder.accommodationType;
        this.accommodationBudget = builder.accommodationBudget;
        this.transportationType = builder.transportationType;
        this.transportationBudget = builder.transportationBudget;
        this.foodBudget = builder.foodBudget;
        this.iteniraryDayActivity = builder.iteniraryDayActivity;
        this.emergencyFund = builder.emergencyFund;
        this.total = builder.total;
    }

    public String getTravelPlanId() {return travelPlanId;}

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public int getTripDuration() {
        return tripDuration;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public double getAccommodationBudget() {
        return accommodationBudget;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public double getTransportationBudget() {
        return transportationBudget;
    }

    public double getFoodBudget() {
        return foodBudget;
    }

    public String getIteniraryDayActivity() {
        return iteniraryDayActivity;
    }

    public double getEmergencyFund() {
        return emergencyFund;
    }

    public double getTotal() {
        return total;
    }

    public static class Builder{
        private String travelPlanId;
        private String destinationCountry;
        private int tripDuration;
        private String accommodationType;
        private double accommodationBudget;
        private String transportationType;
        private double transportationBudget;
        private double foodBudget;
        private String iteniraryDayActivity;
        private double emergencyFund;
        private double total;

        public Builder setTravelPlanId(String travelPlanId) {
            this.travelPlanId = travelPlanId;
            return this;
        }

        public Builder setDestinationCountry(String destinationCountry) {
            this.destinationCountry = destinationCountry;
            return this;
        }

        public Builder setTripDuration(int tripDuration) {
            this.tripDuration = tripDuration;
            return this;
        }

        public Builder setAccommodationType(String accommodationType) {
            this.accommodationType = accommodationType;
            return this;
        }

        public Builder setAccommodationBudget(double accommodationBudget) {
            this.accommodationBudget = accommodationBudget;
            return this;
        }

        public Builder setTransportationType(String transportationType) {
            this.transportationType = transportationType;
            return this;
        }

        public Builder setTransportationBudget(double transportationBudget) {
            this.transportationBudget = transportationBudget;
            return this;
        }

        public Builder setFoodBudget(double foodBudget) {
            this.foodBudget = foodBudget;
            return this;
        }

        public Builder setIteniraryDayActivity(String iteniraryDayActivity) {
            this.iteniraryDayActivity = iteniraryDayActivity;
            return this;
        }

        public Builder setEmergencyFund(double emergencyFund) {
            this.emergencyFund = emergencyFund;
            return this;
        }

        public Builder setTotal(double total) {
            this.total = total;
            return this;
        }

        public Builder copy(TravelPlan travelPlan){
            this.travelPlanId = travelPlan.travelPlanId;
            this.destinationCountry = travelPlan.destinationCountry;
            this.tripDuration = travelPlan.tripDuration;
            this.accommodationType = travelPlan.accommodationType;
            this.accommodationBudget = travelPlan.accommodationBudget;
            this.transportationType = travelPlan.transportationType;
            this.transportationBudget = travelPlan.transportationBudget;
            this.foodBudget = travelPlan.foodBudget;
            this.iteniraryDayActivity = travelPlan.iteniraryDayActivity;
            this.emergencyFund = travelPlan.emergencyFund;
            this.total = travelPlan.total;
            return this;
        }

        public TravelPlan build(){return new TravelPlan(this);}
    }
}
