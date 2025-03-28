package za.ca.cput.adp3capstone.factory;

import za.ca.cput.adp3capstone.domain.Flight;
import za.ca.cput.adp3capstone.util.Helper;

public class FlightFactory {
    private Helper helper =new Helper();

    public static Flight createFlight(int flightId, String departureAirport, String arrivalAirport, int duration,
                                      String airplane, String airline, String travelClass,
                                      String flightNumber, String legroom,
                                      boolean overnight, double price){
        if(Helper.isStringNullOrEmpty(departureAirport)
            || Helper.isStringNullOrEmpty(arrivalAirport)
            || Helper.isStringNullOrEmpty(airplane)
            || Helper.isStringNullOrEmpty(airline)
            || Helper.isStringNullOrEmpty(travelClass)
            || Helper.isStringNullOrEmpty(flightNumber)
            || Helper.isStringNullOrEmpty(legroom)
            || Helper.isDoubleNull(price)
            ||Helper.isDoubleNull(flightId)
            || Helper.isIntNull(duration)
        )
        {
            return null;
        }
        return new Flight.Builder()
                .setFlightId(flightId)
                .setDeparture_airport(departureAirport)
                .setArrival_airport(arrivalAirport)
                .setDuration(duration)
                .setAirplane(airplane)
                .setAirline(airline)
                .setTravel_class(travelClass)
                .setFlight_number(flightNumber)
                .setLegroom(legroom)
                .setOvernight(overnight)
                .setPrice(price)
                .build();
    }
}
