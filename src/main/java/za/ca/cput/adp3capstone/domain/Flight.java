package za.ca.cput.adp3capstone.domain;

import java.util.List;

public class Flight {
    private String departure_airport;
    private String arrival_airport;
    private int duration;
    private String airplane;
    private String airline;
    private String travel_class;
    private String flight_number;
    private String legroom;
    private List<String> extensions;
    private boolean overnight;
    private double price;

    public Flight(Builder builder){
        departure_airport = builder.departure_airport;
        arrival_airport = builder.arrival_airport;
        duration = builder.duration;
        airplane = builder.airplane;
        travel_class = builder.travel_class;
        flight_number = builder.flight_number;
        extensions = builder.extensions;
        overnight = builder.overnight;
        price = builder.price;
    }

    public static class Builder{
        private String departure_airport;
        private String arrival_airport;
        private int duration;
        private String airplane;
        private String airline;
        private String travel_class;
        private String flight_number;
        private String legroom;
        private List<String> extensions;
        private boolean overnight;
        private double price;

        public void setDeparture_airport(String departure_airport) {
            this.departure_airport = departure_airport;
        }

        public void setArrival_airport(String arrival_airport) {
            this.arrival_airport = arrival_airport;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void setAirplane(String airplane) {
            this.airplane = airplane;
        }
        public void setTravel_class(String travel_class) {
            this.travel_class = travel_class;
        }

        public void setFlight_number(String flight_number) {
            this.flight_number = flight_number;
        }

        public void setLegroom(String legroom) {
            this.legroom = legroom;
        }

        public void setExtensions(List<String> extensions) {
            this.extensions = extensions;
        }

        public void setOvernight(boolean overnight) {
            this.overnight = overnight;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Flight build(){
            return new Flight(this);
        }
    }
}
