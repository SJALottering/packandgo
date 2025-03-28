package za.ca.cput.adp3capstone.domain;

import java.time.LocalDate;
import java.util.List;

public class Itinerary {
    private String itineraryId;
    private String travelPlanId;
    private int day;
    private LocalDate date;
    private String activities;

    public Itinerary() {
    }

    private Itinerary(Builder builder) {
        this.itineraryId = builder.itineraryId;
        this.travelPlanId = builder.travelPlanId;
        this.day = builder.day;
        this.date = builder.date;
        this.activities = builder.activities;
    }

    public String getItineraryId() {
        return itineraryId;
    }

    public String getTravelPlanId() {
        return travelPlanId;
    }

    public int getDay() {
        return day;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "Itinerary{" +
                "itineraryId='" + itineraryId + '\'' +
                ", travelPlanId='" + travelPlanId + '\'' +
                ", day=" + day +
                ", date=" + date +
                ", activities=" + activities +
                '}';
    }

    public static class Builder {
        private String itineraryId;
        private String travelPlanId;
        private int day;
        private LocalDate date;
        private String activities;

        public Builder setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }

        public Builder setTravelPlanId(String travelPlanId) {
            this.travelPlanId = travelPlanId;
            return this;
        }

        public Builder setDay(int day) {
            this.day = day;
            return this;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder setActivities(String activities) {
            this.activities = activities;
            return this;
        }

        public Builder copy(Itinerary itinerary) {
            this.itineraryId = itinerary.itineraryId;
            this.travelPlanId = itinerary.travelPlanId;
            this.day = itinerary.day;
            this.date = itinerary.date;
            this.activities = itinerary.activities;
            return this;
        }

        public Itinerary build() {
            return new Itinerary(this);
        }
    }
}