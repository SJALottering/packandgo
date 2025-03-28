package za.ca.cput.adp3capstone.repisitory;
/* TravelPlan.java
TravelPLan Repository class
Author: Brezano Liebenberg (230463886)
Date: 28 March 2025
 */

import za.ca.cput.adp3capstone.domain.TravelPlan;

import java.util.HashMap;

public class TravelPlanRepository implements ITravelPlanRepository{

    public static ITravelPlanRepository repository = null;
    private HashMap<String ,TravelPlan> travelPlanHashMap;

    private TravelPlanRepository(){
        travelPlanHashMap = new HashMap<String, TravelPlan>();
    }

    public static ITravelPlanRepository getRepository(){
        if(repository == null) {
            repository = new TravelPlanRepository();
        }
        return repository;
    }

    @Override
    public TravelPlan get(String travelPlanId) {
        return travelPlanHashMap.get(travelPlanId);
    }

    @Override
    public TravelPlan create(TravelPlan travelPlan) {
        if(travelPlan == null){
        return null;
        }
        travelPlanHashMap.put(travelPlan.getTravelPlanId(), travelPlan);
        return travelPlan;
    }

    @Override
    public TravelPlan update(String travelPlanId, TravelPlan newTravelPlanId) {
        TravelPlan travelPlan = travelPlanHashMap.get(travelPlanId);

        TravelPlan updatedTravelPlan = newTravelPlanId;

        travelPlanHashMap.put(travelPlanId, updatedTravelPlan);
        return null;
    }

    @Override
    public boolean delete(String travelPlanId) {
        TravelPlan travelPlan = travelPlanHashMap.get(travelPlanId);
        if(travelPlan == null){
            return false;
        }
        travelPlanHashMap.remove(travelPlanId);
        return true;
    }

    @Override
    public HashMap<String, TravelPlan> getAll(){
        return null;
    }
}

