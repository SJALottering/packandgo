package za.ca.cput.adp3capstone.domain;

//Add name

public class TravelPlan {
    private String destinationCountry;
    private int tripDuration;
    private String accommodationType;
    private double accommodationBudget;
    private String transportationType;
    private double transportationBudget;
    private double foodBudget;
    private String iteniraryDayActivity;
    private double currencyExchangeRate;
    private double emergencyFund;

    private TravelPlan(){}

    private TravelPlan(Builder builder){
        this.destinationCountry = builder.destinationCountry;
        this.tripDuration = builder.tripDuration;
        this.accommodationType = builder.accommodationType;
        this.accommodationBudget = builder.accommodationBudget;
        this.transportationType = builder.transportationType;
        this.transportationBudget = builder.transportationBudget;
        this.foodBudget = builder.foodBudget;
        this.iteniraryDayActivity = builder.iteniraryDayActivity;
        this.currencyExchangeRate = builder.currencyExchangeRate;
        this.emergencyFund = builder.emergencyFund;
    }


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

    public double getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    public double getEmergencyFund() {
        return emergencyFund;
    }

    public static class Builder{
        private String destinationCountry;
        private int tripDuration;
        private String accommodationType;
        private double accommodationBudget;
        private String transportationType;
        private double transportationBudget;
        private double foodBudget;
        private String iteniraryDayActivity;
        private double currencyExchangeRate;
        private double emergencyFund;

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

        public Builder setCurrencyExchangeRate(double currencyExchangeRate) {
            this.currencyExchangeRate = currencyExchangeRate;
            return this;
        }

        public Builder setEmergencyFund(double emergencyFund) {
            this.emergencyFund = emergencyFund;
            return this;
        }

        public Builder copy(TravelPlan travelPlan){
            this.destinationCountry = travelPlan.destinationCountry;
            this.tripDuration = travelPlan.tripDuration;
            this.accommodationType = travelPlan.accommodationType;
            this.accommodationBudget = travelPlan.accommodationBudget;
            this.transportationType = travelPlan.transportationType;
            this.transportationBudget = travelPlan.transportationBudget;
            this.foodBudget = travelPlan.foodBudget;
            this.iteniraryDayActivity = travelPlan.iteniraryDayActivity;
            this.currencyExchangeRate = travelPlan.currencyExchangeRate;
            this.emergencyFund = travelPlan.emergencyFund;
            return this;
        }

        public TravelPlan build(){return new TravelPlan(this);}
    }
}
