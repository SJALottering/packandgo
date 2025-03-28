package za.ca.cput.adp3capstone.repository;


import za.ca.cput.adp3capstone.domain.TravelPlan;
import za.ca.cput.adp3capstone.factory.TravelPlanFactory;

import java.io.IOException;
import java.util.HashMap;


public class TravelPlanRepository implements ITravelPlanRepository{

    private TravelPlanFactory travelPlanFactory;
    public static ITravelPlanRepository repository = null;
    private HashMap<TravelPlan, String> travelPlanHashMap;

    private TravelPlanRepository() throws IOException{
        travelPlanHashMap = new HashMap<TravelPlan, String>();
        repository = getRepository();
        travelPlanFactory = new TravelPlanFactory();
    }

    private static ITravelPlanRepository getRepository() throws IOException{
        if(repository == null) {
            repository = new TravelPlanRepository();
        }
        return repository;
    }

    @Override
    public TravelPlan get(String s) {
        return null;
    }

    @Override
    public TravelPlan create(TravelPlan travelPlan) {
        TravelPlan newTravelPlan = travelPlanFactory.createTravelPlan(
                travelPlan.getTravelPlanId()
                ,travelPlan.getDestinationCountry()
                ,travelPlan.getTripDuration()
                ,travelPlan.getAccommodationType()
                ,travelPlan.getAccommodationBudget()
                ,travelPlan.getTransportationType()
                ,travelPlan.getTransportationBudget()
                ,travelPlan.getFoodBudget()
                ,travelPlan.getIteniraryDayActivity()
                ,travelPlan.getCurrencyExchangeRate()
                ,travelPlan.getEmergencyFund()
        );
        return null;
    }

    @Override
    public TravelPlan update(String s) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public HashMap<String, TravelPlan> getAll(){
        return null;
    }
}