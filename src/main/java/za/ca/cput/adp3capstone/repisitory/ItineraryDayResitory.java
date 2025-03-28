package za.ca.cput.adp3capstone.repisitory;
/* ItineraryDayRepository.java
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import za.ca.cput.adp3capstone.domain.ItineraryDay;

import java.util.HashMap;

public class ItineraryDayResitory implements I_ItineraryDayRepository{
    private static ItineraryDayResitory repository=null;
    private HashMap<Integer, ItineraryDay> itineraryDays;

    private ItineraryDayResitory(){
        itineraryDays = new HashMap<>();
    }
    public static ItineraryDayResitory getRepo(){
        if(repository==null){
            repository=new ItineraryDayResitory();
        }
        return repository;
    }

    @Override
    public ItineraryDay create(ItineraryDay itineraryDay) {
        if (itineraryDay == null || itineraryDay.getItineraryDayId() <= 0) {
            return null;
        }

        itineraryDays.put(itineraryDay.getItineraryDayId(), itineraryDay);
        return itineraryDay;
    }

    @Override
    public ItineraryDay update(Integer itineraryDayId, ItineraryDay new_itineraryDay) {
        if(!itineraryDays.containsKey(itineraryDayId)){
            return null;
        }
        itineraryDays.put(itineraryDayId, new_itineraryDay);
        return new_itineraryDay;

    }

    @Override
    public boolean delete(Integer itineraryDayId) {
        ItineraryDay deletedActivity = itineraryDays.remove(itineraryDayId);
        return deletedActivity!=null;
    }

    @Override
    public ItineraryDay get(Integer itineraryDayId) {
        return itineraryDays.get(itineraryDayId);
    }

    @Override
    public HashMap<Integer, ItineraryDay> findItineraryDays() {
        return new HashMap<>(itineraryDays);
    }
}
